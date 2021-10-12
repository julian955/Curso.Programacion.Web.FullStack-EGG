
package Extra02;

import java.util.List;


public class Cine {
    private String nombre;
    private Pelicula pelicula;
    private int precio;
    private List<Espectador> espectadores;
    private Espectador[][] asientos;

    public Cine() {
        asientos = new Espectador[8][6];
    }

    public Cine(String nombre, Pelicula pelicula,int precio) {
        this.precio = precio;
        this.nombre = nombre;
        this.pelicula = pelicula;
        asientos = new Espectador[8][6];
    }
    
    

    public Cine(String nombre, Pelicula pelicula, List<Espectador> espectadores,int precio) {
        this.precio = precio;
        this.nombre = nombre;
        this.pelicula = pelicula;
        this.espectadores = espectadores;
        asientos = new Espectador[8][6];
    }
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
    

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Espectador[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Espectador[][] asientos) {
        this.asientos = asientos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void asignarAsiento(int fila, int col ,Espectador x){
        asientos[fila][col] = x;
    }
    
    public String mostrarAsientos(){
        String letras [] = {"A","B","C","D","E","F"}; 
        int aux = 1;
        String dibujo ="-------------------"+nombre.toUpperCase()+"-------------------\n------------------------------------\n";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
               if(asientos[i][j] == null){
                  dibujo += (aux)+letras[j]+"   |";
               } else{
                   dibujo += (aux)+letras[j]+" X |";
               }
            }
            dibujo += "\n";
            aux++;
        }
        return dibujo;
    }
    
    
    
}
