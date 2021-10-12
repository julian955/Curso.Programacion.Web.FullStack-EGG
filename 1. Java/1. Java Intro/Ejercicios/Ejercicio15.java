
import java.util.Scanner;


public class Ejercicio15 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese el primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = leer.nextInt();
        int menu;
        double total;
        String salir = "n";
        do{
            System.out.println("MENU");
            System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
            System.out.println("Elige una opcion: ");
            menu = leer.nextInt();
            
            if(menu == 1){
              total = num1 + num2;
                System.out.println("La suma de los numeros ingresados es: " + total);
            }else if(menu == 2) {
                total = num1 - num2;
                 System.out.println("La resta de los numeros ingresados es: " + total);
            }else if(menu == 3){
                total = num1 * num2;
                 System.out.println("La multiplicacion de los numeros ingresados es: " + total);
            }else if(menu == 4){
                total = (double)num1/num2;
                 System.out.println("La divicion de los numeros ingresados es: " + total);
            }else if(menu == 5){
                System.out.println("Esta seguro que desea salir? (S/N)");
                salir = leer.next();
                salir = salir.toUpperCase();
            }else{
                System.out.println("Opcion no valida, Por favor ingrese otra.");
            }
            
            if(!(salir.equals("S"))){
                menu = 6;
            }
            
        }while(menu != 5 /*& /*!(salir.equals("S"))*/);
        
        System.out.println("El programa finalizo correctamente.");
    }
    
}
