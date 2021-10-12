package Tienda.Servicios;

import Tienda.Entidades.Producto;
import Tienda.Persistencia.ProductoDAO;
import java.util.Collection;
import javax.swing.JOptionPane;

public class ProductoService {

    ProductoDAO pd = new ProductoDAO();

    public Producto crearProducto() {
        try {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del producto: "));
            String nombre = JOptionPane.showInputDialog("Introduce el nombre del producto: ");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto: "));
            int codigoFabricante = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del fabricante: "));

            return new Producto(codigo, nombre, precio, codigoFabricante);

        } catch (Exception e) {
            throw e;
        }

    }

    public String mostrarProductos() throws Exception {
        try {
            String aux = "";
            Collection<Producto> lista = pd.listarProductos();

            for (Producto aux1 : lista) {
                aux += aux1.mostrarproducto() + "\n";
            }

            return aux;
        } catch (Exception e) {
            throw e;
        }
    }

    public String mostrarNombres() throws Exception {
        String aux = "";
        Collection<String> lista = pd.mostrarNombres();

        for (String string : lista) {
            aux += string + "\n";
        }
        return aux;
    }

    public String mostrarProductosPorValores() throws Exception {
        try {
            String aux = "";
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
            Collection<Producto> lista = pd.buscarPorValores(valor1, valor2);

            for (Producto aux1 : lista) {
                aux += aux1.mostrarproducto() + "\n";
            }

            return aux;
        } catch (Exception e) {
            throw e;
        }
    }

    public String mostrarPortatiles() throws Exception {
        try {
            String aux = "";
            Collection<Producto> lista = pd.mostrarPortatiles();

            for (Producto aux1 : lista) {
                aux += aux1.mostrarproducto() + "\n";
            }

            return aux;
        } catch (Exception e) {
            throw e;
        }
    }

    public String mostrarNombreyPrecio() throws Exception {
        String aux = "";
        Collection<String> lista = pd.mostrarNombreYPrecio();

        for (String string : lista) {
            aux += string + "\n";
        }
        return aux;
    }

    public String mostrarTodo() throws Exception {
        String aux = "";
        Collection<String> lista = pd.mostrarTodo();

        for (String string : lista) {
            aux += string + "\n";
        }
        return aux;
    }

    public void menuProducto() throws Exception {
        try {
            String menu = "1.Para agregar un producto\n2.Para eliminar un producto\n3.Para modificar un producto\n4.Para buscar un producto por codigo\n5.Para ver todos los productos\n6.Para ver solamente los nombres\n7.Para buscar productos entre 2 precios\n8.Mostrar producto y precio\n9.Para ver los portatiles\n10.Para ver el producto mas barato\n11.Para volver atras.";
            int men = 0, cod = 0;
            Producto prod = null;

            men = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (men) {
                case 1:
                    prod = crearProducto();
                    pd.guardarProducto(prod);
                    JOptionPane.showMessageDialog(null, "El producto se agrego correctamente!.");
                    break;
                case 2:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desea eliminar: "));
                    pd.eliminarProducto(cod);
                    JOptionPane.showMessageDialog(null, "El producto se elimino correctamente!.");
                    break;
                case 3:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desea modificar: "));
                    JOptionPane.showMessageDialog(null, "Ingrese los nuevos datos a continuacion: ");
                    prod = crearProducto();
                    pd.modificarProducto(prod, cod);
                    JOptionPane.showMessageDialog(null, "El producto se modifico correctamente!.");
                    break;
                case 4:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desea buscar: "));
                    prod = pd.buscarProductoPorCodigo(cod);
                    JOptionPane.showMessageDialog(null, prod.mostrarproducto());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, mostrarProductos());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, mostrarNombres());
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, mostrarProductosPorValores());
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, mostrarNombreyPrecio());
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, mostrarPortatiles());
                    break;
                case 10:
                    prod = pd.mostrarBarato();
                    JOptionPane.showMessageDialog(null, prod.mostrarproducto());
                    break;

            }
        } catch (Exception e) {
            throw e;
        }
    }

}
