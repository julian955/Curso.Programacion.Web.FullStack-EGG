package libreria.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import libreria.entidades.Autor;

public class AutorService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private EntityManager em = emf.createEntityManager();

    public AutorService() {
    }

    public Autor crearAutor() throws Exception {

        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del autor");
            if (nombre == null) {
                throw new Exception("El nombre no puede estar vacio.");
            }

            return new Autor(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public void menuAutor() {
        try {
            String menu = "1. Para agregar un autor\n2. Para modificar un autor"
                    + "\n3. Para eliminar un autor\n4. Para acceder al menu de busqueda\n5. Para dar de alta/baja a un autor\n6. Para ver todas los autores\n7. Para volver atras";

            String subm = "1. Busqueda de autor por ID\n2. Busqueda de autor por nombre\n3. Para salir";
            String status = "1. Para dar de baja a un autor\n2. Para dar de alta un autor\n3. Para salir";
            int opc = 0, opc1 = 0, opc3 = 0;
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opc) {
                case 1:
                    guardarAutor();
                    break;
                case 2:
                    modificarAutor();
                    break;
                case 3:
                    eliminarAutor();
                    break;
                case 4:
                    opc1 = Integer.parseInt(JOptionPane.showInputDialog(subm));
                    switch (opc1) {
                        case 1:
                            buscarAutorPorId();
                            break;
                        case 2:
                            buscarAutorPorNombre();
                            break;

                    }
                    break;
                case 5:
                    opc3 = Integer.parseInt(JOptionPane.showInputDialog(status));
                    switch (opc1) {
                        case 1:
                            autorBaja();
                            break;
                        case 2:
                            autorAlta();
                            break;

                    }
                    break;
                case 6:
                    mostrarAutores(bucarAutores());
                    break;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public void guardarAutor() {
        try {
            em.getTransaction().begin();
            em.persist(crearAutor());
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se agrego el autor correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void buscarAutorPorId() {
        try {
            Autor aut = new Autor();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar: "));
            aut = em.find(Autor.class, id);
            if (aut != null) {
                JOptionPane.showMessageDialog(null, aut.mostrarAutor());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el autor buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void buscarAutorPorNombre() {
        try {
            Autor aut = new Autor();
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre a buscar: ");
            if (nombre == null) {
                throw new Exception("El nombre no puede estar vacio.");
            }
            aut = (Autor) em.createQuery("  SELECT a"
                    + "  FROM Autor a "
                    + "  WHERE a.nombre IN ('" + nombre + "')").
                    getSingleResult();

            if (aut != null) {
                JOptionPane.showMessageDialog(null, aut.mostrarAutor());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el autor buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void eliminarAutor() {

        try {
            Autor aut = new Autor();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a eliminar: "));
            aut = em.find(Autor.class, id);

            if (aut != null) {
                em.getTransaction().begin();
                em.remove(aut);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se elimino el autor correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "El autor ingresado no existe.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void modificarAutor() {
        try {
            Autor aut = new Autor();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del autor a modificar: "));
            aut = em.find(Autor.class, id);

            if (aut != null) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre: ");
                if (nombre == null) {
                    throw new Exception("El nombre no puede estar vacio.");
                }
                aut.setNombre(nombre);
                em.getTransaction().begin();
                em.merge(aut);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se modifico el autor correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el autor buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void autorBaja() {
        try {
            Autor aut = new Autor();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la editorial a modificar: "));
            aut = em.find(Autor.class, id);

            if (aut != null && aut.isAlta()) {
                aut.setAlta(false);
                em.getTransaction().begin();
                em.merge(aut);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se dio de baja al autor");
            } else if (!aut.isAlta()) {
                JOptionPane.showMessageDialog(null, "El autor ingresado esta dado de baja.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el autor buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public void autorAlta() {
        try {
            Autor aut = new Autor();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la editorial a modificar: "));
            aut = em.find(Autor.class, id);

            if (aut != null && !aut.isAlta()) {
                aut.setAlta(true);
                em.getTransaction().begin();
                em.merge(aut);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se dio de alta al autor");
            } else if (!aut.isAlta()) {
                JOptionPane.showMessageDialog(null, "El autor ingresado esta en alta.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el autor ingresado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public Collection<Autor> bucarAutores() {
        try {
            List<Autor> lista = new ArrayList();
            lista = (List<Autor>) em.createQuery("  SELECT a"
                    + "  FROM Autor a ").getResultList();

            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarAutores(Collection<Autor> a) {
        try {
            String aux = "";
            for (Autor x : a) {
                aux += x.mostrarAutor() + "\n";
            }
            JOptionPane.showMessageDialog(null, aux);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public Autor devAutor() {
        try {
            Autor aut = new Autor();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del autor: "));
            aut = em.find(Autor.class, id);

            return aut;

        } catch (Exception e) {
            throw e;
        }
    }
}
