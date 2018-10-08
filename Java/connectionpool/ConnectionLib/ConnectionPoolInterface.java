
package ConnectionLib; 

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface ConnectionPoolInterface 
{
    List<Connection> getConnectionPool();
    
    Connection getConnection() throws SQLException;

    boolean releaseConnection(Connection connection);

    int getSize();

    String getUrl();

    String getUser();

    String getPassword();

    void shutdown() throws SQLException;;
}  
