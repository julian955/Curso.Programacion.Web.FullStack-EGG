package Ejercicio04;

import java.util.List;
import javax.swing.JOptionPane;

public class PeliculaService {

    public Pelicula crearPelicula() {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la pelicula");
        String director = JOptionPane.showInputDialog("Ingrese el director de la pelicula");
        int duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la pelicula (min)"));

        return new Pelicula(nombre, director, duracion);
    }

    public void agregarPelicula(List<Pelicula> peliculas) {

        Pelicula p = crearPelicula();
        peliculas.add(p);
    }

    public void mostrarPeliculas(List<Pelicula> peliculas) {
        String mostrar = "";
        int num = 0;
        for (Pelicula aux : peliculas) {
            num++;
            mostrar = mostrar + "Pelicula " + num + "==>  " + aux.mostrarPeliculas() + " Min\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }

    public void mostrarPeliculaMas1Hora(List<Pelicula> peliculas) {
        String mostrar = "";
        int num = 0;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 60) {
                num++;
                mostrar = mostrar + "Pelicula " + num + "-->  " + pelicula.mostrarPeliculas() + " Min\n";
            }
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
}
