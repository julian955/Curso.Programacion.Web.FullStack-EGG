package Ejercicio02;

import javax.swing.JOptionPane;

public class JuegoMain {

    public static void main(String[] args) {
        Servicio sv = new Servicio();
        int aux = 0;
        String menu = "MENU\n1. Cargar Jugadores\n2. Mostrar Jugadores\n3. Iniciar Juego\n4. Para Salir";

        while (aux != 4) {
            aux = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (aux) {
                case 1:
                    sv.agregarJugadores();
                    break;
                case 2:
                    sv.mostrarJugadores();
                    break;
                case 3:
                    sv.iniciarJuego();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El Programa finalizo correctamente!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, ingrese otra.");
                    break;
            }
        }
    }

}
