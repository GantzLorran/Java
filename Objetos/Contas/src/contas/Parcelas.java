package contas;

public class Parcelas {
     private double valor;
     private double taxa;
     private double tempo;
     
     public void setValor (double x){
         valor = x;
     }
     public double getValor (){
         return valor;
     }
     public void setTaxa (double y){
         taxa = y;
     }
     public double getTaxa (){
         return taxa;
     }
     public void setTempo (double w){
         tempo = w;
     }
     public double getTempo (){
         return tempo;
     }
     public double calcularParcelas(){
     return valor +(valor*(taxa/100)*tempo); 
     }
}
