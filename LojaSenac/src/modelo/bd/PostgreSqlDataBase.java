
package modelo.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;

public class PostgreSqlDataBase implements DataBase {
    
//ATRIBUTO DA CLASSE CONCRETA
    private Connection connection;
    private static final String url = "jdbc:mysql://localhost: 3306/lojasenac";
    private static final String root = "root";
    private static final String pws = "";
    JOptionPane jopP = new JOptionPane();    
    
    //METODOS DE IMPLEMENTAÇÃO
    @Override
    public Connection conectar(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           this.connection = DriverManager.getConnection("url","root" ,"pws" );
           jopP.showMessageDialog(null,"Conectou brow");
           return this.connection;
        }catch(SQLException | ClassNotFoundException ex){
        Logger.getLogger(MySqlDataBase.class.getName()).log(Level.SEVERE, null, ex);
        jopP.showMessageDialog(null,"Xiiiiiiiiii");
        return this.connection;
        }
    }
    @Override
    public void desconectar(Connection connection){
        
    }
}
