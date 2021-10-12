
import java.util.Scanner;


public class Ejercicio05 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados que desea conventir:");
        
        float grados = leer.nextFloat();
        
        float f = 32 + (9*grados/5);
        
        System.out.println(grados + " °C equivalen a: " + f + "°F");
    }
    
}
