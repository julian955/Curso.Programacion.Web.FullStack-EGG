
package Extra01;

import javax.swing.JOptionPane;

public class Main {
  
    public static void main(String[] args) {
       Servicio sv = new Servicio();
       
       
       String menu = "1. Para ingresar un cliente\n2. Para mostrar clientes\n3. Para eliminar un cliente\n4. Para salir";
       int menun = 0;
       
       while(menun != 4){
           menun = Integer.parseInt(JOptionPane.showInputDialog(menu));
           
           switch(menun){
               case 1:
                   sv.agregarBarco();
                   break;
               case 2:
                   sv.mostrarLista();
                   break;
               case 3:
                   sv.eliminarCliente();
                   break;
               case 4:
                   JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa.");
                   break;
               default: 
                   JOptionPane.showMessageDialog(null, "Opcion invalida,seleccione otra.");
                   break;
           }
       }
    }
    
}
