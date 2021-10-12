package Extra02;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Servicio {

    List<Espectador> espectadores;
    List<Cine> salas;

    public Servicio() {
        espectadores = new ArrayList();
        salas = new ArrayList();
    }

    public Pelicula crearPelicula() {
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo de la pelicula: ");
        String director = JOptionPane.showInputDialog("Ingrese el director de la pelicula: ");
        int duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la pelicula (min): "));
        int edadMin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad minima para ver la pelicula: "));
        return new Pelicula(titulo, director, duracion, edadMin);
    }

    public Espectador crearEspectador() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        double dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su dinero: "));
        return new Espectador(nombre, edad, dinero);
    }

    public void agregarEspectador() {
        espectadores.add(crearEspectador());
        JOptionPane.showMessageDialog(null, "Gracias por registrarte!!");
    }

    public Cine crearSala() {
        List<Espectador> espectadorSala = new ArrayList();
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la sala: ");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de la entrada: "));
        Pelicula peli = crearPelicula();
        return new Cine(nombre, peli, espectadorSala, precio);
    }

    public void agregarSala() {
        salas.add(crearSala());
        JOptionPane.showMessageDialog(null, "La sala se creo correctamente.");
    }

    public void ingresoASala() {
        Espectador x = null;
        int f, c, aux = 0;
        String nombreSala = JOptionPane.showInputDialog("Ingrese el nombre de la sala que desea ingresar: ");

        for (Cine sala : salas) {

            if (sala.getNombre().equalsIgnoreCase(nombreSala)) {
                int menu = Integer.parseInt(JOptionPane.showInputDialog("Usted esta registrado? 1. SI / 2. NO"));
                while (menu != 1 && menu != 2) {
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Opcion incorrecta, Usted esta registrado? 1. SI / 2. NO"));
                }
                if (menu == 1) {
                    int aux1 = 0;
                    String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
                    for (Espectador espect : espectadores) {
                        if (espect.getNombre().equalsIgnoreCase(nombre)) {
                            x = espect;
                            aux1 = 1;
                            break;
                        }
                    }
                    if (aux1 == 0) {
                        JOptionPane.showMessageDialog(null, "No se encontro su nombre en el registro.");
                    }
                } else {
                    x = crearEspectador();
                    espectadores.add(x);
                }

                if (x.getEdad() >= sala.getPelicula().getEdadMin()) {
                    if (x.getDinero() >= sala.getPrecio()) {

                        while (aux == 0) {
                            f = fila();
                            c = columna();
                            if (sala.getAsientos()[f][c] != null) {
                                JOptionPane.showMessageDialog(null, "El asiento elegido esta ocupado, por favor ingrese otro.");
                            } else {
                                sala.asignarAsiento(f, c, x);
                                x.setDinero(x.getDinero() - sala.getPrecio());
                                JOptionPane.showMessageDialog(null, " Gracias por su compra, que disfrute la funcion!.");
                                JOptionPane.showMessageDialog(null, "TICKET\n" +sala.getNombre()+"\n"+ sala.getPelicula().mostrarPelicula()+"\nTu asiento: Fila: "+f+" Columna: "+c);
                                break;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No tienes dinero suficiente para comprar la entrada.");
                        break;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Tu edad no te permite ver esta pelicula.");
                    break;
                }

            } else {
                JOptionPane.showMessageDialog(null, "La sala ingresada no existe.");
                break;
            }
        }
    }

    public int columna() {
        int aux = 0, columna = 0;

        while (aux == 0) {
            String col = JOptionPane.showInputDialog("Ingrese la columna (A/B/C/D/E/F) ");
            switch (col) {
                case "a":
                    columna = 0;
                    aux = 1;
                    break;
                case "b":
                    columna = 1;
                    aux = 1;
                    break;
                case "c":
                    columna = 2;
                    aux = 1;
                    break;
                case "d":
                    columna = 3;
                    aux = 1;
                    break;
                case "e":
                    columna = 4;
                    aux = 1;
                    break;
                case "f":
                    columna = 5;
                    aux = 1;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Columna incorrecta,Por favor ingrese otra.");
                    break;

            }

        }

        return columna;
    }

    public int fila() {
        int fila = 0;
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila (1 - 8)"));
        while (fila < 1 || fila > 8) {
            fila = Integer.parseInt(JOptionPane.showInputDialog("La fila ingresada no es valida, por favor ingrese otra."));
        }
        fila--;
        return fila;
    }

    public void mostrarAsientos() {
        String nombreSala = JOptionPane.showInputDialog("Ingrese el nombre de la sala que desea visualizar: ");

        for (Cine sala : salas) {
            if (sala.getNombre().equalsIgnoreCase(nombreSala)) {
                JOptionPane.showMessageDialog(null, sala.mostrarAsientos());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la sala ingresada.");
            }
        }
    }

    public void mostrarSalas() {
        for (Cine sala : salas) {
            JOptionPane.showMessageDialog(null, "---------------" + sala.getNombre() + "---------------\n" + sala.getPelicula().mostrarPelicula() + "\n Precio de la entrada == " + sala.getPrecio() + " $");
        }
    }

    public void mostrarRegistrados() {
        String nombres = "";
        int num = 0;
        for (Espectador aux : espectadores) {
            num++;
            nombres += num + " == " + aux.getNombre()+"\n";
        }
        JOptionPane.showMessageDialog(null, nombres);
    }

    public void mostrarDatos() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        int num = 0;
        for (Espectador aux : espectadores) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, aux.mostrarPersona());
                num = 1;
            }
        }
        if (num == 0) {
            JOptionPane.showMessageDialog(null, "No estas registrado.");
        }
    }

}
