
package Extra04;

import javax.swing.JOptionPane;


public class CPMain {

   
    public static void main(String[] args) {
        CPService cp = new CPService();
        
        int menu = 0;
        String menux = "1. Para agregar una ciudad\n2. Para buscar una ciudad\n3. Para eliminar una ciudad\n4. Para mostrar todas las ciudades\n5. Para salir";
        
        while(menu != 5){
            menu = Integer.parseInt(JOptionPane.showInputDialog(menux));
            
            switch(menu){
                case 1:
                    cp.agregarCP();
                    break;
                case 2:
                    cp.buscarCP();
                    break;
                case 3:
                    String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad a eliminar: ");
                    cp.eliminarCP(ciudad);
                    break;
                case 4:
                    cp.mostrarCP();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "El programa finalizo correctamente!");
                    break;
                default :
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta,Por favor seleccione otra");
                    break;
            }
        
        
        }
    }
    
}
