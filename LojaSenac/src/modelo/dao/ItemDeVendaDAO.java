
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.entidade.ItemdeVenda;
import modelo.entidade.Produto;
import modelo.entidade.Venda;


public class ItemDeVendaDAO {
    
    private Connection connection;
    
    public Connection getConnection(){
        return connection;
    }
    public void setConnection(Connection connection){
        this.connection = connection;  
    }
    
    public boolean inserir(ItemdeVenda itemDeVenda){
        String sql = "INSERT INTO itemdevenda (quantidade, valor, cdProduto, cdVenda, VALUES (?,?,?,?))";
        try{
             PreparedStatement stmt = connection.prepareStatement(sql);
             stmt.setInt(1, itemDeVenda.getQuantidade());
             stmt.setDouble(2, itemDeVenda.getValor());
             stmt.setInt(3, itemDeVenda.getProduto().getCdProduto());
             stmt.setInt(4, itemDeVenda.getVenda().getCdVenda());
             stmt.execute();
             return true;
        }catch (SQLException ex){
            Logger.getLogger(ItemDeVendaDAO.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
    }
    public boolean alterar(ItemdeVenda itemDeVenda){
        return true;
    }
    
    public boolean remover(ItemdeVenda itemDeVenda){
        String sql = "DELET FROM itemdevenda WHERE cdItemdeVenda=?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, itemDeVenda.getCdItemDeVenda());
            stmt.execute();
            return true;
        }catch (SQLException ex){
            Logger.getLogger(ItemDeVendaDAO.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
    }
    public List<ItemdeVenda> listar(){
        String sql = "SELECT + FROM itemdevenda";
        List<ItemdeVenda> retorno = new ArrayList<ItemdeVenda>();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while(resultado.next())
            {
                ItemdeVenda itemDeVenda = new ItemdeVenda();
                Produto produto = new Produto();
                Venda venda = new Venda();
                itemDeVenda.setCdItemDeVenda(resultado.getInt("cdItemDeVenda"));
                itemDeVenda.setQuantidade(resultado.getInt("quantidade"));
                itemDeVenda.setValor(resultado.getDouble("valor"));
                
                produto.setCdProduto(resultado.getInt("cdProduto"));
                venda.setCdVenda(resultado.getInt("cdVenda"));
                
                ProdutoDAO produtoDao = new ProdutoDAO();
                produtoDao.setConnection(connection);
                produto = produtoDao.buscar(produto);
                
                VendaDAO vendaDao = new VendaDAO();
                vendaDao.setConnection(connection);
                venda = vendaDao.buscar(venda);
                
                itemDeVenda.setProduto(produto);
                itemDeVenda.setVenda(venda);
                
                retorno.add(itemDeVenda);
            }
        }catch (SQLException ex){
            Logger.getLogger(ItemDeVendaDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return retorno;
    }
    public List<ItemdeVenda> listarPorVenda(Venda venda){
        String sql = "SELECT * FROM itemdevenda WHERE cdVenda=?";
        List<ItemdeVenda> retorno = new ArrayList<ItemdeVenda>();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, venda.getCdVenda());
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next())
            {
                Venda v = new Venda();
                Produto produto = new Produto();
                ItemdeVenda itemDeVenda = new ItemdeVenda();
                itemDeVenda.setCdItemDeVenda(resultado.getInt("cdItemdeVenda"));
                itemDeVenda.setQuantidade(resultado.getInt("quantidade"));
                itemDeVenda.setValor(resultado.getDouble("valor"));
                
                produto.setCdProduto(resultado.getInt("cdProduto"));
                v.setCdVenda(resultado.getInt("cdVenda"));
                
                //Obter imformação completas de Produtos e Vendas associadas a itens de Venda
                ProdutoDAO produtoDao = new ProdutoDAO();
                produtoDao.setConnection(connection);
                produto = produtoDao.buscar(produto);
                
                VendaDAO vendaDao = new VendaDAO();
                vendaDao.setConnection(connection);
                v = vendaDao.buscar(v);
                
                itemDeVenda.setProduto(produto);
                itemDeVenda.setVenda(v);
                retorno.add(itemDeVenda);
            }
        }catch (SQLException ex){
            Logger.getLogger(ItemDeVendaDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return retorno;
    }
    
    public ItemdeVenda buscar(ItemdeVenda itemDeVenda){
        String sql = "SELECT * FROM itemdevenda WHERE cdItemDeVenda=?";
        ItemdeVenda retorno = new ItemdeVenda();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, itemDeVenda.getCdItemDeVenda());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()){
                Venda venda = new Venda();
                Produto produto = new Produto();
                itemDeVenda.setCdItemDeVenda(resultado.getInt("cdItemDeVenda"));
                itemDeVenda.setQuantidade(resultado.getInt("quantidade"));
                itemDeVenda.setValor(resultado.getDouble("valor"));
                
                produto.setCdProduto(resultado.getInt("cdProduto"));
                venda.setCdVenda(resultado.getInt("cdVenda"));
                
                //Pegando todas as imforamações de produtos e vendas
                ProdutoDAO produtoDao = new ProdutoDAO();
                produtoDao.setConnection(connection);
                produto = produtoDao.buscar(produto);
                itemDeVenda.setProduto(produto);
                
                VendaDAO vendaDao = new VendaDAO();
                vendaDao.setConnection(connection);
                venda = vendaDao.buscar(venda);
                itemDeVenda.setVenda(venda);
                retorno = itemDeVenda;
            }
        }catch (Exception ex){
            Logger.getLogger(ItemDeVendaDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return retorno;
    }
}
