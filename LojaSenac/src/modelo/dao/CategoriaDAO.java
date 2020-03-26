
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.entidade.Categoria;
import sun.util.logging.PlatformLogger;


public class CategoriaDAO {
    
    private Connection connection;
    
    
    public Connection getConnection(){
        return this.connection;
    }
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    
    public boolean inserir(Categoria categoria){
        String sql= "INSERIR INTO categoria(descrição) VALUES(?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            stmt.setInt(2, categoria.getCdCategoria());
            stmt.execute();
            return true;
        }catch (SQLException ex){
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean alterar(Categoria categoria){
        String sql = "UPDATE categoria SET descrição=? WHERE cdCategoria";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            stmt.setInt(2, categoria.getCdCategoria());
            stmt.execute();
            
        }catch (SQLException ex){
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
         return false;
    }
    public boolean remover(Categoria categoria){
        String sql = "DELETE FROM categoria WHERE cdCategoria=?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            stmt.setInt(2, categoria.getCdCategoria());
            stmt.execute();
        }catch (SQLException ex){
             Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);  
        }
        return false;
        }
    
        public List<Categoria> listar(){
            String sql = "SELECT * categoria";
            List<Categoria> retorno = new ArrayList<Categoria>();
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                ResultSet resultado = stmt.executeQuery();
                while (resultado.next()){
                    Categoria categoria = new Categoria();
                    categoria.setCdCategoria(resultado.getInt("cdCategoria"));
                    categoria.cdDescricao(resultado.getString("descricao"));
                    retorno.add(categoria);
                }
            }catch (SQLException ex){
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return retorno;
        }
    public Categoria buscar(Categoria categoria){
        String sql = "SELECT * FROM categoria WHERE cdCategoria=?";
        Categoria retorno = new Categoria();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()){
               categoria.cdDescricao(resultado.getString("descricao"));
            }
            
        }catch (SQLException ex){
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
