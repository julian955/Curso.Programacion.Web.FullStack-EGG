
import java.util.Scanner;


public class Extra20 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz;
        double[] vector;
        vector = new double[11];
        matriz = new int[11][6];
        
        int alumnos,nota,i,j,aprov=0,desaprov=0;
               
        for(i = 0 ; i <= 10 ; i++){
            for(j = 0; j <= 4;j++){
                if(j == 0 && i > 0){
                    matriz[i][j] = i;
                }else if(i == 0 && j > 0){
                    matriz[i][j] = j;
                }else if(i>0&&j>0){
                    //System.out.println("Ingrese la nota "+j+" del alumno "+i);
                    //matriz[i][j] = leer.nextInt();
                    matriz[i][j] = (int)(Math.random()*10);
                }
            }
        }
        
        for(i = 1; i<= 10;i++){
            vector[i] = (matriz[i][1]*0.1)+(matriz[i][2]*0.15)+(matriz[i][3]*0.25)+(matriz[i][4]*0.5);
            matriz[i][5] = (int) ((matriz[i][1]*0.1)+(matriz[i][2]*0.15)+(matriz[i][3]*0.25)+(matriz[i][4]*0.5));
        }
        
        for(i = 0; i <= 10;i++){
            for(j = 0; j <= 5; j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        for(i = 1; i <= 10 ; i++){
            if(vector[i]>= 7){
                aprov = aprov + 1;
            }else{
                desaprov = desaprov + 1;
            }
            System.out.print("["+vector[i]+"]");
        }
          System.out.println("");
        System.out.println("Hay "+aprov+" alumnos aprovados y "+desaprov+ " desaprovados.");
        
        
        
            
         
    }
    
}
