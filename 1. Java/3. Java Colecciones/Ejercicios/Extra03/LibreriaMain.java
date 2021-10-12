
package Extra03;

import javax.swing.JOptionPane;


public class LibreriaMain {

  
    public static void main(String[] args) {
        LibreriaService ls = new LibreriaService();
        
        String menux = "1. Para agregar un libro\n2. Para eliminar un libro\n3. Para solicitar un libro\n4. Para devolver un libro\n5. Para ver la lista de libros\n6. Para salir";
        int menu = 0;
        String libro;
        
        while(menu != 6){
            menu = Integer.parseInt(JOptionPane.showInputDialog(menux));
            
            switch(menu){
                case 1:
                    ls.agregarLibros();
                    break;
                case 2:
                    libro = JOptionPane.showInputDialog("Ingrese el libro a eliminar: ");
                    ls.eliminarLibro(libro);
                    break;
                case 3:
                    libro = JOptionPane.showInputDialog("Ingrese el libro deseado: ");
                    ls.prestarLibro(libro);
                    break;
                case 4:
                    libro = JOptionPane.showInputDialog("Ingrese el libro a devolver: ");
                    ls.devolverLibro(libro);
                    break;
                case 5:
                    ls.mostrarLibros();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "El programa finalizo correctamente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, por favor seleccione otra.");
                    break;
            }
        
        }
    }
    
}
