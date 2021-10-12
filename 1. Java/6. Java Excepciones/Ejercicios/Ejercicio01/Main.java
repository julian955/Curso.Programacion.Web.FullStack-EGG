
package Ejercicio01;
 

public class Main {

 
    public static void main(String[] args) {
        
        Persona p  = new Persona();
        
        //p.mayorEdad();
        try{
            p.setEdad(Integer.parseInt("A"));
            p.mayorEdad();
        }catch(Exception e){
            System.out.println("La edad esta vacia");
        }
    }
    
}
