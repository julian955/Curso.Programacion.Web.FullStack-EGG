package Extra09;

import java.util.Scanner;

public class PassMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese su DNI");
        int dni = leer.nextInt();

        Pass p1 = new Pass(nombre, dni);
        int menu = 0, aux, p = 0;
        String pAux;
        menu();
        while (menu != 8) {
            
            System.out.println("Ingrese la opcion deseada: ");
            menu = leer.nextInt();

            switch (menu) {
                case 1:                    
                    if (p == 0) {
                        System.out.println("Esta opcion solo puede utilizarse 1 vez.");
                        p1.crearPass();
                        p++;
                    } else {
                        System.out.println("La password de su cuenta ya fue creada.");
                    }
                    break;
                case 2:
                    p1.analizarPass();
                    break;
                case 3:
                    System.out.println("Ingrese su password: ");
                    pAux = leer.next();
                    if (p1.getPass().equals(pAux)) {
                        p1.crearPass();
                    } else {
                        System.out.println("Contraseña incorrecta.");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese su password: ");
                    pAux = leer.next();
                    if (p1.getPass().equals(pAux)) {
                        System.out.println("Ingrese su nuevo nombre: ");
                        nombre = leer.next();
                        p1.setNombre(nombre);
                        System.out.println("Su nombre se modifico correctamente.");
                    } else {
                        System.out.println("Contraseña incorrecta.");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese su password: ");
                    pAux = leer.next();
                    if (p1.getPass().equals(pAux)) {
                        System.out.println("Ingrese el nuevo DNI");
                        dni = leer.nextInt();
                        p1.setDni(dni);
                        System.out.println("Su DNI se modifico correctamente.");
                    } else {
                        System.out.println("Contraseña incorrecta.");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese su password: ");
                    pAux = leer.next();
                    if (p1.getPass().equals(pAux)) {
                        System.out.println("Su nombre es: " + p1.getNombre());
                        System.out.println("Su dni es: " + p1.getDni());
                        System.out.println("Su pass es: " + p1.getPass());
                    } else {
                        System.out.println("Contraseña incorrecta.");
                    }
                    break;

                case 7:
                    menu();
                    break;
                case 8:
                    System.out.println("Muchas Gracias!");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        }
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1. Ingresar password");
        System.out.println("2. Comprobar el nivel de su password");
        System.out.println("3. Modificar password");
        System.out.println("4. Modificar nombre");
        System.out.println("5. Modificar DNI");
        System.out.println("6. Mostrar datos.");
        System.out.println("7. Mostrar menu.");
        System.out.println("8. Salir.");
    }

}
