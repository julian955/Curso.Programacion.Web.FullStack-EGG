
import java.util.Scanner;


public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [][] matriz,matrizt;
        int i,j,num,aux,cont = 0;
        matriz = new int[3][3];
        matrizt = new int[3][3];
        
        
        for(i =0 ; i<=2 ;i++){
            for(j=0; j <=2 ;j++){
                System.out.println("Ingrese un numero");
                num = leer.nextInt();
                matriz[i][j] = num;
                matrizt[j][i] = num ;
            }
        }
        
        System.out.println("Matriz 1:");
        for(i =0 ; i<=2 ;i++){
            for(j=0; j <=2 ;j++){
                aux = matriz[i][j] * -1;
             if(matriz[j][i] != aux ){
                              
                 cont = cont +1;             
             }             
            
            }
        }
        
        if(cont > 0){
            System.out.println("La matriz no es anti simetrica.");
        }else{
            System.out.println("LA MATRIZ ES ANTI SIMETRICA!!");
        }
        
    }
    
}
