package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO ");
        v[1] = new Video("Aula 12 de PHP ");
        v[2] = new Video("Uncharted 4 ");
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Lorran", 22, "M", "SuperLorran");
        g[1] = new Gafanhoto("Naiane", 16, "F", "NaiOchaca");
        g[2] = new Gafanhoto("Hanna", 22, "F", "Hillfeii");
        
        Vizualizacao vi[] = new Vizualizacao[5];
        vi[0] = new Vizualizacao(g[0], v[2]); //Lorran assiste Uncharted 4
        vi[0].avaliar(35.0f);
        
        
        
        System.out.println(vi[0].toString());
        /*System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());*/
    }
    
}
