
import java.util.Scanner;


public class Ejercicio11 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra que comienze con 'A' ");
        
        String var = leer.nextLine();
        boolean cond = var.substring(0,1).equals("a");
        
        System.out.println(var.substring(0,1));
        if (cond == true){
            System.out.println("Correcto");
        }else{
            System.out.println("Inconrrecto");
        }
    }
    
}
