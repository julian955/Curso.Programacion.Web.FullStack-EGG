
import java.util.Scanner;


public class Ejercicio20 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num,i,j;
        
        for( i = 0 ; i <= 3 ; i ++){
            
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            System.out.print(num + " = ");
            for (j = 0 ; j <= num-1 ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
