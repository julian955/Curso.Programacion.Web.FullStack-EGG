
import java.util.Scanner;


public class Ejercicio23 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        int [] vector;
       
        System.out.println("Ingrese el tamaño del vector: ");
        int num = leer.nextInt();
        
        vector = new int [num];
        int i,cont,buscar;
        
        for (i = 0 ; i <= num-1 ; i++){
            vector[i] = (int) (Math.random() * 10);
            System.out.print("["+vector[i]+"]");
        }
        
        System.out.println("Ingrese el numero a buscar:");
        buscar = leer.nextInt();
        
        for (i = 0 ; i <= num-1 ; i++){
            
            if (vector[i] == buscar){
                System.out.println("El numero buscado se encuentra en la posicion " + i);
            }
        }
    }
    
}
