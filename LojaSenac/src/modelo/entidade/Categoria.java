
package modelo.entidade;

import static java.rmi.server.RemoteRef.serialVersionUID;
import java.util.Objects;


public class Categoria {
    
    private int cdCategoria;
    private String descricao;
    
    
    public Categoria(){
        
    }

    public Categoria(int cdCategoria, String descricao) {
        this.cdCategoria = cdCategoria;
        this.descricao = descricao;
    }
    

    @Override
    public String toString() {
        return "Categoria{" + "cdCategoria=" + cdCategoria + ", descricao=" + descricao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.cdCategoria;
        hash = 23 * hash + Objects.hashCode(this.descricao);
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
        final Categoria other = (Categoria) obj;
        if (this.cdCategoria != other.cdCategoria) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
    
    
    
    public int getCdCategoria(){
        return cdCategoria;
    }
    public void setCdCategoria(int cdCategoria){
        this.cdCategoria = cdCategoria;
    }
    
    public String getDescricao(){
        return descricao;
    }
    public void cdDescricao(String cdDescricao){
        this.descricao = cdDescricao;
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
