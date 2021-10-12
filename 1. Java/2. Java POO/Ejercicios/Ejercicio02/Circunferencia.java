
package Ejercicio02;

import java.util.Scanner;


public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    private float radio;
    
    
    // Este es un metodo constructor
    //Siempre tiene que tener el mismo nombre de la clase.
    public Circunferencia(){
        this.radio = 0;
    }
    
    public void setRadio(float radio){
        this.radio = radio;
    }
    
    public float getRadio(){
        return radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Introduce el radio de la circunferencia");
        radio = leer.nextFloat();
    }
    
    public float area(){
        
       float area = (float) (Math.PI*Math.pow(radio, 2));
       return area;
    }
    
    public float perimetro(){
        float perimetro = (float)(2 * Math.PI*radio);
        return perimetro;
    }
}

