
import java.util.Scanner;


public class Extra09 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = leer.nextInt();
        int cont = 0;
        
        while(num2<num1){
            num1 = num1-num2;
            cont++;
        }
        
        System.out.println("El residuo de la divicion es: "+num1);
        System.out.println("El cociente de la divicion es: "+cont);
    }
    
}
