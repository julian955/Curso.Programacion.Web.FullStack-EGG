package libreria.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "editorial")
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String nombre;    
    private boolean alta;

    public Editorial() {
    }

    public Editorial(String nombre) {
        this.nombre = nombre;
        alta = true;
    }

    public Editorial(int id, String nombre, boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public String mostrarEditorial() {
        String aux = "";
        if (alta) {
            aux = "ALTA";
        } else {
            aux = "BAJA";
        }
        return "ID: " + id + " Nombre: " + nombre + " Estado: " + aux;
    }
}
