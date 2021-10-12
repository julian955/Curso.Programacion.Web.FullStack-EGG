
import java.util.Scanner;


public class Ejercicio17 {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int corr = 0,inco = 0,largo = 0;
       String fde = "",var = "";
       char ini,fin;
        
        System.out.println("*******************************");
        System.out.println("**   Bienvenido al sistema.  **");
        System.out.println("*******************************");
        
        System.out.println("Recuerde que el programa admite cadenas de 5 letras maximo");
        System.out.println("Todas las cadenas comienzan con 'X' y terminan con 'O'");
        
        while(!var.equals("&&&&&")){
            System.out.println("Ingrese una cadena: ");
            var = leer.nextLine();
            var = var.toUpperCase();
            largo =  var.length();  
            ini = var.charAt(0);
            fin = var.charAt(largo -1);
            
            
          
            if(ini == 'X' & fin == 'O' & largo == 5){
               corr = corr + 1;
            }else {
                inco = inco + 1;
            }
            
            
          
        }
        
        System.out.println("El total de las cadenas correctas es de: " + corr);
        System.out.println("El total de las cadenas incorrectas es de: " + inco);
        
        
    }
    
}
