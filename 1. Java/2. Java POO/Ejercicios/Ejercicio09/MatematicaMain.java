
package Ejercicio09;

import java.util.Scanner;


public class MatematicaMain {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matematica mat = new Matematica();
        
        System.out.println("Ingrese el primer numero:");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double num2 = leer.nextDouble();
        
        mat.setNum1(num1);
        mat.setNum2(num2);
        
        System.out.println("El mayor numero ingresado es: "+mat.devolverMayor());
        System.out.println("La potencia de los numeros es: "+mat.calcularPotencia());
        System.out.println("La raiz cuadrada del numero menor es: "+ mat.calcularRaiz());
        
    }
    
}
