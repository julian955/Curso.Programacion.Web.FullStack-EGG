package Extra03;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Servicio {

    private List<Poliza> polizas;

    public Servicio() {
        polizas = new ArrayList();
    }

    public Cliente crearCliente() {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        String apellido = JOptionPane.showInputDialog("Introduce tu apellido: ");
        long documento = Long.parseLong(JOptionPane.showInputDialog("Introduce tu DNI: "));
        String mail = JOptionPane.showInputDialog("Introduce tu mail : ");
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu telefono: "));
        String direccion = JOptionPane.showInputDialog("Introduce tu direccion: ");

        return new Cliente(nombre, apellido, documento, mail, telefono, direccion);
    }

    public Vehiculo crearVehiculo() {
        String marca = JOptionPane.showInputDialog("Introduce la marca de tu vehiculo: ");
        String modelo = JOptionPane.showInputDialog("Introduce el modelo: ");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año: "));
        String tipo = JOptionPane.showInputDialog("Introduce el tipo: ");
        String color = JOptionPane.showInputDialog("Introduce el color: ");
        long numMotor = Long.parseLong(JOptionPane.showInputDialog("Introduce el numero de motor: "));
        String chasis = JOptionPane.showInputDialog("Introduce el numero de chasis: ");

        return new Vehiculo(marca, modelo, ano, tipo, color, numMotor, chasis);
    }

    public Poliza generarPoliza() {
        Cliente x = crearCliente();
        Vehiculo z = crearVehiculo();

        int aux = 0;
        long numPoliza = Long.parseLong(JOptionPane.showInputDialog("Introduce el numero de poliza: "));
        String fechaInicio = JOptionPane.showInputDialog("Introduce la fecha de inicio: ");
        String fechaFin = JOptionPane.showInputDialog("Introduce la fecha de fin: ");
        int cuotas = 6; //Integer.parseInt(JOptionPane.showInputDialog("Introduce las cuotas: "));

        long montoTA = Long.parseLong(JOptionPane.showInputDialog("Introduce el monto total asegurado: "));
        boolean granizo = false;
        int montoGranizo = 0;
        while (aux != 1 && aux != 2) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("Quiere cobertura contra granizo? 1.SI / 2.NO "));
            if (aux == 1) {
                granizo = true;
                montoGranizo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto maximo de cobertura para el granizo"));
            }
        }
        double montoc = (montoTA * 0.01) / 6;
        List<GestionCuotas> gc = gestionarCuotas(montoc);
        String tipoCovertura = JOptionPane.showInputDialog("Introduce el tipo de cobertura ");

        return new Poliza(x, z, numPoliza, fechaInicio, fechaFin, cuotas, montoTA, granizo, montoGranizo, tipoCovertura, gc);
    }

    public void agregarPoliza() {
        polizas.add(generarPoliza());
    }

//    public GestionCuotas crearCuotas() {
//        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de las cuotas"));
//        boolean pago = false;
//        String formaPago = "Efectivo / Tarjeta / Transferencia";
//
//        return new GestionCuotas(monto, pago, formaPago);
//        //new GestionCuotas(int numCuota, double monto, boolean pago, String vencimiento, String formaPago);
//    }
    public List<GestionCuotas> gestionarCuotas(double monto) {
        List<GestionCuotas> gc = new ArrayList();
        int aux = 0, mes = 9, ano = 2021;
        boolean pago = false;
        String formaPago = "Efectivo / Tarjeta / Transferencia";
        for (int i = 0; i < 6; i++) {
            aux++;
            String fecha = "12/" + mes + "/" + ano;
            gc.add(new GestionCuotas(aux, monto, pago, fecha, formaPago));

            if (mes == 12) {
                mes = 1;
                ano++;
            } else {
                mes++;
            }
        }
        return gc;
    }

    public void verCuotas() {
        long num = Long.parseLong(JOptionPane.showInputDialog("Introduce el numero de poliza: "));
        boolean cond = true;
        for (Poliza aux : polizas) {
            if (num == aux.getNumPoliza()) {
                aux.mostrarCuotas();
                cond = false;
                break;
            }
        }
        if (cond) {
            JOptionPane.showMessageDialog(null, "No se encontro la poliza ingresada.");
        }
    }

    public void pagoCuota(GestionCuotas x) {
        int aux = 0;
        if (x.isPago()) {
            JOptionPane.showMessageDialog(null, "Esta cuota ya se encuentra paga.");
        } else {
            aux = Integer.parseInt(JOptionPane.showInputDialog("El monto de la cuota es de: " + x.getMonto() + "\n1.Para confirmar el pago/2.Para salir."));
            if (aux == 1) {
                x.setPago(true);
                JOptionPane.showMessageDialog(null, "La cuota se pago correctamente! Muchas Gracias.");
            }
        }
    }

    public void pagarCuota() {
        long num = Long.parseLong(JOptionPane.showInputDialog("Introduce el numero de poliza: "));
        boolean cond = true;
        int aux1 = 0, aux2 = 0;
        for (Poliza aux : polizas) {
            if (num == aux.getNumPoliza()) {
                JOptionPane.showMessageDialog(null, "Por favor verifique los datos:\n" + aux.getCliente().mostrarCliente());
                aux1 = Integer.parseInt(JOptionPane.showInputDialog("Los datos son correcto? 1.SI/2.NO"));
                if (aux1 == 1) {
                    aux2 = Integer.parseInt(JOptionPane.showInputDialog("Que cuota desea pagar?"));
                    while (aux2 < 1 || aux2 > 6) {
                        aux2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cuota del 1 al 6."));
                    }
                    pagoCuota(aux.getgCuotas().get(aux2-1));

                } else {
                    break;
                }
                cond = false;
                break;

            }
        }
        if (cond) {
            JOptionPane.showMessageDialog(null, "No se encontro la poliza ingresada.");
        }
    }

    public void verPoliza() {
        long num = Long.parseLong(JOptionPane.showInputDialog("Introduce el numero de poliza: "));
        boolean cond = true;
        for (Poliza aux : polizas) {
            if (num == aux.getNumPoliza()) {
                aux.mostrarPoliza();
                cond = false;
                break;
            }
        }
        if (cond) {
            JOptionPane.showMessageDialog(null, "No se encontro la poliza ingresada.");
        }
    }

    public void eliminarPoliza() {
        long num = Long.parseLong(JOptionPane.showInputDialog("Introduce el numero de poliza: "));
        boolean cond = true;
        for (Poliza aux : polizas) {
            if (num == aux.getNumPoliza()) {
                polizas.remove(aux);
                JOptionPane.showMessageDialog(null, "La poliza se elimino correctamente.");
                cond = false;
                break;
            }
        }
        if (cond) {
            JOptionPane.showMessageDialog(null, "No se encontro la poliza ingresada.");
        }
    }

    public void mostrarClientes() {
        int aux = 0;
        String s = "";
        for (Poliza aux1 : polizas) {
            aux++;
            s += "Cliente " + aux + " == " + aux1.getCliente().getNombre() + " " + aux1.getCliente().getApellido() + " Numero de poliza: " + aux1.getNumPoliza() + "\n";
        }

        JOptionPane.showMessageDialog(null, s);
    }

}
