
import java.util.Scanner;


public class Extra03 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra:");
        String letra = leer.next();
        
        switch(letra){
            case "a":
                System.out.println("La letra ingresada es una vocal.");
                break;                
            case "e":
                System.out.println("La letra ingresada es una vocal.");
                break;
            case "i":
                System.out.println("La letra ingresada es una vocal.");
                break;
            case "o":
                System.out.println("La letra ingresada es una vocal.");
                break;
            case "u":
                System.out.println("La letra ingresada es una vocal.");
                break;
            default:
                System.out.println("La letra ingresada es una consonante.");
        
        }
    }
    
}
