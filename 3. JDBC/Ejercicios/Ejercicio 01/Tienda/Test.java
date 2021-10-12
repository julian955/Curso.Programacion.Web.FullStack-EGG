package Tienda;

import Tienda.Entidades.Fabricante;
import Tienda.Persistencia.FabricanteDAO;
import Tienda.Entidades.Producto;
import Tienda.Persistencia.FabricanteDAO;
import Tienda.Persistencia.ProductoDAO;
import Tienda.Servicios.ProductoService;
import java.util.Collection;

public class Test {

    public static void main(String[] args) throws Exception {
           ProductoService ps = new ProductoService();
//        ProductoDAO prod = new ProductoDAO();
//        Collection<Producto> lista = prod.listarProductos();
//        Producto prod1 = prod.buscarProductoPorCodigo(5);
//        System.out.println(prod1.toString());
           System.out.println(ps.mostrarNombres());
//        Producto prod2 = new Producto(20, "Disco Externo SSD", 2550, 3);
//        prod.guardarProducto(prod2);
//        prod.modificarProducto(prod2);
//        prod.eliminarProducto(prod2);
//        for (Producto aux : lista) {
//            System.out.println(aux.toString());
//        }
        /*------------------------------------------------------------------------*/
//        FabricanteDAO fab = new FabricanteDAO();
//        Collection<Fabricante> listafab = fab.listarFabricantes();
//        Fabricante fab1 = fab.buscarFabricantePorCodigo(2);
//        System.out.println(fab1.toString());
//
//        Fabricante fab2 = new Fabricante(20, "Julian");
//        fab.guardarFabricante(fab2);
//        Fabricante fab2 = new Fabricante(20, "Julian Greco");
//        fab.modificarFabricante(fab2);
//        fab.eliminarFabricante(fab2);
//
//        for (Fabricante aux : listafab) {
//            System.out.println(aux.toString());
//        }

    }

}
