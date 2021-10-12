
import java.util.Scanner;


public class Extra10 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        
        num1 = (int)(Math.random()*10);
        num2 = (int)(Math.random()*10);
        
        int num = -2,total = num1*num2;
        System.out.println("**************************");
        System.out.println("*   Adivina el numero!!  *");
        System.out.println("**************************");
        System.out.println("-Adivina un numero entre 0 y 100.");
        System.out.println("-Ingrese -5 para salir.");
        System.out.println("EMPEZEMOS.........");
        System.out.println(total);
        
        while(num != total){
            
            System.out.println("Dame un numero:");
            num = leer.nextInt();
            
            if(num == -5){
                break;
            }
            
            
            if(num == total+1 || num == total-1){
                System.out.println("ESTAS CERCA!");
            }else if(num < total){
                System.out.println("Muy bajo!");
            }else if (num > total){
                System.out.println("Muy alto!");
            }else if(num == total){
                System.out.println("ADIVINASTE!!!");
            }            
        
        }
        
        
    }
    
}
