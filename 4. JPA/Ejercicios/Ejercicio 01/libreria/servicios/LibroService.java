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
import libreria.entidades.Libro;

public class LibroService {

    private AutorService as = new AutorService();
    private EditorialService es = new EditorialService();

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private EntityManager em = emf.createEntityManager();

    public Libro crearLibro() {
        long ISBN = Long.parseLong(JOptionPane.showInputDialog("Ingrese el ISBN: "));
        String titulo = JOptionPane.showInputDialog("Ingrese el Titulo: ");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del libro: "));
        int ejemplares = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ejemplares: "));
        int ejemplaresPrestados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ejemplares prestados: "));
        int ejemplaresRestante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ejemplares restantes: "));
        boolean estado = true;
        Autor autor = as.devAutor();
        Editorial editorial = es.devEditorial();
        while (autor == null) {
            autor = as.devAutor();
            if (autor == null) {
                JOptionPane.showMessageDialog(null, "Autor invalido, Seleccione uno valido.");
            }
        }
        while (editorial == null) {
            editorial = es.devEditorial();
            if (editorial == null) {
                JOptionPane.showMessageDialog(null, "Editorial invalida, Seleccione una valida.");
            }
        }

        return new Libro(ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestante, estado, autor, editorial);

    }

    public void menuLibro() {
        try {
            String menu = "1. Para agregar un libro\n2. Para modificar un libro"
                    + "\n3. Para eliminar un libro\n4. Para acceder al menu de busqueda\n5. Para dar de alta/baja a un libro\n6. Para ver todos los libros\n7. Para volver atras";

            String subm = "1. Busqueda de libro por ID\n2. Busqueda de libro por nombre\n3. Busqueda de libro por autor\n4. Busqueda de libro por editorial\n5. Para salir";
            String status = "1. Para dar de baja a un libro\n2. Para dar de alta un libro\n3. Para salir";
            int opc = 0, opc1 = 0, opc3 = 0;
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opc) {
                case 1:
                    guardarLibro();
                    break;
                case 2:
                    modificarLibro();
                    break;
                case 3:
                    eliminarLibro();
                    break;
                case 4:
                    opc1 = Integer.parseInt(JOptionPane.showInputDialog(subm));
                    switch (opc1) {
                        case 1:
                            buscarLibroPorId();
                            break;
                        case 2:
                            buscarLibroPorNombre();
                            break;
                        case 3:
                            mostrarLibros(buscarLibroPorAutor());
                            break;
                        case 4:
                            mostrarLibros(buscarLibroPorEditorial());
                            break;

                    }
                    break;
                case 5:
                    opc3 = Integer.parseInt(JOptionPane.showInputDialog(status));
                    switch (opc1) {
                        case 1:
                            libroBaja();
                            break;
                        case 2:
                            libroAlta();
                            break;

                    }
                    break;
                case 6:
                    mostrarLibros(bucarLibros());
                    break;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public void guardarLibro() {
        try {
            em.getTransaction().begin();
            em.persist(crearLibro());
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se agrego el libro correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void buscarLibroPorId() {
        try {
            Libro lib = new Libro();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el isbn del libro: "));
            lib = em.find(Libro.class, id);
            if (lib != null) {
                JOptionPane.showMessageDialog(null, lib.mostrarLibro());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el libro buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void buscarLibroPorNombre() {
        try {
            Libro lib = new Libro();
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre a buscar: ");
            lib = (Libro) em.createQuery("  SELECT l"
                    + "  FROM Libro l "
                    + "  WHERE l.nombre IN ('" + nombre + "')").
                    getSingleResult();

            if (lib != null) {
                JOptionPane.showMessageDialog(null, lib.mostrarLibro());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el libro buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void eliminarLibro() {

        try {
            Libro lib = new Libro();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a eliminar: "));
            lib = em.find(Libro.class, id);

            if (lib != null) {
                em.getTransaction().begin();
                em.remove(lib);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se elimino el libro correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "El libro ingresado no existe.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void modificarLibro() {
        try {
            Libro lib = new Libro();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del libro a modificar: "));
            lib = em.find(Libro.class, id);

            if (lib != null) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nuevo titulo: ");
                lib.setTitulo(nombre);
                em.getTransaction().begin();
                em.merge(lib);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se modifico el libro correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el libro buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void libroBaja() {
        try {
            Libro lib = new Libro();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la editorial a modificar: "));
            lib = em.find(Libro.class, id);

            if (lib != null && lib.isAlta()) {
                lib.setAlta(false);
                em.getTransaction().begin();
                em.merge(lib);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se dio de baja al Libro");
            } else if (!lib.isAlta()) {
                JOptionPane.showMessageDialog(null, "El Libro ingresado esta dado de baja.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el Libro buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public void libroAlta() {
        try {
            Libro lib = new Libro();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del Libro a modificar: "));
            lib = em.find(Libro.class, id);

            if (lib != null && !lib.isAlta()) {
                lib.setAlta(true);
                em.getTransaction().begin();
                em.merge(lib);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se dio de alta al Libro");
            } else if (!lib.isAlta()) {
                JOptionPane.showMessageDialog(null, "El Libro ingresado esta en alta.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el Libro ingresado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public Collection<Libro> bucarLibros() {
        try {
            List<Libro> lista = new ArrayList();
            lista = (List<Libro>) em.createQuery("  SELECT l"
                    + "  FROM Libro l ").getResultList();

            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarLibros(Collection<Libro> a) {
        try {
            if (a != null) {
                String aux = "";
                for (Libro x : a) {
                    aux += x.mostrarLibro() + "\n";
                }
                JOptionPane.showMessageDialog(null, aux);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron libros");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public List<Libro> buscarLibroPorEditorial() {
        try {
            List<Libro> lista = new ArrayList();
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la editorial: ");
            lista = (List<Libro>) em.createQuery("  SELECT l"
                    + "  FROM Libro l "
                    + "  WHERE l.editorial.nombre LIKE :editorial", Libro.class).
                    setParameter("editorial", nombre).
                    getResultList();

            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
            throw e;
        }
    }

    public List<Libro> buscarLibroPorAutor() {
        try {
            List<Libro> lista = new ArrayList();
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la editorial: ");
            lista = (List<Libro>) em.createQuery("  SELECT l"
                    + "  FROM Libro l "
                    + "  WHERE l.autor.nombre LIKE :autor", Libro.class).
                    setParameter("autor", nombre).
                    getResultList();

            return lista;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
            throw e;
        }
    }
}

// SELECT l from Libro l WHERE l.editorial.nombre LIKE :editorial",Libro.class).setParameter("editorial",editorial).getresultlist;
//return em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE CONCAT('%', :nombre, '%')", Autor.class).setParameter("nombre", nombre).getResultList();
