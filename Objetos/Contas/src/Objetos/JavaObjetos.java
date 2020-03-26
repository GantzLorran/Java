package Objetos;
        
import contas.Parcelas;
import contas.Soma;

public class JavaObjetos {
        public static void main(String[] args){
            System.out.println("********** Somar ***********");
            Soma soma = new Soma();
            soma.setA (10);
            soma.setB (7);
            System.out.println(soma.getB());
            System.out.println(soma.getA());
            
            if (soma.getB ()/soma.getA()<2){
                    
                soma.soma(4, 7);
                soma.soma(123, 789);
                soma.soma(2,3);
            }
            if (soma.getA() * soma.getB() >20){
                
            }
            if(soma.soma(6, 1234)<500){
                
            }
            Parcelas parcelas = new Parcelas();
            parcelas.setValor (2.75);
            parcelas.setTempo (5.0);
            parcelas.setTaxa (17.69);
            
            if (parcelas.getTempo() ==5.0); {
            System.out.println(parcelas.calcularParcelas());
            System.out.println("********* parcelas ************");
        }
            for (int i = 0; i < 10; i++){
            System.out.println(parcelas.getValor());
            System.out.println(parcelas.getTempo());
            System.out.println(parcelas.getTaxa());
            System.out.println("*********************");
            System.out.println(parcelas.calcularParcelas());
        }
         System.out.println("*********************");   
    }
}
//Dados os valores 8.756379 e 8.7543329, subtraia o primeiro pelo segundo e mostre o resultado.
 