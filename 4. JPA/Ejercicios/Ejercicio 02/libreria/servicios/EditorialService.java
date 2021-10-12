package libreria.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;

public class EditorialService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private EntityManager em = emf.createEntityManager();

    public EditorialService() {
    }

    public void menuEditorial() {
        try {
            String menu = "1. Para agregar una editorial\n2. Para modificar una editorial"
                    + "\n3. Para eliminar una editorial\n4. Para acceder al menu de busqueda\n5. Para dar de alta/baja una editorial\n6. Para ver todas las editoriales\n7. Para volver atras";

            String subm = "1. Busqueda de editorial por ID\n2. Busqueda de editorial por nombre\n3. Para salir";
            String status = "1. Para dar de baja a una editorial\n2. Para dar de alta una editorial\n3. Para salir";
            int opc = 0, opc1 = 0, opc3 = 0;
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opc) {
                case 1:
                    guardarEditorial();
                    break;
                case 2:
                    modificarEditorial();
                    break;
                case 3:
                    eliminarEditorial();
                    break;
                case 4:
                    opc1 = Integer.parseInt(JOptionPane.showInputDialog(subm));
                    switch (opc1) {
                        case 1:
                            buscarEditorialPorId();
                            break;
                        case 2:
                            buscarEditorialPorNombre();
                            break;

                    }
                    break;
                case 5:
                    opc3 = Integer.parseInt(JOptionPane.showInputDialog(status));
                    switch (opc3) {
                        case 1:
                            editorialBaja();
                            break;
                        case 2:
                            editorialAlta();
                            break;

                    }
                    break;
                case 6:
                    mostrarEditorial(bucarEditoriales());
                    break;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public Editorial crearEditorial() throws Exception {
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del autor");
            if (nombre == null) {
                throw new Exception("El nombre no puede estar vacio.");
            }

            return new Editorial(nombre);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema." + e);
            throw e;
        }
    }

    public void guardarEditorial() {
        try {
            em.getTransaction().begin();
            em.persist(crearEditorial());
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se agrego la editorial correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void buscarEditorialPorId() {
        try {
            Editorial ed = new Editorial();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar: "));
            ed = em.find(Editorial.class, id);
            if (ed != null) {
                JOptionPane.showMessageDialog(null, ed.mostrarEditorial());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la editorial buscada");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void buscarEditorialPorNombre() {
        try {
            Editorial ed = new Editorial();
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre a buscar: ");
            if (nombre == null) {
                throw new Exception("El nombre no puede estar vacio.");
            }
            ed = (Editorial) em.createQuery("  SELECT e"
                    + "  FROM Editorial e "
                    + "  WHERE e.nombre IN ('" + nombre + "')").
                    getSingleResult();

            if (ed != null) {
                JOptionPane.showMessageDialog(null, ed.mostrarEditorial());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la editorial buscada");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void eliminarEditorial() {

        try {
            Editorial ed = new Editorial();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a eliminar: "));
            ed = em.find(Editorial.class, id);

            if (ed != null) {
                em.getTransaction().begin();
                em.remove(ed);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se elimino la editorial correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la editorial ingresada no existe.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void modificarEditorial() {
        try {
            Editorial ed = new Editorial();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la editorial a modificar: "));
            ed = em.find(Editorial.class, id);

            if (ed != null) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre: ");
                if (nombre == null) {
                    throw new Exception("El nombre no puede estar vacio.");
                }
                ed.setNombre(nombre);
                em.getTransaction().begin();
                em.merge(ed);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se modifico la editorial correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la editorial buscada");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void editorialBaja() {
        try {
            Editorial ed = new Editorial();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la editorial a modificar: "));
            ed = em.find(Editorial.class, id);

            if (ed != null && ed.isAlta()) {
                ed.setAlta(false);
                em.getTransaction().begin();
                em.merge(ed);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se dio de baja a la editorial");
            } else if (!ed.isAlta()) {
                JOptionPane.showMessageDialog(null, "La editorial ingresada esta dada de baja.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la editorial buscada");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public void editorialAlta() {
        try {
            Editorial ed = new Editorial();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la editorial a modificar: "));
            ed = em.find(Editorial.class, id);

            if (ed != null && !ed.isAlta()) {
                ed.setAlta(true);
                em.getTransaction().begin();
                em.merge(ed);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se dio de alta a la editorial");
            } else if (ed.isAlta()) {
                JOptionPane.showMessageDialog(null, "La editorial ingresada esta en alta.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la editorial buscada");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public Collection<Editorial> bucarEditoriales() {
        try {
            List<Editorial> lista = new ArrayList();
            lista = (List<Editorial>) em.createQuery("  SELECT e"
                    + "  FROM Editorial e ").getResultList();

            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarEditorial(Collection<Editorial> a) {
        try {
            String aux = "";
            for (Editorial x : a) {
                aux += x.mostrarEditorial() + "\n";
            }
            JOptionPane.showMessageDialog(null, aux);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public Editorial devEditorial() {
        try {
            Editorial ed = new Editorial();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la editorial: "));
            ed = em.find(Editorial.class, id);

            return ed;

        } catch (Exception e) {
            throw e;
        }
    }
}
