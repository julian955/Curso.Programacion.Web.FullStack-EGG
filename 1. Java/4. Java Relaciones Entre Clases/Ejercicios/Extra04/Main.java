package Extra04;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Simulador simu = new Simulador();

        String menu = "1. Para agregar alumnos\n2. Para realizar una votacion\n3. Para agregar facilitadores\n4. Para mostrar facilitadores\n5. Para mostrar alumnos\n6. Para ver los votos\n7. Para ver el recuento de votos\n8. Para salir";
        int menuN = 0;

        while (menuN != 8) {
            menuN = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (menuN) {
                case 1:
                    simu.crearAlumnos();
                    break;
                case 2:
                    simu.votacion();
                    break;
                case 3:
                    simu.agregarFacilitadores();
                    break;
                case 4:
                    simu.mostrarFacilitadores();
                    break;
                case 5:
                    simu.mostrarAlumnos();
                    break;
                case 6:
                    simu.mostrarVotos();
                    break;
                case 7:
                    simu.recuentoVotos();
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, Por favor ingrese otra.");
                    break;
            }
        }

    }

}
