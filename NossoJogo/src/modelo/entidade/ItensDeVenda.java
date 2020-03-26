
package modelo.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItensDeVenda implements Serializable{
    private static final long serialVersionUID = 1L;
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }    
    private int cdIdVenda;
    private int cdProduto;
    private int quantidade;
    private int estoque;
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nome_cliente", nullable=false )
    public int getCdIdVenda() {
        return cdIdVenda;
    }

    public void setCdIdVenda(int cdIdVenda) {
        this.cdIdVenda = cdIdVenda;
    }

    public int getCdProduto() {
        return cdProduto;
    }

    public void setCdProduto(int cdProduto) {
        this.cdProduto = cdProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
