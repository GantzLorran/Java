
package modeloDAO;

import cliente.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
    
    private Connection connection;
    
    
    public Connection getConnection(){
        return this.connection;
    }
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    public boolean inserir(Cliente Cliente){
        String sql= "INSERIR INTO categoria(descrição) VALUES(?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            return true;
        }catch (SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}