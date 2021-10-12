
import java.util.Scanner;


public class Extra21 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int f,c,j,i,aux = 0;
        
        System.out.println("Ingrese el numero de filas: ");
        f = leer.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        c = leer.nextInt();
        
        int[][] matriz;
        matriz = new int[f][c];
        
        for(i = 0;i <= f-1 ; i++){
            for(j = 0; j <= c-1 ; j++){
                matriz[i][j]= (int)(Math.random()*10);
                aux = aux + matriz[i][j];
            }
        }
        
        
        for(i = 0;i <= f-1 ; i++){
            for(j = 0; j <= c-1 ; j++){
                System.out.print("["+matriz[i][j]+"]");                
            }
            System.out.println("");
        }
        
        System.out.println("La suma total de la matriz es: "+aux);
    }
    
}
