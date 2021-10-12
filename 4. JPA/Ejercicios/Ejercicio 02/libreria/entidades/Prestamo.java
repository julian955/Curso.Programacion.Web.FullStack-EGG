package libreria.entidades;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prestamo {
    
    @Id
    private String id;
    private LocalDate prestamo;
    private LocalDate devolucion;
    private Libro libro;
    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(String id, LocalDate prestamo, LocalDate devolucion, Libro libro, Cliente cliente) {
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

    public LocalDate getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(LocalDate prestamo) {
        this.prestamo = prestamo;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
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
    
    
}
