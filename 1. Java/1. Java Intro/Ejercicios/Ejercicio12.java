
import java.util.Scanner;


public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("***********************************");
        System.out.println("* Bienvenido a la fabrica de bombas");
        System.out.println("***********************************");
        System.out.println("\n");
        System.out.println("Por favor ingrese el tipo de motor:");
        
        //System.out.println("1. para agua, 2. para gasolina");
       // System.out.println("3. para hormigon, 4. para alimenticias");
        
        int tipoMotor = leer.nextInt();
        
        if (tipoMotor == 1){
            System.out.println("La bomba es una bomba de agua");
        }else if(tipoMotor == 2){
            System.out.println("La bomba es una bomba para gasolina");
        }else if(tipoMotor == 3){
            System.out.println("La bomba es una bomba para hormigon");
        }else if(tipoMotor == 4){
            System.out.println("La bomba es de tipo alimenticio");
        }else{
            System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
    
}
