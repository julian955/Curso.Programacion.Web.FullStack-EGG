
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese una nota entre 0 y 10");

        int nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            if (nota < 0 || nota > 10) {
                System.out.println("La nota ingresada no es valida.");
                System.out.println("Por favor ingresela nuevamente:");
                nota = leer.nextInt();
            }
        }
    }

}
