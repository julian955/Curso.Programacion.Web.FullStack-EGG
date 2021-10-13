package libreria.servicios;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

public class PrestamoService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private EntityManager em = emf.createEntityManager();
    private LibroService ls = new LibroService();
    private ClienteService cs = new ClienteService();

    public PrestamoService() {

    }

    public void menuPrestamo() {
        try {
            String menu = "1. Para generar un prestamo\n2. Para devolver un libro\n3. Para extender un prestamo\n4. Para ver todos los prestamos\n5. Para volver atras";
            int select = 0;
            select = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (select) {
                case 1:
                    generarPrestamo();
                    break;
                case 2:
                    devolucion();
                    break;
                case 3:
                    actualizarPrestamo();
                    break;
                case 4:
                    mostrarPrestamos(bucarPrestamos());
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public void generarPrestamo() {
        try {
            Date prestamo = new Date();
            Date devolucion = new Date();
            Cliente cliente = cs.devCliente();
            Libro libro = ls.devLibro();
            String id = UUID.randomUUID().toString();
            LocalDateTime prestamold = LocalDateTime.now();
            LocalDateTime devolucionld = LocalDateTime.now().plusDays(10);
            Instant prestamoI = prestamold.toInstant(ZoneOffset.UTC);
            Instant devolucionI = devolucionld.toInstant(ZoneOffset.UTC);
            prestamo = Date.from(prestamoI);
            devolucion = Date.from(devolucionI);

            if (cliente != null && libro != null && libro.getEjemplaresRestante() > 0) {
                Prestamo prest = new Prestamo(id, prestamo, devolucion, libro, cliente);
                em.getTransaction().begin();
                em.persist(prest);
                em.getTransaction().commit();
                ls.prestamo(libro.getIsbn());
                JOptionPane.showMessageDialog(null, "Se realizo el prestamo correctamente!\n Recuerde que tiene 10 dias para devolverlo o actualizar el prestamo.");

            } else if (cliente == null) {
                JOptionPane.showMessageDialog(null, "El cliente ingresado no es valido o no se encuentra registrado.");
            } else if (libro == null) {
                JOptionPane.showMessageDialog(null, "El libro ingresado no es valido");
            } else {
                JOptionPane.showMessageDialog(null, "El libro ingresado no tiene ejemplares restantes.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void devolucion() {
        try {
            Prestamo prest = new Prestamo();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar: "));
            prest = (Prestamo) em.createQuery(" SELECT p FROM Prestamo p WHERE p.cliente.id LIKE " + id).getSingleResult();

            if (prest != null) {
                long isbn = prest.getLibro().getIsbn();
                em.getTransaction().begin();
                em.remove(prest);
                em.getTransaction().commit();
                ls.devolucion(isbn);
                JOptionPane.showMessageDialog(null, "El libro se devolvio correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no tiene prestamos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public void actualizarPrestamo() {
        try {
            Prestamo prest = new Prestamo();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar: "));
            prest = (Prestamo) em.createQuery(" SELECT p FROM Prestamo p WHERE p.cliente.id LIKE " + id).getSingleResult();
            Date dev = prest.getDevolucion();
            dev.setDate(dev.getDate()+10);
            prest.setDevolucion(dev);

            if (prest != null) {
                em.getTransaction().begin();
                em.merge(prest);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "El prestamo se actualizo correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no tiene prestamos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public Collection<Prestamo> bucarPrestamos() {
        try {
            List<Prestamo> lista = new ArrayList();
            lista = (List<Prestamo>) em.createQuery("  SELECT l"
                    + "  FROM Prestamo l ").getResultList();

            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarPrestamos(Collection<Prestamo> a) {
        try {
            if (a != null) {
                String aux = "";
                for (Prestamo x : a) {
                    aux += x.mostrarPrestamo() + "\n";
                }
                JOptionPane.showMessageDialog(null, aux);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron Prestamos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }
}
