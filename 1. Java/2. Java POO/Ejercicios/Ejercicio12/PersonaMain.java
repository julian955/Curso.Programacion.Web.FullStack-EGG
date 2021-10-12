
package Ejercicio12;

import java.util.Scanner;

public class PersonaMain {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona p1 = new Persona();
        
        p1.crearPersona();
        p1.calcularEdad();
        System.out.println("ingrese una edad: ");
        int num = leer.nextInt();
        if(p1.menorQue(num) == true){
            System.out.println("La edad ingresada es mayor a la de la persona.");
        }else{
            System.out.println("La edad ingresada es menor a la de la persona.");
        }
      
        p1.mostrarPersona();
    }
    
}
