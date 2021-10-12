package Extra03;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Servicio {

    List<Hotel> hoteles;
    List<AlojamientoExtra> extras;

    public Servicio() {
        hoteles = new ArrayList();
        extras = new ArrayList();
    }

    public Hotel4E crearH4E() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        int pisos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los pisos del hotel: "));
        int habitaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las habitaciones del hotel: "));
        int camas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camas que tiene el hotel: "));
        String gim = JOptionPane.showInputDialog("Ingrese la categoria del gimnacio (A/B) ");
        char gym;
        if (gim.equalsIgnoreCase("a")) {
            gym = 'A';
        } else {
            gym = 'B';
        }
        String nombreRest = JOptionPane.showInputDialog("Ingrese el nombre del restaurante: ");
        int capacidadRestaurant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del restaurante: "));

        double precio = 50 + camas;

        if (capacidadRestaurant < 30) {
            precio += 10;
        } else if (capacidadRestaurant < 50) {
            precio += 30;
        } else {
            precio += 50;
        }

        if (gym == 'A') {
            precio += 50;
        } else {
            precio += 30;
        }

        return new Hotel4E(gym, nombreRest, capacidadRestaurant, nombre, habitaciones, camas, pisos, precio);
    }

    public Hotel5E crearH5E() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        int pisos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los pisos del hotel: "));
        int habitaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las habitaciones del hotel: "));
        int camas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camas que tiene el hotel: "));
        String gim = JOptionPane.showInputDialog("Ingrese la categoria del gimnacio (A/B) ");
        char gym;
        if (gim.equalsIgnoreCase("a")) {
            gym = 'A';
        } else {
            gym = 'B';
        }
        String nombreRest = JOptionPane.showInputDialog("Ingrese el nombre del restaurante: ");
        int capacidadRestaurant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del restaurante: "));
        int salonesConf = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los salones de conferencia: "));
        int suit = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de suits: "));
        int cantLimusinas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de limusinas: "));

        double precio = 50 + camas + (15 * cantLimusinas);

        if (capacidadRestaurant < 30) {
            precio += 10;
        } else if (capacidadRestaurant < 50) {
            precio += 30;
        } else {
            precio += 50;
        }

        if (gym == 'A') {
            precio += 50;
        } else {
            precio += 30;
        }

        return new Hotel5E(salonesConf, suit, cantLimusinas, gym, nombreRest, capacidadRestaurant, nombre, habitaciones, camas, pisos, precio);
    }

    public Residencia crearResidencia() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        int metros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los metros de la residencia: "));
        int aux = Integer.parseInt(JOptionPane.showInputDialog("El establecimiento es privado? (1.SI/2.NO) "));
        boolean privado;
        privado = aux == 1;

        int aux1 = Integer.parseInt(JOptionPane.showInputDialog("El establecimiento posee campo deportivo? (1.SI/2.NO) "));
        boolean campoDep;
        campoDep = aux1 == 1;
        int aux2 = Integer.parseInt(JOptionPane.showInputDialog("El establecimiento tiene descuento a gremios? (1.SI/2.NO) "));
        boolean descGremio;
        descGremio = aux2 == 1;

        return new Residencia(metros, descGremio, campoDep, nombre, privado, metros);
    }

    public Camping crearCamping() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        int metros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los metros de la residencia: "));
        int aux = Integer.parseInt(JOptionPane.showInputDialog("El establecimiento es privado? (1.SI/2.NO) "));
        boolean privado;
        privado = aux == 1;

        int aux1 = Integer.parseInt(JOptionPane.showInputDialog("El establecimiento posee restaurante? (1.SI/2.NO) "));
        boolean restaurant;
        restaurant = aux1 == 1;

        int capCarpas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad maxima de carpas: "));
        int banos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de baños del camping: "));

        return new Camping(capCarpas, banos, restaurant, nombre, privado, metros);
    }

    public void agregarAlojamiento() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar un hotel\n2. Para agregar una residencia o camping\n3. Para volver atras "));

        if (menu == 1) {
            int menu1 = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar un hotel 4 estrellas\n2. Para agregar un hotel 5 estrellas"));
            switch (menu1) {
                case 1:
                    hoteles.add(crearH4E());
                    JOptionPane.showMessageDialog(null, "El hotel se agrego correctamente.");
                    break;
                case 2:
                    hoteles.add(crearH5E());
                    JOptionPane.showMessageDialog(null, "El hotel se agrego correctamente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    break;
            }
        } else if (menu == 2) {
            int menu1 = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar una residencia\n2. Para agregar un camping"));
            switch (menu1) {
                case 1:
                    extras.add(crearResidencia());
                    JOptionPane.showMessageDialog(null, "La residencia se agrego correctamente.");
                    break;
                case 2:
                    extras.add(crearCamping());
                    JOptionPane.showMessageDialog(null, "El camping se agrego correctamente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    break;
            }
        }
    }

    public void eliminarAlojamiento() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("1. Para eliminar un hotel\n2. Para eliminar una residencia o camping\n3. Para volver atras "));
        int num = 0;
        if (menu == 1) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
            for (Hotel aux : hoteles) {
                if (aux.getNombre().equalsIgnoreCase(nombre)) {
                    hoteles.remove(aux);
                    num++;
                    JOptionPane.showMessageDialog(null, "El hotel se elimino correctamente.");
                    break;
                }

            }
            if (num == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro el hotel.");
            }
        } else if (menu == 2) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
            for (AlojamientoExtra extra : extras) {
                if (extra.getNombre().equalsIgnoreCase(nombre)) {
                    extras.remove(extra);
                    num++;
                    JOptionPane.showMessageDialog(null, "El alojamiento se elimino correctamente.");
                    break;

                }
            }
            if (num == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro el alojamiento.");
            }
        }
    }

    public void mostrarHoteles() {

        if (hoteles.size() > 0) {
            for (Hotel aux : hoteles) {
                JOptionPane.showMessageDialog(null, aux.mostrarDatos());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay hoteles registrados");
        }

    }

    public void mostrarExtras() {
        if (extras.size() > 0) {
            for (AlojamientoExtra extra : extras) {
                JOptionPane.showMessageDialog(null, extra.mostrarDatos());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay alojamientos registrados");
        }

    }

    public void mostrarLista() {
        String lista = "Alojamientos Disponibles: \n"+"       HOTELES\n";
        int num = 0;

        for (Hotel aux : hoteles) {
            num++;
            lista += num + " ==  Nombre: " + aux.getNombre() + " Precio: " + aux.getPrecio() + " $\n";
        }

        lista += "--------------------------------------------------------\n"+"       RESIDENCIAS & CAMPING\n";

        for (AlojamientoExtra extra : extras) {
            num++;
            lista += num + " ==  Nombre: " + extra.getNombre() + "\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }
}
