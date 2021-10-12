
package Ejercicio07;

import java.util.Scanner;

public class PersonaService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public  Persona crearPersona(){
        String sexo = "x";
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = leer.next();
        System.out.println("Introduzca el sexo de la persona:");
        sexo = leer.next();
        while(!(sexo.equals("m") || sexo.equals("f") || sexo.equals("o"))){
            System.out.println("Sexo no valido, por favor ingrese otro.");
            sexo = leer.next();
        }
        System.out.println("Ingrese la edad de la persona: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese el peso de la persona:");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura de la persona: ");
        double altura = leer.nextDouble();
        
        return new Persona(nombre, sexo, edad, peso, altura);        
    }
    
    public int calcularIMC(double peso, double altura){
        int num;
        double imc = peso/(Math.pow(altura, 2));
        if(imc < 20){
            num = -1;            
        }else if(imc > 25){
            num = 1;            
        }else{
            num = 0;           
        }
        
        return num;
    }
    
    public boolean mayorEdad(int edad){
        if(edad >= 18){
            return true;
        }else{
            return false;
        }
    }
}
