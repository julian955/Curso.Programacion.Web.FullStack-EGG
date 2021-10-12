
package Ejercicio01;


public class Perro {
    private String nombre;
    private String raza;
    private TamPerro tam;
    private int edad;
    
    public Perro(){}
    public Perro(String nombre,String raza,TamPerro tam,int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.tam = tam;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public TamPerro getTam(){
        return tam;
    }
    public void setTam(TamPerro tam){
        this.tam = tam;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String mostrarPerro(){
        return "Nombre: "+ nombre+"\n Raza: "+raza+"\n Tamaño: "+tam+"\n Edad: "+edad;
    }
}


