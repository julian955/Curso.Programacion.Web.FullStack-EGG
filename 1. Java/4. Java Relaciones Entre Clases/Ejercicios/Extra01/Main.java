package Extra01;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Servicio sv = new Servicio();

        String menu = "MENU\n1. Para registrar una persona\n2. Para agregar un perro a la lista de adopcion\n"
                + "3. Para adoptar un perro\n4. Para mostrar los perros en adopcion\n"
                + "5. Para ver las personas registradas\n6. Para salir";

        int num = 0;

        while (num != 6) {
            num = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (num) {
                case 1:
                    sv.agregarPersona();
                    break;
                case 2:
                    sv.agregarPerro();
                    break;
                case 3:
                    sv.adoptarPerro();
                    break;
                case 4:
                    sv.mostrarPerros();
                    break;
                case 5:
                    sv.mostrarPersonas();                    
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "El programa finalizo correctamente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, Por favor ingrese otra.");
            }
        }
    }

}
