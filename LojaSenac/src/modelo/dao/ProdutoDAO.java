
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
import modelo.entidade.Produto;
import sun.util.logging.PlatformLogger;

public class ProdutoDAO {
    
    private Connection connection;
    
    public Connection getConnection(){
        return this.connection;
    }
    
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    
    public boolean inserir(Produto produto){
        String sql = "INSERT INTO produto (nome,preco,quantidade,cdCategoria) VALUES(?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getCdCategoria().getCdCategoria());
            return true;
        }catch (SQLException ex){
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean alterar(Produto produto){
        String sql = "UPDATE produto SET nome=?, preco=?, quantidade=?, cdCategoria=? WHERE cdProduto=?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getCdCategoria().getCdCategoria());
            stmt.setInt(5, produto.getCdProduto());
            return true;
        }catch (SQLException ex){
            
        }
        return false;
    }
    public boolean remover(Produto produto){
        String sql = "DELETE FROM produto WHERE cdProduto=?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setInt(4, produto.getCdCategoria().getCdCategoria());
            stmt.setInt(5, produto.getCdProduto());
            return true;
        }catch (SQLException ex){
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public List<Produto> listar(){
        String sql = "SELECT * FROM produto";
        List<Produto> retorno = new ArrayList<Produto>();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()){
                Produto produto = new Produto();
                Categoria categoria = new Categoria();
                produto.setCdProduto(resultado.getInt("cdProduto"));
                produto.setNome(resultado.getString("nome"));
                produto.setPreco(resultado.getInt("preco"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                categoria.setCdCategoria(resultado.getInt("cdCategoria"));
            }
        }catch (SQLException ex){
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    public List<Produto> ListarPorCategoria(Categoria categoria){
        String sql = "SELECT * FROM produto WHERE cdCategoria=?";
        List<Produto> retorno = new ArrayList<Produto>();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, categoria.getCdCategoria());
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()){
                Produto produto = new Produto();
                produto.setCdProduto(resultado.getInt("cdProduto"));
                produto.setNome(resultado.getString("nome"));
                produto.setPreco(resultado.getInt("preco"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                categoria.setCdCategoria(resultado.getInt("cdCategoria"));
                produto.setCdCategoria(categoria);
                retorno.add(produto);
            }
        }catch (SQLException ex){
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    public Produto buscar(Produto produto){
        String sql = "SELECT * FROM produto WHERE cdProduto=?";
        Produto retorno = new Produto();
        Categoria categoria = new Categoria();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, produto.getCdProduto());
            ResultSet resultado = stmt.executeQuery();
            if(resultado.next())
            {
                produto.setCdProduto(resultado.getInt("cdProduto"));
                produto.setNome(resultado.getString("nome"));
                produto.setPreco(resultado.getDouble("preco"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                categoria.setCdCategoria(resultado.getInt("cdCategoria"));
                retorno.setCdCategoria(categoria);
            }
        }catch (SQLException ex){
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
}
