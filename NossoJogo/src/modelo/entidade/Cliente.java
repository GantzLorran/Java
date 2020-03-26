package modelo.entidade;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private int codigo;

    @Column(nullable = false)
    private String nome;

    private String cpf;

    private int tel;

    private int endereco;

    private int senha;

    private int email;

    @OneToMany(mappedBy ="cliente")
    private List<Venda> vendas;

    public Cliente() {

    }

    public Cliente(String nome, int endereco, String cpf, int tel, int senha, int email) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.tel = tel;
        this.senha = senha;
        this.email = email;
    }

    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.codigo;
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Objects.hashCode(this.cpf);
        hash = 19 * hash + this.tel;
        hash = 19 * hash + this.endereco;
        hash = 19 * hash + this.senha;
        hash = 19 * hash + this.email;
        hash = 19 * hash + Objects.hashCode(this.vendas);
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
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.tel != other.tel) {
            return false;
        }
        if (this.endereco != other.endereco) {
            return false;
        }
        if (this.senha != other.senha) {
            return false;
        }
        if (this.email != other.email) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.vendas, other.vendas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", tel=" + tel + ", endereco=" + endereco + ", senha=" + senha + ", email=" + email + ", vendas=" + vendas + '}';
    }

}
