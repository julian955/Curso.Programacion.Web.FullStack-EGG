
import java.util.Scanner;


public class Extra15 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      String cond ="null";
      
      while(!(cond.equals("no"))){
          datos();
          System.out.println("Desea agregar otra persona?");
          cond = leer.nextLine();
      }
    }
    
    static void datos(){
        String nombre;
        int edad;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();
        
        if(edad >= 18){
            System.out.println(nombre+ " tiene "+edad+" años y es mayor de edad.");
        }else{
            System.out.println(nombre+ " tiene "+edad+" años y es menor de edad.");
        }
    }
    
}
