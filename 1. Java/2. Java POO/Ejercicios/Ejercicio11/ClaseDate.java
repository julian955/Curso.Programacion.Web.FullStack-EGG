
package Ejercicio11;

import java.util.Date;
import java.util.Scanner;


public class ClaseDate {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ano,mes,dia;
        System.out.println("Ingrese el año: ");
        ano = leer.nextInt();
        ano -= 1900;
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el dia: ");
        dia = leer.nextInt();
       Date fecha1 = new Date();
       Date fecha2 = new Date(ano,mes,dia);
       
       int dif  = fecha1.getYear() - fecha2.getYear();
       System.out.println(fecha1.toString());
       System.out.println(fecha2.toString());
       System.out.println("La diferencia de años entre la fecha ingresada y la actual es de: "+dif);
        
    }
    
}
