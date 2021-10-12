
import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz;
        matriz = new int[3][3];
        int num , i, j, diag = 0, col = 0, fil = 0;

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.println("Ingrese un numero:");
                num = leer.nextInt();
                while (num < 1 || num > 9) {
                    
                    if (num < 1 || num > 9) {
                        System.out.println("El numero ingresado no es valido");
                        System.out.println("Por favor ingrese otro:");
                        num = leer.nextInt();
                    }
                }

                matriz[i][j] = num;
            }

        }

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {

                if (i == j) {
                    diag = diag + matriz[i][j];
                }

                if (i == 0) {
                    fil = fil + matriz[i][j];
                }

                if (j == 0) {
                    col = col + matriz[i][j];
                }

            }

        }
        
        

        if(col == fil && col == diag){            
            System.out.println("LA MATRIZ ES MAGICA!!");
        
        }else {
            System.out.println("La matriz no es magica.");
        }
            

    }

}
