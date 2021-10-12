
import java.util.Scanner;


public class Ejercicio07 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segndo numero");
        int num2 = leer.nextInt();
        
        if (num1 > num2){
            System.out.println("El numero " + num1 + " es mayor que el numero "+num2 );
            
        }else{
            System.out.println("El numero " + num2 + "es mayor que el numero "+num1 );
        }
                
    }
    
}
