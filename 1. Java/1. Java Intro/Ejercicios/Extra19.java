
import java.util.Scanner;


public class Extra19 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese el tamaño del vector: ");
       int max = leer.nextInt();
       
       int[] vector;
       
       vector = new int[max];
       llenado( vector, max);
       imprimir(vector, max);
        System.out.println("");
    }
    
    public static int[] llenado(int[] vector,int max){
        int i;
        
        for(i = 0 ; i <= max-1 ; i++){
            vector[i] = (int)(Math.random()*10);
            
        }
        
        return vector;
    }
    
    public static void imprimir(int[] vector,int max){
        int i;
        for(i = 0; i <= max-1; i++){
            System.out.print("["+vector[i]+"]");
        }
    }
    
}
