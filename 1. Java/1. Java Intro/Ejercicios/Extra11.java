
import java.util.Scanner;


public class Extra11 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
       int num = leer.nextInt();
       
       int cont=0;
       
       while(num != 0){
           num = num/10;
           cont++;
           System.out.println(num);
       }
       
        System.out.println("El numero ingresado tiene "+cont+" digitos.");
    }
    
}
