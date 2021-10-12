
import java.util.Scanner;


public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num,total = 0,cont = 0;
        
        while(cont < 20){
        
            System.out.println("Ingresa un numero");
            num = leer.nextInt();
            
            if(num == 0){
                System.out.println("Se capturo el numero cero!");
                break;
            }else if (num > 0){
                total = total + num;
            }
            
            cont = cont + 1;
        }
        
        System.out.println("La suma de los numeros ingresados es de: " + total);
    }
    
}
