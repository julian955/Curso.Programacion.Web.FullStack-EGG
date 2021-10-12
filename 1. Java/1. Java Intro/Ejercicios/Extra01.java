
import java.util.Scanner;


public class Extra01 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Por favor ingrese los minutos que desea calcular:");
        double min = leer.nextDouble();
        
        double dia = min/1440;
        double hora = min/60;
        
        System.out.println(min+" Minutos Equivalen a: ");
        System.out.println(hora+" Horas");
        System.out.println(dia+" Dias");
    }
    
}
