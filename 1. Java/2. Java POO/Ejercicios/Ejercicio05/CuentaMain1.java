package Ejercicio05;

import java.util.Scanner;

public class CuentaMain1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaService cs = new CuentaService();
        int menu = 0, i, num = 0, select = 0;

        System.out.println("Cuantas cuentas desea agregar? ");
        num = leer.nextInt();

        Cuenta cuentas[] = new Cuenta[num];

        for (i = 0; i < num; i++) {
            System.out.println("Ingrese los datos de la cuenta " + (i + 1));
            cuentas[i] = cs.crearCuenta();
        }

        System.out.println("Cuentas creadas: ");
        for (i = 0; i < num; i++) {
            System.out.println((i + 1) + "." + cuentas[i].getNombre());
        }

        System.out.println("Con que cuenta desea operar?:");
        select = leer.nextInt();
        
        
         System.out.println("Que operacion desea realizar? ");

        while (menu != 7) {
            menu();
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Su saldo actual es de: " + cuentas[select-1].getSaldo());
                    cuentas[select-1].setSaldo(cs.ingresarDinero(cuentas[select-1].getSaldo()));
                    System.out.println("Su nuevo saldo es de: " + cuentas[select-1].getSaldo());
                    break;

                case 2:
                    System.out.println("Su saldo actual es de: " + cuentas[select-1].getSaldo());
                    cuentas[select-1].setSaldo(cs.retirarDinero(cuentas[select-1].getSaldo()));
                    System.out.println("Su nuevo saldo es de: " + cuentas[select-1].getSaldo());
                    break;

                case 3:
                    System.out.println("Recuerde que en la extraccion rapida tiene un retiro limitado.");
                    System.out.println("Su saldo total es de: " + cuentas[select-1].getSaldo());
                    cuentas[select-1].setSaldo(cs.extraccionRapida(cuentas[select-1].getSaldo()));
                    System.out.println("Su nuevo saldo es de: " + cuentas[select-1].getSaldo());
                    break;

                case 4:
                    System.out.println("Su saldo actual es de: " + cuentas[select-1].getSaldo());
                    break;
                case 5:
                    cuentas[select-1].consultarDatos();
                    break;
                    
                case 6:
                     System.out.println("Con que cuenta desea operar?:");
                     select = leer.nextInt();
                     
                     while(select > num){
                         System.out.println("Cuenta no valida, Seleccione otra:");
                         select = leer.nextInt();
                     }
                     break;
                     
                case 7:
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
        System.out.println("6. Para cambiar de cuenta.");
        System.out.println("7. Para salir.");
    }

}
