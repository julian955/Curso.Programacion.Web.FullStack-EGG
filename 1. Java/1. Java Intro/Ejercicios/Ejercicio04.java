
import java.util.Scanner;


public class Ejercicio04 {

    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase: ");
        
        String palabra = leer.nextLine();
        
        palabra = palabra.toUpperCase();
        System.out.println(palabra);
        palabra = palabra.toLowerCase();
        System.out.println(palabra);
    }
    
}
