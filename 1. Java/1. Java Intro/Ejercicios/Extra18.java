
import java.util.Scanner;


public class Extra18 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        int max = leer.nextInt();
        
        int[] vector,vector1;
        vector = new int[max];
        vector1 = new int[max];
        
        int i,num;
        
        for(i = 0; i <= max-1 ; i ++){
            System.out.println("Ingrese un valor para el vector 1: ");
            num = leer.nextInt();
            vector[i] = num;
            
            System.out.println("Ingrese un valor para el vector 2: ");
            num = leer.nextInt();
            vector1[i] = num;
        }
        
        System.out.println("Vector 1:");
        
        for(i = 0; i <= max-1 ; i++){
            System.out.print("["+vector[i]+"]");
        }
        
        System.out.println("");
        System.out.println("Vector 2:");
        
        for(i = 0; i <= max-1 ; i++){
            System.out.print("["+vector1[i]+"]");
        }
         System.out.println("");
        for(i = 0; i <= max-1 ; i++){
            if(vector[i] != vector1[i]){
                System.out.println("Los vectores en la posicion "+(i+1)+ " son diferentes.");
                break;
            }
        }
       
        if(i == max){
            System.out.println("Los vectores son iguales!!");
        }
    }
    
}
