/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

/**
 *
 * @author Positivo
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 0;
        while(c<10){
            c++;
            if(c == 5 || c == 7 || c==3){
                continue;
            }
            if(c == 7){
                break;
            }
            System.out.println("Canbalhota!" + c);
            c++;
        }
    }
    
}
