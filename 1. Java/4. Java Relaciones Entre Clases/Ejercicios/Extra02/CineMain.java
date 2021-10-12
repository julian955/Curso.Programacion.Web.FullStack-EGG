
package Extra02;

import javax.swing.JOptionPane;


public class CineMain {

  
    public static void main(String[] args) {
       
        Servicio sv = new Servicio();
       String menu = "1. Para crear una sala\n2. Para ver las salas\n3. Para registrarse\n4. Para ver los registrados\n"
               + "5. Para ver mis datos\n6. Para comprar una entrada\n7. Para ver asientos disponibles\n8. Para salir";
       
       int menuN = 0;
       
       while(menuN != 8){
            menuN = Integer.parseInt(JOptionPane.showInputDialog(menu));
           switch(menuN){
               case 1:
                   sv.agregarSala();
                   break;
               case 2:
                   sv.mostrarSalas();
                   break;
               case 3:
                   sv.agregarEspectador();
                   break;
               case 4:
                   sv.mostrarRegistrados();
                   break;
               case 5:
                   sv.mostrarDatos();
                   break;
               case 6:
                   sv.ingresoASala();
                   break;
               case 7:
                   sv.mostrarAsientos();
                   break;
               case 8:
                   JOptionPane.showMessageDialog(null, "Gracias vuelva pronto");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opcion incorrecta, Por favor ingrese otra.");
                   break;
           }
       }
    }
    
}
