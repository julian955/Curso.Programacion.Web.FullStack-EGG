
package Extra13;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AutoMain {

   
    public static void main(String[] args) {
      List<Auto> lista = new ArrayList();
      AutoEntidad ae = new AutoEntidad();
     
      
      int menu = 0;
      String newTitular = "";
      String Menu = "1. Agregar un auto\n2. Mostrar los  registrados\n"
                  + "3. Modificar el titular de un auto\n4. Registrar km en el auto\n"
                  + "5. Verificar service\n6. Mostrar datos\n7. Salir";
      
      
      while(menu != 7){
        menu = Integer.parseInt(JOptionPane.showInputDialog(Menu));
        
        switch(menu){
            case 1:
                Auto a = ae.crearAuto();
                lista.add(a);
                break;
            case 2:
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println((i+1)+". "+lista.get(i).getNombre()+" "+lista.get(i).getModelo());
                }
                break;
            case 3:
                int aux = Integer.parseInt(JOptionPane.showInputDialog("Que auto desea modificar?"));
                aux = aux -1;
               ae.modificarTitular(lista.get(aux));
                break;
            case 4:
                aux = Integer.parseInt(JOptionPane.showInputDialog("Que auto utilizo para el recorrido?"));
                aux = aux -1;
               ae.modificarKM(lista.get(aux));
               break;            
            case 5:
                aux = Integer.parseInt(JOptionPane.showInputDialog("De que auto desea comprobar el service?"));
                aux = aux -1;
                ae.verificarService(lista.get(aux));
                break;
            case 6:
                aux = Integer.parseInt(JOptionPane.showInputDialog("De que auto desea ver los datos?"));
                aux = aux -1;
                ae.mostrarDatos(lista.get(aux));
                break;
            case 7:
                System.out.println("El programa finalizo correctamente.");
                break;
            default:
                 JOptionPane.showMessageDialog(null,"Opcion invalida, seleccione otra.");
                 break;
        }
      
      }

    }
    
    
    
}
