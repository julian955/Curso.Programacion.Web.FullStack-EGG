
import java.util.Scanner;


public class Extra06 {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Por favor ingrese el total de personas: ");
        int total = leer.nextInt();
        
        int i,contador = 0;
        double menor = 0,mayor = 0,promedio,promedio1;
        
        for(i = 0 ; i <= total-1 ; i ++){
        
            System.out.println("Ingrese la altura de la persona numero "+i);
            double alt = leer.nextDouble();
            
            if(alt < 1.6){
                menor = menor + alt;
                contador ++;
            }else{
                mayor = mayor + alt;
            }        
            
        }
        
           promedio = menor / contador;
            promedio1 = (menor + mayor)/total;
            
            System.out.println("Hay un total de "+contador+" personas menores a 1.6 M");
            System.out.println("Su promedio es de: "+promedio);
            System.out.println("El promedio general de las personas es de : "+promedio1);
    }
    
}
