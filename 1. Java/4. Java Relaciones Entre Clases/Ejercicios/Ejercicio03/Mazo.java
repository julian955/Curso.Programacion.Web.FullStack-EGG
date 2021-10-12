package Ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Mazo {

    private List<Carta> pozo;
    private List<Carta> mazo;

    public Mazo() {
        mazo = new ArrayList();
        pozo = new ArrayList();
        crearMazo();
    }

    public List<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(List<Carta> mazo) {
        this.mazo = mazo;
    }

    public void crearMazo() {
        int aux = 0;
        Carta c;
        while (aux != 4) {
            for (int i = 0; i < 12; i++) {
                if (aux == 0 && i != 7 && i != 8) {
                    c = new Carta((i + 1), "ESPADA");
                    mazo.add(c);
                }
                if (aux == 1 && i != 7 && i != 8) {
                    c = new Carta((i + 1), "ORO");
                    mazo.add(c);
                }
                if (aux == 2 && i != 7 && i != 8) {
                    c = new Carta((i + 1), "BASTO");
                    mazo.add(c);
                }
                if (aux == 3 && i != 7 && i != 8) {
                    c = new Carta((i + 1), "COPAS");
                    mazo.add(c);
                }
            }
            aux++;
        }
    }

    public void barajar() {
        Collections.shuffle(mazo);
        JOptionPane.showMessageDialog(null, "Se barajaron las cartas correctamente!.");
    }

    public void repartir(List<Jugador> jugadores) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Cuantas cartas desea repartir?"));
        int aux = jugadores.size();
        int aux1 = 0, aux2 = 0;
        int aux3 = num * aux;

        if (aux3 <= mazo.size()) {
            while (aux1 != aux) {
                List<Carta> mano = new ArrayList();
                for (int i = 0; i < num; i++) {
                    mano.add(mazo.get(0));
                    mazo.remove(0);
                    //aux2++;
                }
                jugadores.get(aux1).setMano(mano);
                // mano.clear();
                aux1++;
            }
            JOptionPane.showMessageDialog(null, "Se repartieron las cartas correctamente!.");
        } else {
            JOptionPane.showMessageDialog(null, "Las cartas no son suficientes.");
        }

    }

    public void siguienteCarta() {
        if (mazo.size() >= 1) {
            JOptionPane.showMessageDialog(null, "La carta es: " + mazo.get(0).mostrarCarta());
            pozo.add(mazo.get(0));
            mazo.remove(0);
        } else {
            JOptionPane.showMessageDialog(null, "No quedan cartas en el mazo");
        }
    }

    public void cartasPozo() {
        if (pozo.size() >= 1) {
            JOptionPane.showMessageDialog(null, "Hay un total de " + pozo.size() + " cartas en el pozo");
        } else {
            JOptionPane.showMessageDialog(null, "No hay cartas en el pozo");
        }
    }

    public void cartasDisponibles() {
        JOptionPane.showMessageDialog(null, "Hay " + mazo.size() + " cartas disponibles en el mazo");
    }

    public void mostrarMazo() {
        String aux = "Cartas del mazo: \n";

        if (mazo.size() > 0) {
            for (Carta carta : mazo) {
                aux = aux + carta.mostrarCarta() + "\n";
            }
            JOptionPane.showMessageDialog(null, aux);
        } else {
            JOptionPane.showMessageDialog(null, "No quedan cartas en el mazo!");
        }

    }

    public void mostrarPozo() {
        String aux = "Cartas del pozo: \n";
        if (pozo.size() > 0) {
            for (Carta carta : pozo) {
                aux = aux + carta.mostrarCarta() + "\n";
            }
            JOptionPane.showMessageDialog(null, aux);
        } else {
            JOptionPane.showMessageDialog(null, "No hay cartas en el pozo!");
        }

    }
}
