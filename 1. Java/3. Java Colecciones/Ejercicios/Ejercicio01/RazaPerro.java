
package Ejercicio01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class RazaPerro {

   
    public static void main(String[] args) {
      List<String> perros = new ArrayList();
      int menu = 0;
      
      while(menu != 2){
         String perro = JOptionPane.showInputDialog("Ingrese la raza del perro");
         perros.add(perro);
         menu = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar un perro\n2. Para salir"));
      }
      String msj = "";
        for (String perro : perros) {
             msj = msj +"\n"+perro;
        }
        
        JOptionPane.showMessageDialog(null, msj);
        perros.forEach((e) -> System.out.println(e));
    }
    
}
