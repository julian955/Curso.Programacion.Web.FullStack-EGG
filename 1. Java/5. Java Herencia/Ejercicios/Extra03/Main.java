package Extra03;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Servicio sv = new Servicio();

        String menu = "1. Para registrar un alojamiento\n2. Para eliminar un alojamiento\n3. Para mostrar alojamientos disponibles\n4. Para ver hoteles\n5. Para ver otros alojamientos\n6. Para salir";
        int menun = 0;

        while (menun != 6) {
            menun = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (menun) {
                case 1:
                    sv.agregarAlojamiento();
                    break;
                case 2:
                    sv.eliminarAlojamiento();
                    break;
                case 3:
                    sv.mostrarLista();
                    break;
                case 4:
                    sv.mostrarHoteles();
                    break;
                case 5:
                    sv.mostrarExtras();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida,seleccione otra.");
                    break;
            }
        }
    }

}
