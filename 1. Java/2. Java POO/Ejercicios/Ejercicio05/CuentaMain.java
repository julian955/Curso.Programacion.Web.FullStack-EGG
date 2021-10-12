package Ejercicio05;

import java.util.Scanner;

public class CuentaMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaService cs = new CuentaService();
        int menu = 0;

        //System.out.println("Cuantas cuentas desea agregar? ");
        // int num = leer.nextInt();
        //Cuenta cuentas[] = new Cuenta[num];
        Cuenta c1 = new Cuenta();

        c1 = cs.crearCuenta();

        System.out.println("Que operacion desea realizar? ");

        while (menu != 6) {
            menu();
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Su saldo actual es de: " + c1.getSaldo());
                    c1.setSaldo(cs.ingresarDinero(c1.getSaldo()));
                    System.out.println("Su nuevo saldo es de: " + c1.getSaldo());
                    break;

                case 2:
                    System.out.println("Su saldo actual es de: " + c1.getSaldo());
                    c1.setSaldo(cs.retirarDinero(c1.getSaldo()));
                    System.out.println("Su nuevo saldo es de: " + c1.getSaldo());
                    break;

                case 3:
                    System.out.println("Recuerde que en la extraccion rapida tiene un retiro limitado.");
                    System.out.println("Su saldo total es de: " + c1.getSaldo());
                    c1.setSaldo(cs.extraccionRapida(c1.getSaldo()));
                    System.out.println("Su nuevo saldo es de: " + c1.getSaldo());
                    break;

                case 4:
                    System.out.println("Su saldo actual es de: " + c1.getSaldo());
                    break;
                case 5:
                    c1.consultarDatos();
                    break;
                    
                case 6:
                    break;

                default:
                    System.out.println("La opcion ingresada no es valida.");
                    break;

            }

        }
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1. Para ingresar dinero.");
        System.out.println("2. Para retirar dinero.");
        System.out.println("3. Para extraccion rapida.");
        System.out.println("4. Para consultar saldo.");
        System.out.println("5. Para consultar datos.");
        System.out.println("6. Para salir.");
    }

}
