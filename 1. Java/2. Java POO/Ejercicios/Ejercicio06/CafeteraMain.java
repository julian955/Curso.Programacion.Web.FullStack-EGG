
package Ejercicio06;

import java.util.Scanner;

public class CafeteraMain {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int taza, cantidad,cmax,cact,menu = 0;
        
        System.out.println("Ingrese la capacidad de la cafetera: ");
        cmax = leer.nextInt();
        
        Cafetera cafe = new Cafetera(cmax, cmax);
        
        System.out.println("Que desea realizar?");
        
        while(menu != 7){
            menu();
            menu = leer.nextInt();
            
            switch(menu){
                
                case 1:
                    cafe.llenarCafetera();
                    System.out.println("La cafetera se lleno correctamente.");
                    break;
                case 2:
                    cafe.vaciarCafetera();
                    System.out.println("La cafetera se vacio correctamente.");
                    break;
                case 3:
                    System.out.println("Ingrese la capacidad de la taza: ");
                    taza = leer.nextInt();
                    cafe.servirTaza(taza);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe que desea introducir: ");
                    cantidad = leer.nextInt();
                    cafe.agregarCafe(cantidad);
                    break;
                case 5:
                    System.out.println("La cantidad actual de cafe en la cafetera es de: "+cafe.getCantidadActual()+" Ml");
                    break;
                case 6:
                    System.out.println("La cantidad maxima de cafe en la cafetera es de: "+cafe.getCapacidadMaxima()+" Ml");
                    break;                      
                case 7:
                     System.out.println("Gracias por utlizar la cafetera!!");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor ingrese otra.");
                    break;
            }        
        }      
        
    }
    
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. Llenar Cafetera.");
        System.out.println("2. Vaciar Cafetera.");
        System.out.println("3. Servir una taza.");
        System.out.println("4. Agregar cafe.");
        System.out.println("5. Mostrar la cantidad de cafe en la cafetera.");
        System.out.println("6. Mostrar la cantidad maxima de cafe.");
        System.out.println("7. Salir");
    }
    
}
