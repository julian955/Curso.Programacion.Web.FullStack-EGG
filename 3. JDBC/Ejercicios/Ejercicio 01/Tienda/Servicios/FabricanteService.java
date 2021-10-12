package Tienda.Servicios;

import Tienda.Entidades.Fabricante;
import Tienda.Persistencia.FabricanteDAO;
import java.util.Collection;
import javax.swing.JOptionPane;

public class FabricanteService {

    FabricanteDAO fd = new FabricanteDAO();

    public Fabricante crearFabricante() {
        try {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del fabricante: "));
            String nombre = JOptionPane.showInputDialog("Introduce el nombre del fabricante: ");

            return new Fabricante(codigo, nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public String mostrarFabricantes() throws Exception {
        try {
            String aux = "";
            Collection<Fabricante> lista = fd.listarFabricantes();

            for (Fabricante aux1 : lista) {
                aux += aux1.mostrarDatos() + "\n";
            }

            return aux;
        } catch (Exception e) {
            throw e;
        }
    }

    public void menuFabricante() throws Exception {
        try {
            String menu = "1.Para agregar un fabricante\n2.Para eliminar un fabricante\n3.Para modificar un fabricante\n4.Para buscar un fabricante por codigo\n5.Para ver todos los fabricante\n6.Para volver atras.";
            int men = 0, cod = 0;
            Fabricante fab = null;

            men = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (men) {
                case 1:
                    fab = crearFabricante();
                    fd.guardarFabricante(fab);
                    JOptionPane.showMessageDialog(null, "El fabricante se agrego correctamente!.");
                    break;
                case 2:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del fabricante que desea eliminar: "));
                    fd.eliminarFabricante(cod);
                    JOptionPane.showMessageDialog(null, "El fabricante se elimino correctamente!.");
                    break;
                case 3:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desea modificar: "));
                    JOptionPane.showMessageDialog(null, "Ingrese los nuevos datos a continuacion: ");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                    fd.modificarFabricante(nombre, cod);
                    JOptionPane.showMessageDialog(null, "El fabricante se modifico correctamente!.");
                    break;
                case 4:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del fabricante que desea buscar: "));
                    fab = fd.buscarFabricantePorCodigo(cod);
                    JOptionPane.showMessageDialog(null, fab.mostrarDatos());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, mostrarFabricantes());
                    break;

            }
        } catch (Exception e) {
            throw e;
        }
    }

}
