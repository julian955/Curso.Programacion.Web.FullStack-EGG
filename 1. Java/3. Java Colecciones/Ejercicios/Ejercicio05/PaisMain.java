
package Ejercicio05;

import java.util.HashSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class PaisMain {

   
    public static void main(String[] args) {
       PaisService ps = new PaisService();
       TreeSet<Pais> paises = new TreeSet();
       
       paises.add(new Pais("Brazil"));
       paises.add(new Pais("Argentina"));
       paises.add(new Pais("Chile"));
       paises.add(new Pais("Brazil"));
        
       String menu1 = "1. Para agregar un pais\n2. Para eliminar un pais\n3. Para mostrar los paises\n4. Para salir";
       int menu = 0;
       
       while(menu != 4){
           menu = Integer.parseInt(JOptionPane.showInputDialog(menu1));
           switch(menu){
               case 1:
                   ps.agregarPais(paises);
                   break;
               case 2:
                   String eliminar = JOptionPane.showInputDialog("Ingrese el pais a eliminar");
                   ps.eliminarPais(paises, eliminar);
                   break;
               case 3:
                   ps.mostrarPaises(paises);
                   break;
               case 4:
                   JOptionPane.showMessageDialog(null, "El programa finalizo correctamente.");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opcion no valida, seleccione otra.");
                   break;
           }
       }
    }
    
}
