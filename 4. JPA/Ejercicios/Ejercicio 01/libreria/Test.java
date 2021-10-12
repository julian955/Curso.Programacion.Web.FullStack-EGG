package libreria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import libreria.servicios.EditorialService;

public class Test {

    public static void main(String[] args) throws Exception {
//        EditorialService es = new EditorialService();
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
//        EntityManager em = emf.createEntityManager();
        
        
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del autor");
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("El nombre no puede estar vacio.");
            }

//        es.guardarEditorial();
        // es.buscarEditorialPorId();
//        es.eliminarEditorial();
        //  es.buscarEditorialPorNombre();
        // es.modificarEditorial();
    }

}
