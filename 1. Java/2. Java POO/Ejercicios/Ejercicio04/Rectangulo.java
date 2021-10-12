
package Ejercicio04;

import java.util.Scanner;

public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    public Rectangulo(){
    
    }
    
    public float getBase(){
        return base;
    }
    
    public void setBase(float base){
        this.base = base;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public void pedirDatos(){
        System.out.println("Ingrese la base del rectangulo: ");
        base = leer.nextFloat();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = leer.nextFloat();
    }
    
    
    public float superficie(){
        float sup = base * altura;
        return sup;
        
    }
    
    public float perimetro(){
        float perim = (base + altura)*2;
        return perim;
    }
    
    public void dibujado(){
        int i,j;
        for(i = 0; i <= altura-1;i++){
            j=0;
            System.out.println("");
            if(i == 0 || i == altura-1){
                for(j = 0; j <= base-1 ; j++){
                    System.out.print("*");
                }
            }else{
                for(j = 0; j <= base-1 ; j++){
                    if(j == 0 || j == base-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
