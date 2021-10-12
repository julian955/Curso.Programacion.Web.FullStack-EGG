
import java.util.Scanner;


public class Extra08 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int par = 0,n,impar = 0,total = 0,cont = 0,inf = 0;
       
       while(inf<1){
           System.out.println("Ingrese un numero: ");
           n = leer.nextInt();
           
           if(n%2==0){
               par ++;
           }else{
               impar ++;
           }
           
           cont++;
           
           if(n>0){
               total = total + n;
           }
           
           if(n%5 == 0){
               break;
           }
           
           
       }
       
        System.out.println("Usted ingreso "+cont+" numeros");
        System.out.println(par+" Eran pares");
        System.out.println(impar+" Eran impares");
        System.out.println("La suma de estos numeros da un total de: "+total);
    }
    
}
