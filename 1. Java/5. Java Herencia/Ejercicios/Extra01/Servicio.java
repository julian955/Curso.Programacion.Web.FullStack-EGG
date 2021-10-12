
package Extra01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Servicio {

    List<Alquiler> lista;

    public Servicio() {
        lista = new ArrayList();
    }

    public Cliente crearCliente() {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        long dni = Long.parseLong(JOptionPane.showInputDialog("Introduce tu dni: "));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Introduce los dias de alquiler: "));
        String diaIn = JOptionPane.showInputDialog("Introduce la fecha de inicio de alquiler (d/m/yyyy) ");
        LocalDate dia1 = LocalDate.parse(diaIn, DateTimeFormatter.ofPattern("d/M/yyyy"));
        LocalDate dia2 = LocalDate.from(dia1).plusDays(dias);

        return new Cliente(nombre, dni, dia1, dia2, dias);

    }

    public Velero crearVelero() {
        String matricula = JOptionPane.showInputDialog("Introduce la matricula: ");
        int eslora = Integer.parseInt(JOptionPane.showInputDialog("Introduce la eslora: "));
        int fabricacion = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de fabricacion: "));
        int mastil = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de mastiles: "));
        return new Velero(mastil, matricula, eslora, fabricacion);
    }

    public BarcoMotor crearBarcoMotor() {
        String matricula = JOptionPane.showInputDialog("Introduce la matricula: ");
        int eslora = Integer.parseInt(JOptionPane.showInputDialog("Introduce la eslora: "));
        int fabricacion = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de fabricacion: "));
        int potencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce la potencia del barco: "));
        return new BarcoMotor(potencia, matricula, eslora, fabricacion);
    }

    public Yate crearYate() {
        String matricula = JOptionPane.showInputDialog("Introduce la matricula: ");
        int eslora = Integer.parseInt(JOptionPane.showInputDialog("Introduce la eslora: "));
        int fabricacion = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de fabricacion: "));
        int potencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce la potencia del barco: "));
        int camarotes = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de camarotes: "));
        return new Yate(camarotes, potencia, matricula, eslora, fabricacion);
    }

    public void agregarBarco() {
        Alquiler x;
        Velero v;
        BarcoMotor b;
        Yate y;
        Cliente c;
        int total;
        String menu = "Que barco posee?\n1. Velero\n2. Barco con motor\n3. Yate";
        int menun = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (menun) {
            case 1:
                c = crearCliente();
                v = crearVelero();
                total = v.calcularAlquiler(c.getDias());
                lista.add(new Alquiler(c, v, total));
                JOptionPane.showMessageDialog(null, "Se registro correctamente.");
                break;
            case 2:
                c = crearCliente();
                b = crearBarcoMotor();
                total = b.calcularAlquiler(c.getDias());
                lista.add(new Alquiler(c, b, total));
                JOptionPane.showMessageDialog(null, "Se registro correctamente.");
                break;
            case 3:
                c = crearCliente();
                y = crearYate();
                total = y.calcularAlquiler(c.getDias());
                lista.add(new Alquiler(c, y, total));
                JOptionPane.showMessageDialog(null, "Se registro correctamente.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida.");
        }
    }

    public void mostrarLista() {
        if (lista.size() > 0) {
            for (Alquiler aux : lista) {
                JOptionPane.showMessageDialog(null, aux.mostrarDatos());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados");
        }

    }

    public void eliminarCliente() {
        int aux1 = 0;
        if (lista.size() > 0) {
            long dni = Long.parseLong(JOptionPane.showInputDialog("Introduce el dni del cliente: "));
            for (Alquiler aux : lista) {
                if (dni == aux.getCliente().getDni()) {
                    lista.remove(aux);
                    JOptionPane.showMessageDialog(null, "El cliente se elimino correctamente.");
                    aux1 = 1;
                    break;
                }
            }

            if (aux1 == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro el cliente en la lista.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados");
        }
    }
}
