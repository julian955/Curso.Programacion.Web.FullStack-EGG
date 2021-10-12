
package Extra03;

import javax.swing.JOptionPane;

public class Main {

   
    public static void main(String[] args) {
        Servicio sv = new Servicio();
      String menu = "1. Para agregar una poliza\n2. Para eliminar una poliza\n3. Para ver clientes\n4. Para pagar una cuota\n5. Para ver cuotas\n6. Para ver una poliza\n7. Para salir";
       int menuN = 0;
       
       while(menuN != 7){
            menuN = Integer.parseInt(JOptionPane.showInputDialog(menu));
           switch(menuN){
               case 1:
                   sv.agregarPoliza();
                   break;
               case 2:
                   sv.eliminarPoliza();
                   break;
               case 3:
                   sv.mostrarClientes();
                   break;
               case 4:
                   sv.pagarCuota();
                   break;
               case 5:
                   sv.verCuotas();
                   break;
               case 6:
                   sv.verPoliza();
                   break;
               case 7:
                   JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema.");
                   break;             
               default:
                   JOptionPane.showMessageDialog(null, "Opcion incorrecta, Por favor ingrese otra.");
                   break;
           }
       }
    }
    
}
