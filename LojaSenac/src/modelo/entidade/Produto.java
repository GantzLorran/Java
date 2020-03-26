
package modelo.entidade;

import static java.rmi.server.RemoteRef.serialVersionUID;
import java.util.Objects;


public class Produto {
    
    private int cdProduto;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;
    
    
    public Produto(){
        
    }

    public Produto(int cdProduto, String nome, double preco, int quantidade, Categoria categoria) {
        this.cdProduto = cdProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.cdProduto;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        hash = 97 * hash + this.quantidade;
        hash = 97 * hash + Objects.hashCode(this.categoria);
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
        final Produto other = (Produto) obj;
        if (this.cdProduto != other.cdProduto) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }
    
    
    
    public int getCdProduto(){
        return cdProduto;
    }
    public void setCdProduto(int cdProduto){
        this.cdProduto = cdProduto;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "cdProduto=" + cdProduto + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", categoria=" + categoria + '}';
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public Categoria getCdCategoria(){
        return categoria;
    }
    public void setCdCategoria(Categoria categoria){
        this.categoria = categoria;
    }    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
    