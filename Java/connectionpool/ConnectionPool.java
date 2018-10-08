/**
@file: ConnectionPool
@author: Arun Dhwaj
@date: 8th Oct'2018
@pupose: Implementing own connection pool
*/

package ConnectionLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConnectionLib.ConnectionPoolInterface;

public class ConnectionPool implements ConnectionPoolInterface 
{
    ///////////////////////////////////////////
    //Connection meta-data
    
    private final String url;
    private final String user;
    private final String password;

    private static final int INITIAL_POOL_SIZE = 10;
    private final int MAX_POOL_SIZE = 20;
        
    ////////////////////////////////////////////
    // List of connection

    private final List<Connection> connectionPool;
    private final List<Connection> usedConnections = new ArrayList<>();

    /////////////////////////////////////////////Constructor ////////////

    private ConnectionPool(String url, String user, String password, List<Connection> connectionPool) 
    {
        this.url = url;
        this.user = user;
        this.password = password;
        this.connectionPool = connectionPool;
    }
    
    /////////////////////////////////////////////////////////////////////////
    public static ConnectionPool createPool(String url, String user, String password) throws SQLException 
    {
        List<Connection> pool = new ArrayList<>(INITIAL_POOL_SIZE);
        
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) 
        {
            pool.add(createConnection(url, user, password));
        }

        return new ConnectionPool(url, user, password, pool);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Create a connection using Driver Client, Like: DriverManager
    private static Connection createConnection(String url, String user, String password) throws SQLException 
    {
        return DriverManager.getConnection(url, user, password);
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public Connection getConnection() throws SQLException 
    {
        if (connectionPool.isEmpty()) 
        {
            if (usedConnections.size() < MAX_POOL_SIZE) 
            {
                connectionPool.add(createConnection(url, user, password));
            } 
            else 
            {
                throw new RuntimeException("Maximum pool size reached, no available connections!");
            }
        }

        Connection connection = connectionPool.remove(connectionPool.size() - 1);
        usedConnections.add(connection);
        return connection;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///// Releasing the connection. After release it will go to pool.
    @Override
    public boolean releaseConnection(Connection connection) 
    {
        connectionPool.add(connection);
        return usedConnections.remove(connection);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///// In the case of Shutting down: all the connection in pool and usedConnections list should be closed. 
    @Override
    public void shutdown() throws SQLException 
    {
        usedConnections.forEach(this::releaseConnection);
        
        for (Connection c : connectionPool) 
        {
            c.close();
        }
        connectionPool.clear();
    }

    @Override
    public int getSize() 
    {
        return connectionPool.size() + usedConnections.size();
    }

    @Override
    public List<Connection> getConnectionPool() 
    {
        return connectionPool;
    }

    @Override
    public String getUrl() 
    {
        return url;
    }

    @Override
    public String getUser() 
    {
        return user;
    }

    @Override
    public String getPassword() 
    {
        return password;
    }
}
