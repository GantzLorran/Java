
package modelo.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Venda implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cdVenda;
        
    private int quantidade;
    private double preco;
    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    private Cliente cliente;
    
    @OneToMany
    private List<Produtos> produtos;
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    public int getCdVenda() {
        return cdVenda;
    }

    public void setCdVenda(int cdVenda) {
        this.cdVenda = cdVenda;
    }
   
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
