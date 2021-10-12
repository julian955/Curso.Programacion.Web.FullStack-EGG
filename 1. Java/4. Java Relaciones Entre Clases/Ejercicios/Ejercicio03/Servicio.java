package Ejercicio03;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Servicio {

    private List<Jugador> jugadores;

    public Servicio() {
        jugadores = new ArrayList();
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Jugador crearJugador() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del jugador");
        return new Jugador(nombre);
    }

    public void agregarJugador() {
        jugadores.add(crearJugador());
        JOptionPane.showMessageDialog(null, "Se agrego el jugador correctamente!");
    }

    public void mostrarCartasJugadores() {
        int aux = 0;
        for (Jugador x : jugadores) {
            aux++;
            x.setId(aux);
            x.mostrarCartasJugador();
        }

    }

    public void mostrarJugadores() {
        int aux = 0;
        String players = " JUGADORES: \n";

        if (jugadores.size() > 0) {
            for (Jugador x : jugadores) {
                aux++;
                players = players + "Jugador: " + aux + " == " + x.getNombre() + "\n";
            }
            JOptionPane.showMessageDialog(null, players);
        } else {
            JOptionPane.showMessageDialog(null, "No hay jugadores creados!");
        }
    }

}
