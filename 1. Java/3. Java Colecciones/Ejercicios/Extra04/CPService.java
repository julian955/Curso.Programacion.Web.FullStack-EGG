package Extra04;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class CPService {

    HashMap<String, Integer> datos;

    public CPService() {
        datos = new HashMap();
        datos.put("Argentina,Mendoza", 5521);
        datos.put("Alemania,Berlin", 12487);
        datos.put("Japon,Tokio", 1900100);
        datos.put("Brazil,Rio de janeiro", 26180410);
        datos.put("España,Santander", 39012);
        datos.put("Chile,Concon", 2510000);
        datos.put("EEUU,Washington", 20373);
        datos.put("EEUU,California", 95709);
        datos.put("EEUU,Texas", 75832);
        datos.put("EEUU,Hawaii", 96704);
        datos.put("Argentina,Mendoza", 5521);
    }

    public CodigoPostal crearCP() {
        String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad: ");
        Integer cp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo postal: "));

        return new CodigoPostal(ciudad, cp);
    }

    public void agregarCP() {
        CodigoPostal cp = crearCP();
        datos.put(cp.getCiudad(), cp.getCp());
        JOptionPane.showMessageDialog(null, "La ciudad se agrego correctamente!");
    }

    public void eliminarCP(String ciudad) {
        int n = 0;
        for (Map.Entry<String, Integer> entry : datos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(ciudad)) {
                datos.remove(entry.getKey());
                JOptionPane.showMessageDialog(null, "La ciudad se elimino correctamente.");
                n = 1;
                break;
            }

        }
        if (n == 0) {
            JOptionPane.showMessageDialog(null, "La ciudad ingresada no se encuentra en la lista.");
        }
    }

    public void buscarCP() {
        String menux = "1. Para buscar por nombre de ciudad\n2. Para buscar por codigo postal\n3. Para volver al menu anterior";
        int menu = 0;

        while (menu < 1 || menu > 4) {
            menu = Integer.parseInt(JOptionPane.showInputDialog(menux));
            int aux = 0;
            if (menu == 1) {
                String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad a buscar ");
                for (Map.Entry<String, Integer> entry : datos.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(ciudad)) {
                        JOptionPane.showMessageDialog(null, " Ciudad: " + entry.getKey() + "  ||  CP: " + entry.getValue());
                        aux = 1;
                        break;
                    }

                }
                if (aux == 0) {
                    JOptionPane.showMessageDialog(null, "No se encontro la ciudad ingresada");
                }
            } else if (menu == 2) {
                aux = 0;
                int cp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo postal a buscar: "));
                for (Map.Entry<String, Integer> entry : datos.entrySet()) {
                    if (cp == entry.getValue()) {
                        JOptionPane.showMessageDialog(null, " Ciudad: " + entry.getKey() + "  ||  CP: " + entry.getValue());
                        aux = 1;
                        break;
                    }

                }
                if (aux == 0) {
                    JOptionPane.showMessageDialog(null, "No se encontro el codigo postal ingresado");
                }
            } else if (menu == 3) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opcion incorrecta,Por favor ingrese otra.");
            }
        }
    }

    public void mostrarCP() {
        String aux = "";
        int n = 0;
        for (Map.Entry<String, Integer> entry : datos.entrySet()) {
            n++;
            aux = aux + n + "  ==  Ciudad: " + entry.getKey() + "  ||  CP: " + entry.getValue() + "\n";

        }
        JOptionPane.showMessageDialog(null, aux);
    }
}
