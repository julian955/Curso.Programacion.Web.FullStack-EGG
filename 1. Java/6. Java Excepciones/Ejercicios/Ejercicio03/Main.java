package Ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;

        while (num != 4) {

            try {
                System.out.println("Ingrese el numero 1");
                String n1 = leer.next();
                int num1 = Integer.parseInt(n1);
                System.out.println("Ingrese el numero 2");
                int num2 = leer.nextInt();
                System.out.println(num1 / num2);
            } catch (InputMismatchException e) {
                System.out.println("Error en el ingreso de teclado.\n" + e);
            } catch (NumberFormatException e) {
                System.out.println("Error las letras no pueden convertirse en numeros\n" + e);
            } catch (ArithmeticException e) {
                System.out.println("Error no se puede dividir por cero.\n" + e);
            }
            num++;
        }
    }

}
