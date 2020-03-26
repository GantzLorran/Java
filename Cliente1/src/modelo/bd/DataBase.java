
package modelo.bd;

import java.sql.Connection;
import java.sql.Connection;

public interface DataBase {
    
    public Connection conectar();
    public void desconectar(Connection connection);
        
    
}
