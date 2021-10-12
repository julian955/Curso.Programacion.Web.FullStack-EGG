package Ejercicio04;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> ordPorNombre = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };

    public static Comparator<Pelicula> ordPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordPorDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordPorDirec = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

}
