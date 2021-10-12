package Estancias.persistencia;

import Estancias.entidades.Casa;
import Estancias.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

public class CasasDAO extends DAO {

    public Collection<Casa> disponibleAgosto() throws Exception {
        try {
            String sql = "SELECT * FROM casas WHERE  MONTH(fecha_desde) = 08 AND pais = 'Reino Unido';";
            consultarBase(sql);
            Casa casa = null;
            Collection<Casa> casas = new ArrayList();

            while (resultado.next()) {
                casa = new Casa();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getInt(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));

                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Casa> disponibleDiaMes(int dia, int mes) throws Exception {
        try {
            String sql = "SELECT * FROM casas WHERE  DAY(fecha_desde) = " + dia + " AND MONTH(fecha_desde) = " + mes + ";";
            consultarBase(sql);
            Casa casa = null;
            Collection<Casa> casas = new ArrayList();

            while (resultado.next()) {
                casa = new Casa();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getInt(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setFecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));

                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
