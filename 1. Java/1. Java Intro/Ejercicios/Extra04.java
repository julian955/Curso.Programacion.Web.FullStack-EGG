
import java.util.Scanner;


public class Extra04 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre 1 y 10:");
        int num = leer.nextInt();
        
        while(num>10 || num <1){
            System.out.println("El numero ingresado es incorrecto, ingrese otro:");
            num = leer.nextInt();
        }
        
        switch(num){
        
            case 1:
                System.out.println(num+ " Equivale a : I");
                break;
            case 2:
                System.out.println(num+ " Equivale a : II");
                break;
            case 3:
                System.out.println(num+ " Equivale a : III");
                break;
            case 4:
                System.out.println(num+ " Equivale a : IV");
                break;
            case 5:
                System.out.println(num+ " Equivale a : V");
                break;
            case 6:
                System.out.println(num+ " Equivale a : VI");
                break;
            case 7:
                System.out.println(num+ " Equivale a : VII");
                break;
            case 8:
                System.out.println(num+ " Equivale a : VIII");
                break;
            case 9:
                System.out.println(num+ " Equivale a : IX");
                break;
            case 10:
                System.out.println(num+ " Equivale a : X");
                break;
        }
    }
    
}
