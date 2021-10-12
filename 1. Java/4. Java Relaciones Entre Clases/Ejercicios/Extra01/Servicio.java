package Extra01;

import Ejercicio01.Perro;
import Ejercicio01.Persona;
import Ejercicio01.TamPerro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Servicio {

    private List<Persona> personas;
    private List<Perro> perros;

    public Servicio() {
        personas = new ArrayList();
        perros = new ArrayList();

        perros.add(new Perro("Pipo", "Callejero", TamPerro.MEDIANO, 5));
        perros.add(new Perro("Fer", "Beagle", TamPerro.MEDIANO, 6));
        perros.add(new Perro("Ciro", "Ovejero", TamPerro.GRANDE, 3));
        perros.add(new Perro("Nicky", "Caniche", TamPerro.CHICO, 4));
        perros.add(new Perro("Chicho", "Callejero", TamPerro.GRANDE, 7));
        perros.add(new Perro("Blacky", "Labrador", TamPerro.GRANDE, 3));
        perros.add(new Perro("Nicanor", "Caniche", TamPerro.CHICO, 2));
        perros.add(new Perro("Chinchu", "Callejero", TamPerro.MEDIANO, 2));
    }

    public Perro crearPerro() {
        TamPerro tam = TamPerro.MEDIANO;
        int aux = 0;
        String nombre = JOptionPane.showInputDialog("Introduce el nombre de tu perro: ");
        String raza = JOptionPane.showInputDialog("Introduce la raza de tu perro: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad de tu perro: "));

        while (aux == 0) {
            String tama = JOptionPane.showInputDialog("Introduce el tamaño de tu perro: ");
            for (TamPerro aux1 : TamPerro.values()) {
                if (aux1.toString().equalsIgnoreCase(tama)) {
                    tam = aux1;
                    aux = 1;
                    break;
                }

            }

            if (aux == 0) {
                JOptionPane.showMessageDialog(null, "Usted ingreso un tamaño incorrecto, Por favor ingrese uno valido");
            }
        }

        return new Perro(nombre, raza, tam, edad);

    }

    public Persona crearPersona() {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
        String apellido = JOptionPane.showInputDialog("Introduce tu apellido:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
        long dni = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu dni: "));
        //Perro perro = crearPerro();

        return new Persona(nombre, apellido, edad, dni);
    }

    public void agregarPersona() {
        personas.add(crearPersona());
    }

    public void agregarPerro() {
        perros.add(crearPerro());
    }

    public void adoptarPerro() {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        int num = 0;
        int num1 = 0;
        if (personas.size() > 0) {
            for (Persona aux : personas) {                
                if (aux.getNombre().equalsIgnoreCase(nombre) && aux.getPerro() == null) {
                    num1 = 1;
                    String nombrePerro = JOptionPane.showInputDialog("Introduce el nombre del perro que desea adoptar: ");
                    for (Perro aux1 : perros) {
                        if (aux1.getNombre().equalsIgnoreCase(nombrePerro)) {
                            aux.setPerro(aux1);
                            perros.remove(aux1);
                            num = 1;
                            JOptionPane.showMessageDialog(null, "Felicitaciones usted adopto a " + aux1.getNombre() + " por favor cuidelo mucho!");
                            break;
                        }
                    }
                    if (num == 0) {
                        num1 = 1;
                        JOptionPane.showMessageDialog(null, "El perro no existe o fue adoptado.");
                        break;
                    }
                }else if(aux.getNombre().equalsIgnoreCase(nombre) && aux.getPerro() != null){
                    num1 = 1;
                    JOptionPane.showMessageDialog(null, "Usted ya adopto un perro.");
                }
            }
            if (num1 == 0) {
                JOptionPane.showMessageDialog(null, "Para poder adoptar un perro primero debe registrarse.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Para poder adoptar un perro primero debe registrarse.");
        }

    }

    public void mostrarPerros() {
        int num = 0;
        String perro;
        for (Perro aux : perros) {
            num++;
            perro = " Perro " + num + ":\n" + " Nombre: "
                    + aux.getNombre() + "\n Raza: " + aux.getRaza() + "\n Tamaño: " + aux.getTam()
                    + "\n Edad: " + aux.getEdad();
            JOptionPane.showMessageDialog(null, perro);
        }

    }

    public void mostrarPersonas() {
        String datos;
        if (personas.size() > 0) {
            for (Persona p : personas) {
                if (p.getPerro() == null) {
                    datos = "Datos de la persona: \n" + p.datosPersona() + "\n Esta persona no posee perro.";
                } else {
                    datos = "Datos de la persona: \n" + p.datosPersona() + "\n Perro adoptado: \n" + p.getPerro().mostrarPerro();
                }
                JOptionPane.showMessageDialog(null, datos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay personas registradas.");
        }

    }

}
