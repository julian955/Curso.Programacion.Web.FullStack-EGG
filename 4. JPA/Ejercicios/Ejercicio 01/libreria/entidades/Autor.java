package libreria.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String nombre;    
    private boolean alta;

    public Autor() {
    }

    public Autor(String nombre) {
        this.nombre = nombre;
        alta = true;

    }

    public Autor(int id, String nombre, boolean alta) {
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

    public String mostrarAutor() {
        String aux = "";
        if (alta) {
            aux = "ALTA";
        } else {
            aux = "BAJA";
        }
        return "ID: " + id + " Nombre: " + nombre + " Estado: " + aux;
    }

}
