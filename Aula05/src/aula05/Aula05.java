package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1996);
        p1.setDono("Lorran");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1997);
        p2.setDono("Nicole Guarana");
        p2.abrirConta("CP");
        
        p1.depositar(15000);
        p2.depositar(800);
        
        p1.sacar(19000);
        p2.sacar(200);
        
        p1.estadoAtual();//mostra o método construtor que esta no ContaBanco chamado estadoAtual();
        p2.estadoAtual();//mostra o método construtor que esta no ContaBanco chamado estadoAtual();
    }
    
}
