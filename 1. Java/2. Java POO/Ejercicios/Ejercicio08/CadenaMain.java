
package Ejercicio08;

import java.util.Scanner;


public class CadenaMain {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        int longitud = frase.length();
        
        Cadena cad = new Cadena(frase, longitud);
        String letra,aux;
        char letra1;
        int menu = 0;
        System.out.println("Que desea hacer?");
        menu();
        while(menu != 9){
            System.out.println("Para visualizar el menu ingrese 0");
            System.out.println("Ingrese una opcion: ");
            menu = leer.nextInt();
        
            switch(menu){
                case 1:
                    System.out.println("Hay un total de "+cad.mostrarVocales()+" vocales en la frase.");
                    break;
                case 2:
                    System.out.println(cad.invertirFrase());
                    break;
                case 3:
                    System.out.println("Dame una letra:");
                    letra = leer.next();
                    System.out.println("La letra se repite "+cad.vecesRepetida(letra)+" veces");
                    break;
                case 4:
                    System.out.println("Ingrese una frase: ");
                    aux = leer.next();
                    if(cad.compararLongitud(aux)== true){
                        System.out.println("La cadena ingresada es mas larga.");
                    }else{
                        System.out.println("La cadena ingresada es mas corta.");
                    }
                    break;
                case 5:
                     System.out.println("Ingrese una frase: ");
                     aux = leer.next();
                     System.out.println("La frase final quedaria: "+cad.unirFrase(aux));
                     break;
                case 6:
                    System.out.println("Ingrese una letra: ");
                    letra1 = leer.next().charAt(0);
                    System.out.println(cad.reemplazar(letra1));
                    break;
                case 7:
                    System.out.println("Ingrese una letra:");
                    letra = leer.next();
                    if(cad.contiene(letra) == true){
                        System.out.println("La frase contiene la letra ingresada.");
                    }else{
                        System.out.println("La frase no tiene la letra ingresada");
                    }
                    break;
                case 8:
                    System.out.println("Ingrese una frase: ");
                    frase = leer.next();
                    cad.setFrase(frase);
                    longitud = frase.length();
                    cad.setLongitud(longitud);
                    break;
                case 9:
                    System.out.println("Gracias!");
                    break;
                case 0:
                    menu();
                    break;
                default:
                    System.out.println("Opcion incorrecta,por favor ingrese otra:");
                    break;
            }
        }
        System.out.println("El programa finalizo correctamente.");
       
    }
    
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. Mostrar la cantidad de vocales.");
        System.out.println("2. Invertir la frase.");
        System.out.println("3. Cuenta cuantas veces hay una letra en la frase.");
        System.out.println("4. Compara la longitud con una frase ingresada.");
        System.out.println("5. Une la frase con una ingresada.");
        System.out.println("6. Reemplaza las letras 'A' por una ingresada.");
        System.out.println("7. Muestra si la frase contiene una letra ingresada.");
        System.out.println("8. Reingresar la frase principal.");
        System.out.println("9. Salir");
    }
    
}
