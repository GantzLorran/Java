package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Lorran");
        p2.setNome("Hanna");
        p3.setNome("Naiane");
        p4.setNome("Nicole");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("F");
        
        p1.setIdade(23);
        p2.setIdade(22);
        p3.setIdade(17);
        p4.setIdade(13);
        
        p2.setCurso("informática");
        p3.setSalario(5000.00f);
        p4.setSetor("Programador");
        
        //p1.receberAumento(550.20f);
        //p2.mudarTrabalho();
        //p4.cancelarMatr();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
