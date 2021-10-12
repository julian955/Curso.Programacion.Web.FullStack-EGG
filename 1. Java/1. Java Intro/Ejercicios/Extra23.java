
import java.util.Scanner;


public class Extra23 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Indique el numero limite: ");
        int lim = leer.nextInt();
        int cont = 0,num = 0;
        
        int[] vector;
        vector = new int[lim];
        
        
        
        while(cont != lim){
        
            if(cont < 2){
                num = 1;
            }else{
                num = vector[cont-1] + vector[cont-2];
            }
            vector[cont] = num;
            System.out.print("["+vector[cont]+"]");
            cont++;        
            
        }
        System.out.println("");
        
        
    }
    
}
