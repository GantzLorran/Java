
package modelo.entidade;

import java.io.Serializable;
import static java.rmi.server.RemoteRef.serialVersionUID;
import java.util.Objects;


public class Cliente implements Serializable {
    
    private int cdCliente;
    private String nome;
    private String cpf;
    private String telefone;
   
    
    public Cliente(){
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "cdCliente=" + cdCliente + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.cdCliente;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.telefone);
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
        final Cliente other = (Cliente) obj;
        if (this.cdCliente != other.cdCliente) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return true;
    }

    public Cliente(int cdCliente, String nome, String cpf, String telefone) {
        this.cdCliente = cdCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public int getCdCliente(){
        return cdCliente;
    }
    public void setCdCliente(int cdCliente){
        this.cdCliente = cdCliente;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone( String telefone){
        this.telefone = telefone;
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
