package Ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class RazaPerro {

    public static void main(String[] args) {
        List<String> perros = new ArrayList();
//        perros.add("asd");
//        perros.add("222");
//        perros.add("333");

        int menu = 0;

        while (menu != 3) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar un perro\n2. Para Eliminar un perro\n3. Para salir"));
            switch (menu) {
                case 1:
                    String perro = JOptionPane.showInputDialog("Ingrese la raza del perro");
                    perros.add(perro);
                    break;
                case 2:
                    Iterator<String> it = perros.iterator();
                    String eliminar = JOptionPane.showInputDialog("Ingrese el perro a eliminar");
                    while (it.hasNext()) {
                        String aux = it.next();
                        if (aux.equals(eliminar)) {
                            it.remove();
                        }

                    }
                    break;
                case 3:
                    String msj = "";
                    for (String perro2 : perros) {
                        msj = msj + "\n" + perro2;
                    }
                    JOptionPane.showMessageDialog(null, msj);
                    break;
                default:
                  JOptionPane.showMessageDialog(null, "Opcion Invalida, Seleccione otra."); 
                   break; 
            }
        }

        
        perros.forEach((e) -> System.out.println(e));
//
//        perros.forEach((e) -> System.out.println(e));
    }

}
