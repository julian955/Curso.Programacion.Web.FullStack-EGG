
import java.util.Scanner;


public class Ejercicio02 {

   
    public static void main(String[] args) {
       int num1,suma;
       Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer numero:");
        
        num1 = leer.nextInt();
        
        System.out.println("Por favor ingrese el segundo numero:");
        
        int num2 = leer.nextInt();
        
        suma = num1 + num2;        
        System.out.println("La suma de los numeros ingresado es de: " + suma);
    }
    
}
