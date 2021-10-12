package Ejercicio03;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        Servicio sv = new Servicio();

        String menu = "1. Para crear un jugador\n2. Para barajar el mazo\n3. Para repartir cartas\n4. Para mostrar las cartas de los jugadores\n"
                + "5. Para ver la siguiente carta\n6. Para mostrar las cartas del mazo\n7. Para mostrar las cartas del pozo\n8. Para mostrar los jugadores\n9. Para salir";

        int select = 0;

        while (select != 9) {
            select = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (select) {
                case 1:
                    sv.agregarJugador();
                    break;
                case 2:
                    mazo.barajar();
                    break;
                case 3:
                    if (sv.getJugadores().size() > 0) {
                        mazo.repartir(sv.getJugadores());
                    } else {
                        JOptionPane.showMessageDialog(null, "Para repartir cartas necesita crear jugadores!!");
                    }
                    break;
                case 4:
                    if (sv.getJugadores().size() > 0) {
                        sv.mostrarCartasJugadores();                        
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay jugadores creados!");
                    }
                    break;
                case 5:
                    mazo.siguienteCarta();
                    break;
                case 6:
                    mazo.mostrarMazo();
                    break;
                case 7:
                    mazo.mostrarPozo();
                    break;
                case 8:
                    sv.mostrarJugadores();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa !");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, Seleccione otra.");
            }
        }

        JOptionPane.showMessageDialog(null, "El programa finalizo correctamente!!");
    }

}
