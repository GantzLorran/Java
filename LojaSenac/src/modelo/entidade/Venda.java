
package modelo.entidade;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


public class Venda implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private int cdVenda;
    private LocalDate data;
    private double valor;
    private boolean pago;
    private List<ItemdeVenda> itensdeVenda;
    private Cliente cliente;
    
    
    public Venda(){
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.cdVenda;
        hash = 67 * hash + Objects.hashCode(this.data);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 67 * hash + (this.pago ? 1 : 0);
        hash = 67 * hash + Objects.hashCode(this.itensdeVenda);
        hash = 67 * hash + Objects.hashCode(this.cliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        if (this.cdVenda != other.cdVenda) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (this.pago != other.pago) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.itensdeVenda, other.itensdeVenda)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "cdVenda=" + cdVenda + ", data=" + data + ", valor=" + valor + ", pago=" + pago + ", itensdeVenda=" + itensdeVenda + ", cliente=" + cliente + '}';
    }

    public Venda(int cdVenda, LocalDate data, double valor, boolean pago, List<ItemdeVenda> itensdeVenda, Cliente cliente) {
        this.cdVenda = cdVenda;
        this.data = data;
        this.valor = valor;
        this.pago = pago;
        this.itensdeVenda = itensdeVenda;
        this.cliente = cliente;
    }
    
    
    
    public int getCdVenda(){
        return cdVenda;
    }
    public void setCdVenda(int cdVenda){
        this.cdVenda = cdVenda;
    }
    
    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }
    
    public double getValor(){
        return valor;
    }
    public void setData(double valor){
        this.valor = valor;
    }
    
    public boolean getPago(){
        return pago;
    }
    public void setPago(boolean pago){
        this.pago = pago;
    }
    
    public List<ItemdeVenda> getItensdeVenda(){
        return this.itensdeVenda;
    }
    public void setItensdeVenda(List<ItemdeVenda> itensdeVenda){
        this.itensdeVenda = itensdeVenda;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    
}
