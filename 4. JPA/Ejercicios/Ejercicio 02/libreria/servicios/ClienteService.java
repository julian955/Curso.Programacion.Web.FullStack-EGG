package libreria.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import libreria.entidades.Cliente;

public class ClienteService {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private EntityManager em = emf.createEntityManager();

    public ClienteService() {

    }

    public Cliente crearCliente() throws Exception {
        try {
            long dni = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero de DNI: "));
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
            String apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
            String telefono = JOptionPane.showInputDialog("Ingrese su telefono: ");

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("El nombre no puede estar vacio.");
            }
            if (apellido == null || apellido.trim().isEmpty()) {
                throw new Exception("El apellido no puede estar vacio.");
            }
            if (telefono == null || telefono.trim().isEmpty()) {
                throw new Exception("El telefono no puede estar vacio.");
            }

            return new Cliente(dni, nombre, apellido, telefono);
        } catch (Exception e) {
            throw e;
        }
    }

    public void menuCliente() {
        try {
            String menu = "1. Para agregar un cliente\n2. Para modificar un cliente"
                    + "\n3. Para eliminar un cliente\n4. Para acceder al menu de busqueda\n5.Para ver todos los clientes\n6. Para volver atras";

            String subm = "1. Busqueda de cliente por ID\n2. Busqueda de cliente por nombre\n3. Para salir";

            int opc = 0, opc1 = 0;
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opc) {
                case 1:
                    guardarCliente();
                    break;
                case 2:
                    modificarCliente();
                    break;
                case 3:
                    eliminarCliente();
                    break;
                case 4:
                    opc1 = Integer.parseInt(JOptionPane.showInputDialog(subm));
                    switch (opc1) {
                        case 1:
                            buscarClientePorId();
                            break;
                        case 2:
                            buscarClientePorNombre();
                            break;

                    }
                    break;
                case 5:
                    mostrarClientes(bucarClientes());
                    break;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public void guardarCliente() {
        try {
            em.getTransaction().begin();
            em.persist(crearCliente());
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se agrego el cliente correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void buscarClientePorId() {
        try {
            Cliente aut = new Cliente();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar: "));
            aut = em.find(Cliente.class, id);
            if (aut != null) {
                JOptionPane.showMessageDialog(null, aut.mostrarCliente());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el cliente buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void buscarClientePorNombre() {
        try {
            Cliente aut = new Cliente();
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre a buscar: ");
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("El nombre no puede estar vacio.");
            }
            aut = (Cliente) em.createQuery("  SELECT a"
                    + "  FROM Cliente a "
                    + "  WHERE a.nombre IN ('" + nombre + "')").
                    getSingleResult();

            if (aut != null) {
                JOptionPane.showMessageDialog(null, aut.mostrarCliente());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el cliente buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void eliminarCliente() {

        try {
            Cliente aut = new Cliente();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a eliminar: "));
            aut = em.find(Cliente.class, id);

            if (aut != null) {
                em.getTransaction().begin();
                em.remove(aut);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Se elimino el cliente correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "El cliente ingresado no existe.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public void modificarCliente() {
        try {
            Cliente aut = new Cliente();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del cliente a modificar: "));
            aut = em.find(Cliente.class, id);
            String menu = "Que desea modificar?\n1. Para modificar el nombre\n2. Para modificar el apellido\n3. Para modificar el DNI\n4. Para modificar el telefono\n5. Para salir";
            int select = 0;

            if (aut != null) {
                select = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (select) {
                    case 1:
                        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre: ");
                        if (nombre == null || nombre.trim().isEmpty()) {
                            throw new Exception("El nombre no puede estar vacio.");
                        }
                        aut.setNombre(nombre);
                        em.getTransaction().begin();
                        em.merge(aut);
                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Se modifico el nombre correctamente!");
                        break;
                    case 2:
                        String apellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido: ");
                        if (apellido == null || apellido.trim().isEmpty()) {
                            throw new Exception("El apellido no puede estar vacio.");
                        }
                        aut.setApellido(apellido);
                        em.getTransaction().begin();
                        em.merge(aut);
                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Se modifico el apellido correctamente!");
                        break;
                    case 3:
                        long dni = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero de DNI: "));
                        aut.setDni(dni);
                        em.getTransaction().begin();
                        em.merge(aut);
                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Se modifico el DNI correctamente!");
                        break;
                    case 4:
                        String telefono = JOptionPane.showInputDialog("Ingrese el nuevo telefono: ");
                        if (telefono == null || telefono.trim().isEmpty()) {
                            throw new Exception("El apellido no puede estar vacio.");
                        }
                        aut.setTelefono(telefono);
                        em.getTransaction().begin();
                        em.merge(aut);
                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Se modifico el telefono correctamente!");
                        break;

                }

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el cliente buscado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

    public Collection<Cliente> bucarClientes() {
        try {
            List<Cliente> lista = new ArrayList();
            lista = (List<Cliente>) em.createQuery("  SELECT a"
                    + "  FROM Cliente a ").getResultList();

            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarClientes(Collection<Cliente> a) {
        try {
            String aux = "";
            for (Cliente x : a) {
                aux += x.mostrarCliente() + "\n";
            }
            JOptionPane.showMessageDialog(null, aux);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }
    }

    public Cliente devCliente() {
        try {
            Cliente aut = new Cliente();
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id: "));
            aut = em.find(Cliente.class, id);

            return aut;

        } catch (Exception e) {
            throw e;
        }
    }

}
