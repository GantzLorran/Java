package aula011;
public class Aula011 {
    public static void main(String[] args) {
        //Pesosa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setMatricula(11111111);
        a1.setCurso("Informática");
        a1.setIdade(23);
        a1.setSexo("M");
        
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1111112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
    
}
