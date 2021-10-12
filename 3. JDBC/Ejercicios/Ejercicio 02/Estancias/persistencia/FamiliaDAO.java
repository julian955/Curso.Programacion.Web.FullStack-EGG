package Estancias.persistencia;

import Estancias.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

public class FamiliaDAO extends DAO {

    public Collection<Familia> familia3Hijos() throws Exception {
        try {
            String sql = "SELECT * FROM familias WHERE num_hijos >= 3 AND edad_maxima < 10;";
            consultarBase(sql);
            Familia fam = null;
            Collection<Familia> familias = new ArrayList();

            while (resultado.next()) {
                fam = new Familia();
                fam.setId(resultado.getInt(1));
                fam.setNombre(resultado.getString(2));
                fam.setEdad_minima(resultado.getInt(3));
                fam.setEdad_maxima(resultado.getInt(4));
                fam.setNum_hijos(resultado.getInt(5));
                fam.setEmail(resultado.getString(6));
                fam.setId_casa_familia(resultado.getInt(7));
                familias.add(fam);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
     public Collection<Familia> familiaHotmail() throws Exception {
        try {
            String sql = "SELECT * FROM familias WHERE email LIKE '%hotmail%';";
            consultarBase(sql);
            Familia fam = null;
            Collection<Familia> familias = new ArrayList();

            while (resultado.next()) {
                fam = new Familia();
                fam.setId(resultado.getInt(1));
                fam.setNombre(resultado.getString(2));
                fam.setEdad_minima(resultado.getInt(3));
                fam.setEdad_maxima(resultado.getInt(4));
                fam.setNum_hijos(resultado.getInt(5));
                fam.setEmail(resultado.getString(6));
                fam.setId_casa_familia(resultado.getInt(7));
                familias.add(fam);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
