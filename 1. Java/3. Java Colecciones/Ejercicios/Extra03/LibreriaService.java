package Extra03;

import java.util.HashSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class LibreriaService {

    TreeSet<Libreria> libros;

    public LibreriaService() {
        libros = new TreeSet();
        libros.add(new Libreria("Harry Potter", "Harry Potter", 10, 0));
        libros.add(new Libreria("Harry Potter", "Harry Potter", 10, 0));
        libros.add(new Libreria("Tarzan", "Tarzan", 5, 0));
        libros.add(new Libreria("El Señor de los Anillos", "Tolkien", 8, 0));
        libros.add(new Libreria("Los Juegos del Hambre", "LJDA", 6, 0));
        libros.add(new Libreria("Alicia en el Pais de las M.", "APM", 4, 0));
    }

    public Libreria crearLibro() {

        String libro = JOptionPane.showInputDialog("Ingrese el nombre del libro.");
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro.");
        Integer cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros que posee."));
        Integer prestados = 0;

        return new Libreria(libro, autor, cantidad, prestados);
    }

    public void agregarLibros() {

        Libreria l = crearLibro();
        libros.add(l);
        JOptionPane.showMessageDialog(null, "El libro se agrego correctamente.");
    }

    public void eliminarLibro(String libro) {
        int n = 0;
        for (Libreria aux : libros) {
            if (aux.getLibro().equalsIgnoreCase(libro)) {
                libros.remove(aux);
                JOptionPane.showMessageDialog(null, "El libro se elimino correctamente.");
                n = 1;
                break;
            }
        }
        if (n == 0) {
            JOptionPane.showMessageDialog(null, "El libro ingresado no se encuentra en la lista.");
        }
    }

    public void prestarLibro(String libro) {
        int n = 0;
        for (Libreria aux : libros) {
            if (aux.getLibro().equalsIgnoreCase(libro) && aux.getCantidad() > 0) {
                aux.setCantidad(aux.getCantidad() - 1);
                aux.setPrestados(aux.getPrestados() + 1);
                JOptionPane.showMessageDialog(null, "El prestamo del libro se gestiono correctamente.");
                n = 1;
                break;
            }
        }
        if (n == 0) {
            JOptionPane.showMessageDialog(null, "El libro no esta en la lista o no quedan ejemplares disponibles.");
        }

    }

    public void devolverLibro(String libro) {
        int n = 0;
        for (Libreria aux : libros) {
            if (aux.getLibro().equalsIgnoreCase(libro) && aux.getPrestados() > 0) {
                aux.setCantidad(aux.getCantidad() + 1);
                aux.setPrestados(aux.getPrestados() - 1);
                JOptionPane.showMessageDialog(null, "La devolucion del libro se gestiono correctamente.");
                n = 1;
                break;
            }
        }
        if (n == 0) {
            JOptionPane.showMessageDialog(null, "El libro no esta en la lista o no hay ejemplares prestados.");
        }

    }
    
    public void mostrarLibros(){
        String x = "";
        int n = 0;
        for (Libreria aux : libros) {
            n++;
            x = x+"Libro: "+n+" == "+aux.mostrarLibros()+"\n";
        }
        JOptionPane.showMessageDialog(null, x);
    }

}
