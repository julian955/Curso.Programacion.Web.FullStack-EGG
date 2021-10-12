
import java.util.Scanner;


public class Extra16 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
      
        
        if(primo(num)== true){
            System.out.println("El numero ingresado NO es primo.");
        }else{
            System.out.println("El numero ingresado ES PRIMO!.");
        }
    }
    
    public static boolean primo(int num){
        int i,cont = 0,aux = 0;
        boolean valor = false;
        
        
        for(i = 0; i <= num ; i++){ 
            aux++;
            if(num%aux == 0){
                cont++;
            }                    
        }
        
          if(cont > 2){
                valor = true;
            } 
          
        return valor;
    
    }
    
}
