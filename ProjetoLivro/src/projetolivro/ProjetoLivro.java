package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Lorran", 23, "M");
        p[1] = new Pessoa("Hanna", 22, "F");
        p[2] = new Pessoa("Nai", 16, "F");
        
        l[0] = new Livro("Aprendendo Java", "Lorran Antonio Rodrigues", 250, p[0]);
        l[1] = new Livro("POO em java", "Hanna Hillfei", 400, p[1]);
        l[2] = new Livro("POO em Python", "Nai", 270, p[2]);
        
        System.out.println(l[0].detalhes());
    }
}
