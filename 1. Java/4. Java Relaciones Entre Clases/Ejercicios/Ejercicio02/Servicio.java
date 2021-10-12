package Ejercicio02;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Servicio {

    Revolver r;
    List<Jugador> jugadores;
    Juego juego;

    public Servicio() {
        r = new Revolver();
        jugadores = new ArrayList();
    }

    public Jugador crearJugadores() {
        String jugador = JOptionPane.showInputDialog("Ingrese el nombre del jugador: ");
        return new Jugador(jugador);
    }

    public void agregarJugadores() {
        jugadores = new ArrayList();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jugadores (6 max.)"));

        if (num > 6 || num < 1) {
            num = 6;
        }

        for (int i = 0; i < num; i++) {
            jugadores.add(crearJugadores());
            jugadores.get(i).setId(i + 1);
        }
    }

    public void iniciarJuego() {
        int aux = 0;
        if (jugadores.size() > 1) {
            juego = new Juego(jugadores, r);
            juego.ronda();
            while (aux != 2) {
                if (jugadores.size() > 1) {
                    aux = Integer.parseInt(JOptionPane.showInputDialog("Desea Continuar?\n1 = SI\n2 = NO"));
                } else {
                    aux = 2;
                }

                switch (aux) {
                    case 1:
                        juego.ronda();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "El juego finalizo correctamente!!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, Ingrese otra.");
                        break;

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Necesita agregar 2 o mas jugadores para iniciar el juego.");
        }

    }

    public void mostrarJugadores() {
        String players = "";
        if (jugadores.size() > 0) {
            for (Jugador aux : jugadores) {
                players = players + aux.mostrarJugador() + "\n";
            }
            JOptionPane.showMessageDialog(null, players);
        } else {
            JOptionPane.showMessageDialog(null, "No hay jugadores para mostrar.");
        }
    }

}
