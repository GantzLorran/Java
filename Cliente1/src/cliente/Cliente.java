
package cliente;

public class Cliente {
    private String nome;
    int telefone;
    private String cpf;
    private String email;
    String  endereço;
    private String DataDeNascimento;
    
    
    public static void main(String[] args){


}
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }
}
//escolha um conjunto de atributos e métodos para construir uma classe Cliente e desenvolva uma tela de cadastro, e as Classes necessárias 
//para realizar o cadastro em um banco de dados.
//OBS: O nome do projeto é uma escolha sua e você deve seguir as nomeclaturas do java.