
package Extra03;

import java.util.Scanner;

public class RaizMain {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A: ");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor de B: ");
        int b = leer.nextInt();
        System.out.println("Ingrese el valor de C: ");
        int c = leer.nextInt();
        
        Raiz r1 = new Raiz(a, b, c);
        
        System.out.println("El valor discriminado es: "+r1.getDiscriminante());
        r1.obtenerRaices(r1.tieneRaices(r1.getDiscriminante()), r1.getDiscriminante());
        r1.obtenerRaiz(r1.tieneRaiz(r1.getDiscriminante()), r1.getDiscriminante());
        r1.calcular(r1.tieneRaices(r1.getDiscriminante()), r1.tieneRaiz(r1.getDiscriminante()), r1.getDiscriminante());
    }
    
}
