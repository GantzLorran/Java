
package modelo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.entidade.Categoria;
import modelo.entidade.Venda;


class VendaDAO {
    
    private Connection connection;

    void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public boolean inserir(Venda venda){
        String sql = "INSERT INTO venda (data, valor, pago, cdCliente VALUES(?,?,?,?))";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDate(1, Date.valueOf(venda.getData()));
            stmt.setDouble(2, venda.getValor());
            stmt.setBoolean(3, venda.getPago());
            stmt.setInt(4, venda.getCliente().getCdCliente());
            stmt.execute();
            return true;
        }catch (SQLException ex){
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean alterar(){
        
    }
    
    public boolean remover(){
        
    }
    
    public List<Venda> listar(){
        
    }
    
    public Venda buscar(Venda venda){
        
    }
    
    public Venda buscarUltimaVenda(){
        
    }
    
    public Map<Integer, ArrayList> listarQuantidadedeVendasPorMes(){
        
    }

    Venda buscar(Venda venda)
    {
           
    }
    
}
