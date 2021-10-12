
package Ejercicio03;

import java.util.Scanner;


public class Operacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int num1;
    private int num2;
    
    
    
    public Operacion(){
       
    }
    
    public Operacion(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
     public int getNum1(){
        return num1;
    }
     
    public void setNum1(int num1){
        this.num1 = num1;
    }
    
    public int getNum2(){
        return num2;
    }
    
    public void setNum2(int num2){
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese el primer numero: ");
        this.num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        this.num2 = leer.nextInt();
    }
    
    public int sumar(){
        int suma = num1 + num2;
        return suma;
    }
    
    public int restar(){
        int resta = num1 - num2;
        return resta;
    }
    
    public int multiplicar(){
        int mult;
        
        if(num1 > 0 && num2 > 0){
            mult = num1 * num2;
        }else{
            System.out.println("Error usted ingreso 0 en alguno de los numeros.");
            mult = 0;
        }
        return mult;
    }
    
    public float dividir(){
        float div;
        if(num1 > 0 && num2 > 0){
            div = num1 / num2;
        }else{
            System.out.println("Error usted ingreso 0 en alguno de los numeros.");
            div = 0;
        }
        return div;
    }
}
