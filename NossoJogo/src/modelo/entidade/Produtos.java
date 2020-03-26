
package modelo.entidade;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Produtos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cdProduto;
    
    private double valor;
    private int quantidade;
    private int DataEntrada;
    private int DataSaida;
    
    private static final long serialVersionUID = 1L;
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    public int getCdProduto() {
        return cdProduto;
    }

    public void setCdProduto(int cdProduto) {
        this.cdProduto = cdProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getDataEntrada() {
        return DataEntrada;
    }

    public void setDataEntrada(int DataEntrada) {
        this.DataEntrada = DataEntrada;
    }

    public int getDataSaida() {
        return DataSaida;
    }

    public void setDataSaida(int DataSaida) {
        this.DataSaida = DataSaida;
    }

    
}
