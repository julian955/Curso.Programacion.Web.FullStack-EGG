package libreria.entidades;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Prestamo {

    @Id
    private String id;
    @Temporal(TemporalType.DATE)
    private Date prestamo;
    @Temporal(TemporalType.DATE)
    private Date devolucion;
    private Libro libro;
    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(String id, Date prestamo, Date devolucion, Libro libro, Cliente cliente) {
        this.id = id;
        this.prestamo = prestamo;
        this.devolucion = devolucion;
        this.libro = libro;
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Date prestamo) {
        this.prestamo = prestamo;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String mostrarPrestamo(){
        return "ID prestamo: "+id+" Prestamo: "+prestamo+" Devolucion: "+devolucion+" Libro: "+libro.getTitulo()+" Cliente: "+ cliente.getNombre()+" "+cliente.getApellido();
    }

}
