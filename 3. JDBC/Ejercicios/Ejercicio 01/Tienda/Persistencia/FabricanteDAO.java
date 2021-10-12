package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;
import java.util.ArrayList;
import java.util.Collection;

public class FabricanteDAO extends DAO {

    public void guardarFabricante(Fabricante fab) throws Exception {

        try {
            if (fab == null) {
                throw new Exception("El fabricante no es valido.");
            }

            String sql = "INSERT INTO fabricante (codigo,nombre)"
                    + "VALUES (" + fab.getCodigo() + " , '" + fab.getNombre() + "');";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarFabricante(String nombre,int cod) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("El fabricante no es valido.");
            }

            String sql = "UPDATE fabricante SET "
                    + "nombre = '" + nombre + "' WHERE codigo = " + cod + ";";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarFabricante(int cod) throws Exception {
        try {
            String sql = "DELETE FROM fabricante WHERE codigo = " + cod + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricantePorCodigo(int codigo) throws Exception {
        try {

            String sql = "SELECT * FROM fabricante "
                    + "WHERE codigo = " + codigo + ";";

            consultarBase(sql);

            Fabricante fab = null;

            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt(1));
                fab.setNombre(resultado.getString(2));
            }
            desconectarBase();

            return fab;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {
        try {

            String sql = "Select * FROM fabricante ;";
            consultarBase(sql);
            Fabricante fab = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt(1));
                fab.setNombre(resultado.getString(2));
                fabricantes.add(fab);
            }
            desconectarBase();
            return fabricantes;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

}
