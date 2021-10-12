package libreria.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Libro {

    @Id
    private long isbn;    
    private String titulo;   
    private int anio;    
    private int ejemplares;    
    private int ejemplaresPrestados;   
    private int ejemplaresRestante;  
    private boolean alta;   
    @ManyToOne
    private Autor autor;    
    @ManyToOne
    private Editorial editorial;

    public Libro() {
    }

   

    public Libro(long isbn, String titulo, int anio, int ejemplares, int ejemplaresPrestados, int ejemplaresRestante, boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplaresRestante = ejemplaresRestante;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;

    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public int getEjemplaresRestante() {
        return ejemplaresRestante;
    }

    public void setEjemplaresRestante(int ejemplaresRestante) {
        this.ejemplaresRestante = ejemplaresRestante;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String mostrarLibro() {
        String aux = "";
        if (alta) {
            aux = "ALTA";
        } else {
            aux = "BAJA";
        }
        return "ISBN: " + isbn +" Titulo: "+titulo+ " Año: " + anio + " Ejemplares: " + ejemplares
                + " Ejemplares Prestados: " + ejemplaresPrestados + " Ejemplares Restante: "
                + ejemplaresRestante + " Condicion: " + aux + " ID Autor: " + autor.getId()
                + " ID Editorial: " + editorial.getId();
    }

}