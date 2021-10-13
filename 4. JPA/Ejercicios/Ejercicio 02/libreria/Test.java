package libreria;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.servicios.EditorialService;

public class Test {

    public static void main(String[] args) {
//        EditorialService es = new EditorialService();
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
//        EntityManager em = emf.createEntityManager();

//        es.guardarEditorial();
        // es.buscarEditorialPorId();
//        es.eliminarEditorial();
        //  es.buscarEditorialPorNombre();
        // es.modificarEditorial();
//        String id = UUID.randomUUID().toString();
//        System.out.println(id);
        Date tipoDate = new Date();
        LocalDateTime date = LocalDateTime.now();
        
        System.out.println("1: "+date);
       Instant instante = date.toInstant(ZoneOffset.UTC);
       tipoDate = Date.from(instante);
        System.out.println(tipoDate.toString());

        
    }

}
