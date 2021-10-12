
import java.util.Scanner;


public class Extra02 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int a,b,c,d,aux;
        
        System.out.println("Ingrese el primer valor:");
        a = leer.nextInt();
        System.out.println("Ingrese el segundo valor:");
        b = leer.nextInt();
        System.out.println("Ingrese el tercer valor:");
        c = leer.nextInt();
        System.out.println("Ingrese el cuarto valor:");
        d = leer.nextInt();
        
        System.out.println("A: "+a+" B: "+b+" C: "+c+" D: "+d);
        
        aux = a;
        a = c;
        c = aux;
        aux = a;
        a = d;
        d = b;
        b = aux;
                
        System.out.println("A: "+a+" B: "+b+" C: "+c+" D: "+d);
    }
    
}
