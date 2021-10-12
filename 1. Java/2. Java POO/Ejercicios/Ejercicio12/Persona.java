
package Ejercicio12;

import java.util.Date;
import java.util.Scanner;


public class Persona {
   private String nombre;
   private Date edad;
   
   public Persona(){
       edad = new Date();
   }
   
   public Persona(String nombre, Date edad){
       this.nombre = nombre;
       this.edad = edad;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   
   public Date getEdad(){
       return edad;
   }
   
   public void setEdad(Date edad){
       this.edad = edad;
   }
   
   public void crearPersona(){
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       System.out.println("Por favor ingresa el nombre de la persona: ");
       nombre = leer.next();
       System.out.println("Ingrese la fecha de nacimiento ");
       System.out.println("Dia:");
       int dia = leer.nextInt();
       System.out.println("Mes:");
       int mes = leer.nextInt();
       System.out.println("año: ");
       int ano = leer.nextInt();
       
       edad.setDate(dia);
       edad.setMonth(mes);
       edad.setYear(ano);
   }
   
   public void calcularEdad(){
       Date fact = new Date();
       
       int anos = (1900+fact.getYear()) - edad.getYear() ;
       System.out.println("La edad de la persona es: "+ anos+" años");
   }
   
   public boolean menorQue(int edad){
       Date fact = new Date();
       
       int anos = (1900+fact.getYear()) - this.edad.getYear();
       if(edad > anos){
           return true;
       }else{
           return false;
       }
   }
   
   public void mostrarPersona(){
       System.out.println("El nombre de la persona es: "+nombre);
       System.out.println("La fecha de nacimiento es: "+edad.getDate()+"/"+edad.getMonth()+"/"+edad.getYear() );
   }
}
