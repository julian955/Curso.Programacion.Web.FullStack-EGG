package Tienda;


import Tienda.Servicios.FabricanteService;
import Tienda.Servicios.ProductoService;
import javax.swing.JOptionPane;

public class TiendaMain {

    public static void main(String[] args) throws Exception {
        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();

        String menu = "1.Para ver opciones sobre los productos\n2.Para ver opciones sobre los fabricantes\n3.Para ver ambas tablas\n4.Para salir";
        int men = 0;

        while (men != 4) {
            men = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (men) {
                case 1:
                    ps.menuProducto();
                    break;
                case 2:
                    fs.menuFabricante();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, ps.mostrarTodo());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa!.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, Ingrese otra.");
                    break;
                    

            }
        }

    }

}
