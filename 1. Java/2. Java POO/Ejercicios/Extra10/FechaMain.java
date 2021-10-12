package Extra10;

import javax.swing.JOptionPane;

public class FechaMain {

    public static void main(String[] args) {
        String menu1 = "MENU\n1. Para Mostrar fecha\n2. Para verificar los dias\n3. Para ver un dia anterior\n4. Para ver un dia posterior\n5. Para verificar si el año es biciesto o no\n6. Para cambiar fecha\n7. para salir";
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un ano"));

        FechaEntidad f1 = new FechaEntidad();
        Fecha fecha = f1.inicializar();
        int menu = 0;
        f1.verificarFecha(dia, mes, ano);
        while (menu != 7) {

            menu = Integer.parseInt(JOptionPane.showInputDialog(menu1));
            switch (menu) {
                case 1:
                    f1.mostrarFecha();
                    break;
                case 2:
                    f1.verificarDias(mes);
                    break;
                case 3:
                    f1.diaAnterior(dia, mes, ano);
                    break;
                case 4:
                    f1.diaPosterior(dia, mes, ano);
                    break;
                case 5:
                    if (f1.biciesto(ano) == true) {
                        System.out.println("El año es biciesto!");
                    } else {
                        System.out.println("El año no es biciesto.");
                    }
                    break;
                case 6:
                    dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia"));
                    mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes"));
                    ano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un ano"));
                    f1.verificarFecha(dia, mes, ano);
                    break;
                case 7:
                    System.out.println("Gracias!");
                    break;
                default:
                    System.out.println("Opcion incorrecta, seleccione otra.");
                    break;
            }

        }
    }

}
