package Extra05;

import java.util.Scanner;

public class AdivinarMesMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AdivinarMes juego = new AdivinarMes();
        juego.llenarMeses();

        System.out.println("******************************************");
        System.out.println("* Bienvenido al juego de adivinar el mes *");
        System.out.println("******************************************");

        System.out.println(" MENU");
        System.out.println("1. Para elegir un mes aleatorio.");
        System.out.println("2. Para ingresar el mes de forma manual.");

        int menu = 0;
        String mesj = "";

        while (menu > 2 || menu < 1) {
            menu = leer.nextInt();
            switch (menu) {

                case 1:
                    juego.mesSecreto();
                    System.out.println("Se ingreso un mes aleatorio!");
                    break;
                case 2:
                    System.out.println("Selecciona el mes 1-12: ");
                    int mes = leer.nextInt();
                    juego.elegirMes(mes);
                    System.out.println("Se cargo el mes correctamente!");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }

        }
        System.out.println(juego.getMesSecreto());
        System.out.println("A JUGAR!!!!");
        System.out.println("Ingrese 'xx' para salir.");
        
        while(!(mesj.equals(juego.getMesSecreto())) && !(mesj.equals("xx"))){
            System.out.println("Adivina el mes: ");
            mesj = leer.next();
            if(!mesj.equals(juego.getMesSecreto())){
                System.out.println("Mes Incorrecto Intente de nuevo.");
            }else if(mesj.equals("xx")){
                System.out.println("Suerte para la proxima!");
            }else{
                System.out.println("FELICITACIONES ADIVINASTE EL MES!!!!");
            }
        }
        
        System.out.println("El programa finalizo correctamente.");
    }

}
