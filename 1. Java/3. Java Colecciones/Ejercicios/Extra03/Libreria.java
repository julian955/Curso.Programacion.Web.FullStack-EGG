
package Extra03;

import java.util.Objects;

public class Libreria implements Comparable<Libreria>{
   private String libro;
   private String autor;
   private Integer cantidad;
   private Integer prestados;
   
   public Libreria(){}
   
   public Libreria(String libro,String autor,Integer cantidad,Integer prestados){
       
       this.libro = libro;
       this.autor = autor;
       this.cantidad = cantidad;
       this.prestados = prestados;
   }
   
   public String getLibro(){
       return libro;
   }
   public void setLibro(String libro){
       this.libro = libro;
   }
   
   public String getAutor(){
       return autor;
   }
   public void setAutor(String autor){
       this.autor = autor;
   }
   
   public Integer getCantidad(){
       return cantidad;
   }
   public void setCantidad(Integer cantidad){
       this.cantidad = cantidad;
   }
   
   public Integer getPrestados(){
       return prestados;
   }
   public void setPrestados(Integer prestados){
       this.prestados = prestados;
   }
   
   public String mostrarLibros(){
       return "Titulo: "+libro+" //  Autor: "+autor+" //  Ejemplares: "+cantidad+" //  Prestados: "+prestados;
   }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.libro);
        hash = 79 * hash + Objects.hashCode(this.autor);
        hash = 79 * hash + Objects.hashCode(this.cantidad);
        hash = 79 * hash + Objects.hashCode(this.prestados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libreria other = (Libreria) obj;
        if (!Objects.equals(this.libro, other.libro)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.cantidad, other.cantidad)) {
            return false;
        }
        if (!Objects.equals(this.prestados, other.prestados)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Libreria t) {
        return this.libro.compareTo(t.getLibro());
    }
   
}
