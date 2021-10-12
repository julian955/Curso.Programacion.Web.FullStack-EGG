
import java.util.Scanner;


public class Extra14 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1,num2,menu=0,total;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el seguno numero: ");
        num2 = leer.nextInt();
        
       
        
        
        
        while (menu != 6){
            
            menu();
            menu = leer.nextInt();
            
            if(menu == 1){
                System.out.println(suma(num1,num2)); 
            }else if(menu == 2){
                System.out.println(resta(num1,num2));
            }else if(menu == 3){
                System.out.println(multiplicar(num1,num2));
            }else if(menu == 4){
                System.out.println(dividir(num1,num2));
            }else if(menu == 5){
                System.out.println("Ingrese el primer numero: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese el seguno numero: ");
                num2 = leer.nextInt();
            }else if (menu == 6){
               break;
            }else{
                System.out.println("Opcion no valida, Ingrese otra: ");
            }       
        
        }
        
        
    }
    
    static void menu(){
        
        System.out.println("Elige una opcion: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Ingresar otros numeros");
        System.out.println("6. Salir");
        
    }
    
    public static int suma(int num1,int num2){    
        return num1 + num2;         
    }
    
    public static int resta(int num1,int num2){
        return num1 - num2;
    }
    
    public static double multiplicar(int num1,int num2){
        return num1 * num2;
    }
    
    public static double dividir(int num1,int num2){
        return num1/num2;
    }
    
}
