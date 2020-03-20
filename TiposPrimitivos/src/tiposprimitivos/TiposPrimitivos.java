package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua nota: ");
        float nota = sc.nextFloat();
        System.out.format("Sua nota de %s é %.2f \n", nome, nota);
    }
    
}
