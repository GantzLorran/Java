
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.entidade.Cliente;


public class ClienteDAO {
    
    private Connection connection;
    
    
    public void setConnection(Connection connection){
        this.connection = connection;
        
    }
    public Connection getConnection(){
        return this.connection;
        
    }
    
    public boolean inserir(Cliente cliente){
        String sql = "INSERT INTO cliente(nome, cpf, telefone)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.execute();
            return true;
        }catch(SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
        
}
        public boolean alterar(Cliente cliente){
            String sql = "UPDATE cliente SET nome=?, cpf=?, telefone=? WHERE cdCliente=?";
             try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getCdCliente());
            stmt.execute();
            return true;
        }catch(SQLException ex){
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
        }
        public boolean remover(Cliente cliente){
            String sql = "DELETE FROM cliente WHERE cdCliente=?";
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.execute();
                return true;
            }catch (SQLException ex){
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,null,ex);
                return false;
            }
        }
        public List<Cliente> listarCliente(){
            String sql = "SELECT * FROM cliente";
            List<Cliente> retorno = new ArrayList<Cliente>();
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                ResultSet resultado = stmt.executeQuery();
                while(resultado.next()){
                    Cliente cliente = new Cliente();
                    cliente.setCdCliente(resultado.getInt("cdCliente"));
                    cliente.setNome(resultado.getString("nome"));
                    cliente.setCpf(resultado.getString("cpf"));
                    cliente.setTelefone(resultado.getString("telefone"));
                    retorno.add(cliente);
                }
            }catch (SQLException ex){
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,null,ex);
            }
            return retorno;
        }
        public Cliente buscarCliente(Cliente cliente){
            Cliente retorno = new Cliente();
            String sql = "SELECT * FROM cliente WHERE cdCliente=?";
            try {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, cliente.getCdCliente());
                ResultSet resultado = stmt.executeQuery();
                if(resultado.next()){
                    cliente.setNome(resultado.getString("nome"));
                    cliente.setCpf(resultado.getString("cpf"));
                    cliente.setTelefone(resultado.getString("telefone"));
                    retorno = cliente;
                    
                }
            }catch (SQLException ex){
                 Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE,null,ex);
            }
            return retorno;
        }
}
