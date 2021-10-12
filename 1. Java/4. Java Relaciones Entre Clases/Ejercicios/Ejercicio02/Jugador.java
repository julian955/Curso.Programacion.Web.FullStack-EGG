
package Ejercicio02;


public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;
    
    public Jugador(){}
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }
    
    public Jugador(int id,String nombre){
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
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

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(Revolver r){
        if(r.mojar()== true){
            mojado = true;
            return true;
        }else{
            r.siguienteChorro();
        }
        return false;
    }
    
    public String mostrarJugador(){
        return "Jugador: "+id+" == Nombre: "+nombre;
    }
}

