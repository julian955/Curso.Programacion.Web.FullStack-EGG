
import java.util.Scanner;


public class Extra17 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        int max = leer.nextInt();
        
        int[] vector;
        vector = new int[max];
        
        int i,aux = 0;
        
        for(i = 0 ; i <= max-1 ; i ++){
            vector[i] = (int)(Math.random()*10);
            aux = vector[i]+aux;
        }
        
        for(i = 0 ; i <= max-1 ; i ++){
            System.out.print("["+vector[i]+"]");
        }       
          System.out.println("");
        System.out.println("La suma de los numeros del vector da un total de: " +aux);
    }
    
}
