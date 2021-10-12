
package Ejercicio01;

import java.util.Scanner;


public class Libro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //ATRIBUTOS
    int ISBN;
    String Titulo;
    String Autor;
    int  Paginas;
    
    //METODOS
    public void llenarDatos(){
        System.out.println("Ingrese el numero de ISBN: ");
        ISBN = leer.nextInt();
        System.out.println("Ingrese el titulo del libro: ");
        Titulo = leer.next();
        System.out.println("Ingrese el autor del libro: ");
        Autor = leer.next();
        System.out.println("Ingrese el numero de paginas: ");
        Paginas = leer.nextInt();
    }
    
    public void mostrarDatos(){
        System.out.println("El numero ISBN del libro es "+ISBN);
        System.out.println("El titulo del libro es: "+Titulo);
        System.out.println("El autor del libro es: "+Autor);
        System.out.println("El libro tiene "+Paginas+" Paginas");
    }
}


