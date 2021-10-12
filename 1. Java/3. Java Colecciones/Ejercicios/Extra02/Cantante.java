
package Extra02;


public class Cantante {
    private String nombre;
    private String dmv;
    
    public Cantante(){}
    
    public Cantante(String nombre,String dmv){
        this.nombre = nombre;
        this.dmv = dmv;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDmv(){
        return dmv;
    }
    public void setDmv(String dmv){
        this.dmv = dmv;
    }
    
    public String mostrarCantante(){
        return "Cantante: "+nombre+", Disco mas vendido: "+dmv;
    }
}
