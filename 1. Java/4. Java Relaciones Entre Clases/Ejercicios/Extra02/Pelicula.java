
package Extra02;

public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;
    private int edadMin;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion, int edadMin) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMin = edadMin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }
    
    public String mostrarPelicula(){
        return "Pelicula: "+titulo+"\nDirector: "+director+"\nDuracion(min): "+duracion+"\nEdad minima para ver la pelicula: "+edadMin+" años";
    }
    
}
