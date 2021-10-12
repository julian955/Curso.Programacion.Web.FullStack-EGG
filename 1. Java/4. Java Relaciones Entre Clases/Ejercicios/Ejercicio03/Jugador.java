package Ejercicio03;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Jugador {

    private String nombre;
    private int id;
    private List<Carta> mano;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new ArrayList();
    }

    public Jugador(String nombre, List<Carta> mano) {
        this.nombre = nombre;
        this.mano = mano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public void setMano(List<Carta> mano) {
        this.mano = mano;
    }

    public void mostrarCartasJugador() {
        String aux = "Jugador: " + id + " == " + nombre + "\n     Cartas: \n";
        int x = 0;

        if (mano.size() > 0) {
            for (Carta c : mano) {
                x++;
                aux = aux + c.mostrarCarta() + "\n";
            }
            JOptionPane.showMessageDialog(null, aux);
        } else {
            JOptionPane.showMessageDialog(null, "Este jugador no tiene cartas.");
        }
    }
}
