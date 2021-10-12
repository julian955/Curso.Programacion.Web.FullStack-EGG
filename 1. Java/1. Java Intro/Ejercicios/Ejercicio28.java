
import java.util.Scanner;


public class Ejercicio28 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz,matriz1;
        matriz = new int[10][10];
        matriz1 = new int[3][3];
        
        int i,j,num,k,l,aux = 0,cont = 0,p=0,m=0,aux1= 0;
        
        System.out.println("Primer Matriz.");
        for(i=0;i<=9;i++){
            for(j=0;j<=9;j++){
                //System.out.println("Ingrese un numero:");
                //num = leer.nextInt();
                matriz[i][j] = (int) (Math.random()*100);
            }
        }
        
         for(i=0;i<=9;i++){
            for(j=0;j<=9;j++){
                System.out.print("["+matriz[i][j]+"]" );
                
            }
             System.out.println("\n");
        }
        System.out.println("\n");
        
        
        System.out.println("Segunda Matriz.");
        for(i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                System.out.println("Ingrese un numero:");
                num = leer.nextInt();
                matriz1[i][j] = num;
                
            }
        }
        
        for(i=0;i<=9;i++){
            for(j=0;j<=9;j++){
                if(matriz[i][j] == matriz1[0][0] && i<8 && j <8){
                    aux1 = 0;
                    for(k=i;k<=i+2;k++){
                        aux = 0;
                        for(l=j;l<=j+2;l++){
                          if(matriz[k][l] == matriz1[aux1][aux]){
                              cont = cont +1;
                             
                              if(cont<9){
                                   p = i;
                                   m = j;
                              
                              }
                             
                          } 
                           aux = aux+1;
                        }
                        aux1= aux1 +1;
                    }
                }
            }
        }
        
        if(cont >= 9){
            System.out.println("SE ENCONTRO LA MATRIZ SECUNDARIA!!");
            System.out.println("La matriz 2 empieza desde la posicion:" + p+","+m+ " hasta la posicion : "+(p+2)+","+(m+2));
        }else{
            System.out.println("No se encontro la matriz secundaria dentro de la primaria");
        }
    }
    
}
