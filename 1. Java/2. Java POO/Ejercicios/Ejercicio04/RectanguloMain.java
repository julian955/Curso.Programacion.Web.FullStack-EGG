
package Ejercicio04;

import java.util.Scanner;


public class RectanguloMain {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo: ");
        float b = leer.nextFloat();
        System.out.println("Ingrese la altura del rectangulo: ");
        float a = leer.nextFloat();
        
        
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(b,a);
        Rectangulo r3 = new Rectangulo();
        
        r1.setBase(b);
        r1.setAltura(a);
        
        System.out.println("La superficie del rectangulo 1 es: " + r1.superficie());
        System.out.println("El perimetro del rectangulo 1 es: "+r1.perimetro());
        r1.dibujado();
        
        System.out.println("\n<-------------------------------------------------------->\n");
        
        System.out.println("La superficie del rectangulo 2 es: " + r2.superficie());
        System.out.println("El perimetro del rectangulo 2 es: "+r2.perimetro());
        r2.dibujado();
        
        System.out.println("\n<-------------------------------------------------------->\n");
        
        r3.pedirDatos();
        System.out.println("La superficie del rectangulo 3 es: " + r3.superficie());
        System.out.println("El perimetro del rectangulo 3 es: "+r3.perimetro());
        r3.dibujado();
        
        System.out.println("\n");
    }
    
}
