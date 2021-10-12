
package Extra01;

import java.util.Scanner;


public class CancionMain {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cancion c1 = new Cancion();
        System.out.println("Ingrese el titulo de la cancion: ");
        String titulo = leer.next();
        System.out.println("Ingrese el autor de la cancion: ");
        String autor = leer.next();
        
        c1.setAutor(autor);
        c1.setTitulo(titulo);
        c1.mostrarCancion();
    }
    
}
