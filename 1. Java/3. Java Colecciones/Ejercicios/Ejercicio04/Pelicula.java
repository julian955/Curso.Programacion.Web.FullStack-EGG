
package Ejercicio04;


public class Pelicula {
    private String nombre;
    private String director;
    private Integer duracion;
    
    public Pelicula(){}
    public Pelicula(String nombre,String director,int duracion){
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
    }
    
    public String getNombre(){
       return nombre;
    }
    public void setNombre(String nombre){
         this.nombre = nombre;
    }
    
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
    
    public Integer getDuracion(){
        return duracion;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    public String mostrarPeliculas(){
        return "Nombre: "+nombre+", Director: "+director+", Duracion: "+duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", director=" + director + ", duracion=" + duracion + '}';
    }
}
