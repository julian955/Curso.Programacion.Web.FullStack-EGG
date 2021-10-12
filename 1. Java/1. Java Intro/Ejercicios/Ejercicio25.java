
public class Ejercicio25 {

    
    public static void main(String[] args) {
        int[][] matriz,matrizt;
        int i,j,num;
        matriz = new int[4][4];
        matrizt = new int[4][4];
        for(i=0;i<=3;i++){
            for(j=0;j<=3;j++){
                num = (int) (Math.random() * 10);
                matriz[i][j] = num;
                matrizt[j][i]= num;
            }
        }
        
        for(i=0;i<=3;i++){
            for(j=0;j<=3;j++){
                System.out.print("["+matriz[i][j]+"]");             
                
            }
            System.out.println("\n");
        }
        
          for(i=0;i<=3;i++){
            for(j=0;j<=3;j++){
                System.out.print("["+matrizt[i][j]+"]");             
                
            }
            System.out.println("\n");
        }
    }
    
    
}
