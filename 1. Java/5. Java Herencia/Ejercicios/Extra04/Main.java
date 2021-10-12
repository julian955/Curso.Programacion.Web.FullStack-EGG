package Extra04;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Servicio sv = new Servicio();

        String menu = "1. Para registrar una persona\n2. Para Cambiar estado civil\n3. Para cambiar despacho\n4. Para cambiar curso\n5. Para cambiar departamento\n6. Para trasladar de seccion\n7. Para mostrar datos\n8. Para mostrar lista registrados\n9. Para salir";
        int menun = 0;

        while (menun != 9) {
            menun = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (menun) {
                case 1:
                    sv.agregarPersona();
                    break;
                case 2:
                    sv.CambioEC();
                    break;
                case 3:
                    sv.cambiarDespacho();
                    break;
                case 4:
                    sv.cambiarCurso();
                    break;
                case 5:
                    sv.cambioDepto();
                    break;
                case 6:
                    sv.trasladoSeccion();
                    break;
                case 7:
                    sv.imprimirTodo();
                    break;
                case 8:
                    sv.imprimirLista();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida,seleccione otra.");
                    break;
            }
        }
    }

}
