package Ejercicio05;

import java.util.HashSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class PaisService {

    public Pais crearPais() {
        String nombre = JOptionPane.showInputDialog("Ingrese un pais");
        nombre = nombre.replaceFirst(nombre.substring(0, 1), nombre.substring(0, 1).toUpperCase());
        return new Pais(nombre);
    }

    public void agregarPais(TreeSet<Pais> paises) {
        Pais p = crearPais();
        paises.add(p);
    }

    public void eliminarPais(TreeSet<Pais> paises, String p) {
        int aux1 = 0;
        for (Pais aux : paises) {
            if (aux.getNombre().equalsIgnoreCase(p)) {
                paises.remove(aux);
                JOptionPane.showMessageDialog(null, "El pais se elimino correctamente.");
                aux1 = 1;
                break;
            }
        }
        if (aux1 == 0) {
            JOptionPane.showMessageDialog(null, "El pais ingresado no se encuentra en la lista");
        }
    }

    public void mostrarPaises(TreeSet<Pais> paises) {
        int n = 0;
        String pais = "";
        for (Pais aux : paises) {
            n++;
            pais = pais+"Pais " + n + " = " + aux.getNombre() + "\n";

        }
        JOptionPane.showMessageDialog(null, pais);
    }
}
