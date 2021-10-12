
package Extra02;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CantanteMain {

    public static void main(String[] args) {
       List<Cantante> cantantes = new ArrayList();
       CantanteService cs = new CantanteService();
       
       int menu = 0;
       String menus = "1. Para agregar un cantante\n2. Para eliminar un cantante\n3. Para mostrar todos los cantante\n4. Para salir";
       
        cantantes.add(new Cantante("L-Gante","Malianteo 420"));
        cantantes.add(new Cantante("Zaramay","Los Intocables"));
        cantantes.add(new Cantante("Leo Mattioli","Hay amor"));
       while(menu != 4){
           
           menu = Integer.parseInt(JOptionPane.showInputDialog(menus));
           
           switch(menu){
               case 1:
                   cs.agregarCantante(cantantes);
                   break;
               case 2:
                   String nombre = JOptionPane.showInputDialog("Ingrese el cantante que desea eliminar");
                   cs.eliminarCantante(cantantes, nombre);
                   break;
               case 3:
                   cs.mostrarCantante(cantantes);
                   break;
               case 4:
                   JOptionPane.showMessageDialog(null, "El programa finalizo correctamente.");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opcion invalida, por favor ingrese otra.");
                   break;
           }
       }
    }
    
}
