
import java.util.Scanner;


public class Ejercicio09 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese una frase");
        
        boolean frase = leer.nextLine().equals("eureka");
       // boolean frase1 = "hola".equals("eureka");
        
      
        if(frase == true){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
}
