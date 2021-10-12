
import java.util.Scanner;


public class Ejercicio24 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[] vector;
       int max,i,num;
       int n1=0,n2=0,n3=0,n4=0,n5 = 0;
       
        System.out.println("Ingrese el tamaño del vector: ");
        max = leer.nextInt();
        
        vector = new int[max];
        
        for (i = 0 ; i <= max-1 ; i++){
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            vector[i] = num;
           // System.out.print("["+vector[i]+"]");
        }
        
        for(i = 0; i <= max-1; i++){
            if(vector[i]<= 9){
                n1 = n1 +1;
            }else if(vector[i]<= 99){
                n2 = n2+1;
            }else if(vector[i]<= 999){
                n3 = n3+1;
            }else if(vector[i]<= 9999){
                n4 = n4+1;
            }else {
                n5 = n5+1;
            }
        }
        
        System.out.println("Se encontraron "+n1+" numeros de 1 digito");
        System.out.println("Se encontraron "+n2+" numeros de 2 digito");
        System.out.println("Se encontraron "+n3+" numeros de 3 digito");
        System.out.println("Se encontraron "+n4+" numeros de 4 digito");
        System.out.println("Se encontraron "+n5+" numeros de 5 digito");
       
    }
    
}
