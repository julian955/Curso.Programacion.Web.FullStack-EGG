
package Estancias;

import Estancias.entidades.Casa;
import Estancias.entidades.Familia;
import Estancias.persistencia.CasasDAO;
import Estancias.persistencia.FamiliaDAO;
import java.util.ArrayList;
import java.util.Collection;

public class Test {

    public static void main(String[] args) throws Exception {
        CasasDAO cd = new CasasDAO();
        FamiliaDAO fd = new FamiliaDAO();
        
        Collection<Casa> test = cd.disponibleAgosto();
        Collection<Familia> fam = fd.familia3Hijos();
        
//        for (Casa casa : test) {
//            System.out.println(casa.toString());
//        }
        
        for (Familia familia : fam) {
            System.out.println(familia.toString());
        }
        
    }
    
}
