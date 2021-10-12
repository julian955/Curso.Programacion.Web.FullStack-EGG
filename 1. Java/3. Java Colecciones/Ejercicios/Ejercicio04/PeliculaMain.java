package Ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class PeliculaMain {

    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();
        List<Pelicula> peliculas = new ArrayList();

        int menu = 0;

        String menus = "1. Para agregar una pelicula\n2. Para Mostrar en pantalla todas las películas.\n"
                + "3. Mostrar en pantalla todas las películas con una duración mayor a 1 hora.\n"
                + "4. Ordenar las películas de acuerdo a su duración (de mayor a menor)\n"
                + "5. Ordenar las películas de acuerdo a su duración (de menor a mayor)\n"
                + "6. Ordenar las películas por titulo, alfabéticamente\n"
                + "7. Ordenar las películas por director, alfabéticamente\n8. Para salir.";

        while (menu != 8) {
            menu = Integer.parseInt(JOptionPane.showInputDialog(menus));
            switch (menu) {
                case 1:
                    ps.agregarPelicula(peliculas);
                    break;
                case 2:
                    ps.mostrarPeliculas(peliculas);
                    break;
                case 3:
                    ps.mostrarPeliculaMas1Hora(peliculas);
                    break;
                case 4:
                    Collections.sort(peliculas, Comparadores.ordPorDuracionDesc);
                    ps.mostrarPeliculas(peliculas);
                    break;
                case 5:
                    Collections.sort(peliculas, Comparadores.ordPorDuracionAsc);
                    ps.mostrarPeliculas(peliculas);
                    break;
                case 6:
                    Collections.sort(peliculas, Comparadores.ordPorNombre);
                    ps.mostrarPeliculas(peliculas);
                    break;
                case 7:
                    Collections.sort(peliculas, Comparadores.ordPorDirec);
                    ps.mostrarPeliculas(peliculas);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "El programa finalizo correctamente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion inalida, por favor ingrese otra.");
                    break;
            }
        }
    }

}
