
package Extra07;

import java.util.Scanner;


public class FraccionMain {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        FraccionService fc = new FraccionService();
        
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = leer.nextInt();
        
        Fraccion f1 = new Fraccion(num1, num2);
        
        menu();        
        int menu = 0;
        
        while(menu != 6){
             System.out.println("Que operacion desea realizar?(ingrese 9 para mostrar el menu)");
             menu = leer.nextInt();
        switch(menu){
            case 1:
                System.out.println("La suma de los numeros es: "+fc.sumar(f1.getDenominador(), f1.getNumerador()));
                break;
            case 2:
                System.out.println("La resta de los numeros es: "+fc.restar(f1.getDenominador(), f1.getNumerador()));
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros es: "+fc.multiplicar(f1.getDenominador(), f1.getNumerador()));
                break;
            case 4:
                System.out.println("La divicion de los numeros es: "+fc.dividir(f1.getDenominador(), f1.getNumerador()));
                break;
            case 5:
                System.out.println("Ingrese el primer numero: ");
                num1 = leer.nextInt();
                f1.setDenominador(num1);
                System.out.println("Ingrese el segundo numero: ");
                num2 = leer.nextInt();
                f1.setNumerador(num2);
                break;
            case 6:
                System.out.println("Gracias!");
                break;
            case 9:
                menu();
                break;
            default:
                System.out.println("Opcion incorrecta,Por favor ingrese otra.");
                break;
            }
        
        }
    }
    
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Ingresar otros numeros");
        System.out.println("6. Salir");
    }
    
}
