package libreria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.servicios.EditorialService;

public class Test {

    public static void main(String[] args) {
        EditorialService es = new EditorialService();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

//        es.guardarEditorial();
        // es.buscarEditorialPorId();
//        es.eliminarEditorial();
        //  es.buscarEditorialPorNombre();
        // es.modificarEditorial();
    }

}
