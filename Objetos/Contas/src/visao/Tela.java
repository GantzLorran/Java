
package visao;
import javax.swing.JOptionPane;

public class Tela extends  JOptionPane{
    private static int idade;
    private static double altura;
    private static String nome;
    public static void main(String[] args){
        idade = Integer.parseInt(showInputDialog("Digite a idade:"));
        altura = Double.parseDouble(showInputDialog("Digite a altura:"));
        nome = (showInputDialog("Digite o nome:"));
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
    }    
}
