
import java.util.Scanner;


public class Ejercicio14 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Por favor ingrese el numero limite:");
        int lim = leer.nextInt();
        int num = 0;
        while(num <= lim){
        
            System.out.println("Ingrese un numero:");
            num = num + leer.nextInt();
            
        }
        System.out.println("El numero supero el limite de " + lim);
        System.out.println("La suma total es de : " + num);
    }
    
}
