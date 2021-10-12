
package Ejercicio02;

import java.util.Scanner;


public class CircunferenciaMain {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        
        Circunferencia rad = new Circunferencia();
        rad.crearCircunferencia();
        
        System.out.println("El area del circulo es: "+ rad.area());
        System.out.println("El perimetro del circulo es: "+ rad.perimetro());
        
        
        System.out.println(rad.getRadio());
    }
    
}
