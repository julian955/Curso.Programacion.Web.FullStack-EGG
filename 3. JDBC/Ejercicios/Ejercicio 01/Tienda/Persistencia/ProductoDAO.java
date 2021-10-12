package Tienda.Persistencia;

import Tienda.Entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;

public class ProductoDAO extends DAO {

    public void guardarProducto(Producto prod) throws Exception {

        try {
            if (prod == null) {
                throw new Exception("El fabricante no es valido.");
            }

            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante)"
                    + "VALUES (" + prod.getCodigo() + " , '" + prod.getNombre() + "'," + prod.getPrecio() + "," + prod.getCodigoFabricante() + ");";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarProducto(Producto prod, int cod) throws Exception {

        try {
            if (prod == null) {
                throw new Exception("El producto no es valido.");
            }

            String sql = "UPDATE producto SET "
                    + "nombre = '" + prod.getNombre() + "',precio = " + prod.getPrecio() + ",codigo_fabricante = " + prod.getCodigoFabricante() + " WHERE codigo = " + cod + ";";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarProducto(int cod) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo = " + cod + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto "
                    + "WHERE codigo = " + codigo + ";";

            consultarBase(sql);

            Producto prod = null;

            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
            }

            desconectarBase();

            return prod;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {

            String sql = "Select * FROM producto ;";
            consultarBase(sql);
            Producto prod = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Collection<String> mostrarNombres() throws Exception {
        try {
            String sql = "Select nombre FROM producto ORDER BY nombre ;";
            consultarBase(sql);

            Collection<String> productos = new ArrayList();
            while (resultado.next()) {
                productos.add(resultado.getString(1));
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Collection<Producto> buscarPorValores(int valor1, int valor2) throws Exception {
        try {

            String sql = "Select * FROM producto WHERE precio BETWEEN " + valor1 + " AND " + valor2 + " ORDER BY precio;";
            consultarBase(sql);
            Producto prod = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Collection<String> mostrarNombreYPrecio() throws Exception {
        try {
            String sql = "Select nombre,precio FROM producto ORDER BY nombre ;";
            consultarBase(sql);

            Collection<String> productos = new ArrayList();
            while (resultado.next()) {
                productos.add(resultado.getString(1) + " | " + resultado.getString(2));
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Collection<Producto> mostrarPortatiles() throws Exception {
        try {
            String sql = "Select * FROM producto WHERE nombre LIKE 'portatil%' ;";
            consultarBase(sql);
            Producto prod = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
                productos.add(prod);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Producto mostrarBarato() throws Exception {
        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1;";
            consultarBase(sql);
            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return prod;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public Collection<String> mostrarTodo() throws Exception {
        try {
            String sql = "SELECT * FROM producto p INNER JOIN fabricante f ON f.codigo = p.codigo_fabricante ORDER BY p.nombre";
            consultarBase(sql);

            Collection<String> productos = new ArrayList();
            while (resultado.next()) {
                productos.add(resultado.getString(1) + " | " + resultado.getString(2) + " | " + resultado.getDouble(3) + " | " + resultado.getInt(4) + " | " + resultado.getInt(5) + " | " + resultado.getString(6));

            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

}
