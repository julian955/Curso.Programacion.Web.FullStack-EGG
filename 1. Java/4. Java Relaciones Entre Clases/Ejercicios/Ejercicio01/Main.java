
package Ejercicio01;


public class Main {

   
    public static void main(String[] args) {
      Servicio sv = new Servicio();
      Persona p1 = sv.crearPersona();
      Persona p2 = sv.crearPersona();
      
      sv.mostrarDatos(p1);
      sv.mostrarDatos(p2);
      
      
    }
    
}
