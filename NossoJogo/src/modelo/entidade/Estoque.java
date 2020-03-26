
package modelo.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estoque implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="nome_cliente", nullable=false )
    private int idFornecedor;
    private String cdnome;
    private int quantidade;
    private int cdProduto;
    private int descricao;
    private static final long serialVersionUID = 1L;
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    public int getCdFornecedor() {
        return idFornecedor;
    }

    public void setCdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getCdnome() {
        return cdnome;
    }

    public void setCdnome(String cdnome) {
        this.cdnome = cdnome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCdProduto() {
        return cdProduto;
    }

    public void setCdProduto(int cdProduto) {
        this.cdProduto = cdProduto;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }
    
    
}
