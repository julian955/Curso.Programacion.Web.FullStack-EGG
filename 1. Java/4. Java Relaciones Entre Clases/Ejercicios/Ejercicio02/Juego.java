package Ejercicio02;

import java.util.List;
import javax.swing.JOptionPane;

public class Juego {

    private List<Jugador> jugadores;
    private Revolver r;

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    public void ronda() {
        r.llenarRevolver();
        System.out.println(r.mostrarDatos());
        int aux1 = jugadores.size();
        while (aux1 == jugadores.size()) {
            for (Jugador aux : jugadores) {
                JOptionPane.showMessageDialog(null, "Turno del jugador " + aux.getId());
                if (r.mojar()) {
                    JOptionPane.showMessageDialog(null, "Jugador Eliminado! \n" + aux.mostrarJugador());
                    jugadores.remove(aux);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Tuviste suerte!!!");
                    r.siguienteChorro();
                }
            }
        }
    }

}
