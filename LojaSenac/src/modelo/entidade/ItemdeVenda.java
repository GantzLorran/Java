
package modelo.entidade;

import static java.rmi.server.RemoteRef.serialVersionUID;
import java.util.Objects;


public class ItemdeVenda {
    
    private int cditemdeVenda;

    @Override
    public String toString() {
        return "ItemdeVenda{" + "cditemdeVenda=" + cditemdeVenda + ", quantidade=" + quantidade + ", valor=" + valor + ", produto=" + produto + ", venda=" + venda + '}';
    }
    private int quantidade;
    private double valor;
    private Produto produto;
    private Venda venda;
    
    
    public ItemdeVenda(){
        
    }

    public ItemdeVenda(int cditemdeVenda, int quantidade, double valor, Produto produto, Venda venda) {
        this.cditemdeVenda = cditemdeVenda;
        this.quantidade = quantidade;
        this.valor = valor;
        this.produto = produto;
        this.venda = venda;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.cditemdeVenda;
        hash = 23 * hash + this.quantidade;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.produto);
        hash = 23 * hash + Objects.hashCode(this.venda);
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
        final ItemdeVenda other = (ItemdeVenda) obj;
        if (this.cditemdeVenda != other.cditemdeVenda) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.venda, other.venda)) {
            return false;
        }
        return true;
    }
    
    
    public int getCdItemDeVenda(){
        return cditemdeVenda;
    }
    public void setCdItemDeVenda(int cditemdeVenda){
        this.cditemdeVenda = cditemdeVenda;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public Produto getProduto(){
        return produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public Venda getVenda(){
        return venda;
    }
    public void setVenda(Venda venda){
        this.venda = venda;
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}

