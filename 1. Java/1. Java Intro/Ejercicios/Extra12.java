
import java.util.Scanner;


public class Extra12 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in); 
      
        System.out.println("Ingrese el tamaño de la escalera:");
        int tam = leer.nextInt();
        
        int i,j,cont;
        
        for(i = 0; i <= tam; i++){
            cont = 1;
            while(cont != i+1){
                System.out.print(cont);
                cont = cont+1;
            }
            System.out.println("");
         
        }
    }
    
}
