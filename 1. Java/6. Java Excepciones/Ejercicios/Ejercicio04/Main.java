package Ejercicio04;

import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = (int) (Math.random() * 500 + 1);
        System.out.println(num);

        int x = 0, aux = 0;
        int ad = 0;
        System.out.println("Adivina el numero!! ingrese 9999 para salir");

//        while (x != 9999) {
//            try {
//
//                System.out.println("Dame un numero: ");
//                x = leer.nextInt();
//                if (x == num) {
//                    System.out.println("FELICITACIONES GANASTE!");
//                    System.out.println("Intentos: " + aux);
//                    break;
//                } else if (x > num) {
//                    System.out.println("El numero ingresado es mayor");
//                } else {
//                    System.out.println("El numero ingresado es menor");
//                }
//                aux++;
//
//            } catch (InputMismatchException e) {
//                System.out.println("Error: " + e);
//                aux++;
//                leer.next();
//            } finally {
//                System.out.println("Intentos realizados: " + aux);
//            }
//
//        }

        while (x != 9999) {
            try {

                System.out.println();
                x = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero: "));
                if (x == num) {
                    System.out.println("FELICITACIONES GANASTE!");
                    System.out.println("Intentos: " + aux);
                    break;
                } else if (x > num) {
                    System.out.println("El numero ingresado es mayor");
                } else {
                    System.out.println("El numero ingresado es menor");
                }
                aux++;

            } catch (Exception e) {
                System.out.println("Error: " + e);
                aux++;
               // leer.next();
            } finally {
                System.out.println("Intentos realizados: " + aux);
            }

        }

    }

}
