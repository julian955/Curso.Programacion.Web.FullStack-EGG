
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i;
        System.out.println("Ingrese el tamaño del cuadrado: ");
        int num = leer.nextInt();
        int cont = num -1;
        for (i = 0; i <= num - 1; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        while (cont >= 2){            
        for (i = 0; i <= num - 1; i++) {
            if (i == 0 || i == num -1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }     
        }
            cont = cont -1;
            System.out.print("\n");
      }
         for (i = 0; i <= num - 1; i++) {
            System.out.print("*");
        }
         System.out.print("\n");
    }

}
