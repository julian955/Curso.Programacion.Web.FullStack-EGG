package Ejercicio06;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class TiendaMain {

    public static void main(String[] args) {
        TiendaService ts = new TiendaService();
        HashMap<String, Integer> productos = new HashMap();

        String menu1 = "1. Para agregar un producto\n2. Para modificar el precio de un producto\n3. Para eliminar un producto\n4. Mostrar productos\n5. Para salir.";
        int menu = 0;

        while (menu != 5) {
            menu = Integer.parseInt(JOptionPane.showInputDialog(menu1));

            switch (menu) {
                case 1:
                    ts.agregarProductos(productos);
                    break;
                case 2:
                    String prod = JOptionPane.showInputDialog("Que producto desea modificar?");
                    int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio"));
                    ts.modificarPrecio(productos, precio, prod);
                    break;
                case 3:
                    prod = JOptionPane.showInputDialog("Que producto desea eliminar?");
                    ts.eliminarProducto(productos, prod);
                    break;
                case 4:
                    ts.mostrarProductos(productos);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "El programa finalizo correctamente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta,Por favor seleccione otra.");
                    break;
            }
        }
    }

}
