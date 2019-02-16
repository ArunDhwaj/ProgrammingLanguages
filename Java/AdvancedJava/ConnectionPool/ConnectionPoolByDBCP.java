/*
@author: Arun Dhwaj
@date: 15th Feb, 2019
@purpose: Database connectionPool using Apache Commons DBCP library.
*/

import org.apache.commons.dbcp.ConnectionFactory;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDataSource;
import org.apache.commons.pool.impl.GenericObjectPool;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionPoolByDBCP 
{
    public static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost/MyTestDB";
    public static final String DB_USERNAME = "sbp";
    public static final String DB_PASSWORD = "sbp123";

    private GenericObjectPool myConnectionPool = null;

    public DataSource setUp() throws Exception 
    {
        /*
        *Step-1: Load JDBC Driver class.
        */
        Class.forName(ConnectionPoolByDBCP.DB_DRIVER).newInstance();

        /*
        *Step-2: Creates an instance of GenericObjectPool that holds our pool of connections object.
        */
        myConnectionPool = new GenericObjectPool();
        myConnectionPool.setMaxActive(10);
        
        /*
        *Step-3: Creates a connection factory object which will be use by the pool to create the connection object. We passes the JDBC url info, username and password.
        */
        ConnectionFactory myCf = new DriverManagerConnectionFactory( ConnectionPoolByDBCP.DB_URL, ConnectionPoolByDBCP.DB_USERNAME, ConnectionPoolByDBCP.DB_PASSWORD);

        /*
        *Step-4: Creates a PoolableConnectionFactory that will wraps the connection object created by the ConnectionFactory to add object pooling functionality.
        */
        PoolableConnectionFactory myPcf = new PoolableConnectionFactory(myCf, myConnectionPool, null, null, false, true);

        /*
        *Step-5: Returning the PoolingDataSource (this is from apache commons.DBCP package)  
        */

        return new PoolingDataSource(MyConnectionPool);
    }

    public GenericObjectPool getConnectionPool() 
    {
        return myConnectionPool;
    }

    public static void main(String[] args) throws Exception 
    {
        /*
        *Step-6: Getting the instance of ConnectionPoolByDBCP.
        */ 
        ConnectionPoolByDBCP connectionPoolByDBCP = new ConnectionPoolByDBCP();
        
        /*
        *Step-7: Setting the DataSource from DBCP and stroing in the DataSource of javax.sql.DataSource.
        */ 
        DataSource ds_by_javax = connectionPoolByDBCP.setUp();
        connectionPoolByDBCP.printStatus();

        /*
        *Step-8: Declaring the Connection Object from java.sql.Connection.
        */ 
        Connection conn = null;
        PreparedStatement stmt = null;

        try 
        {
            conn = ds_by_javax.getConnection();
            connectionPoolByDBCP.printStatus();

            stmt = conn.prepareStatement("SELECT * FROM Test_users");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) 
            {
                System.out.println("Name: " + rs.getString("Name"));
                System.out.println("Age: " + rs.getString("Age"));
            }
        } 
        finally 
        {
            if (stmt != null) 
            {
                stmt.close();
            }
            
            if (conn != null) 
            {
                conn.close();
            }
        }

        connectionPoolByDBCP.printStatus();
    }

    /**
    * Prints connection pool status.
    */
    private void printStatus() 
    {
        System.out.println("Max   : " + getConnectionPool().getMaxActive() + "; " +
        "Active: " + getConnectionPool().getNumActive() + "; " +
        "Idle  : " + getConnectionPool().getNumIdle());
    }
}

