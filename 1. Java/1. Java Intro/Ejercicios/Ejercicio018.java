
import java.util.Scanner;


public class Ejercicio018 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Limitaremos hasta donde contara el contador");
        System.out.println("Ingrese el primer digito del contador (X-X-X)");
        int n = leer.nextInt();
        int i,j;
        String conversor;
        for(i=0;i<=n;i++)
        {
            conversor = String.valueOf(i);
            if(i<10)
            {
                System.out.println("Contador: 00"+conversor.replace('3', 'E'));
            }
            else
            {
                if(i<100)
                {
                    System.out.println("Contador: 0"+conversor.replace('3', 'E'));
                }
                else
                {
                    if(i>99)
                    {System.out.println("Contador: "+conversor.replace('3', 'E'));}
                }
            }
            
        }
        
    }
    }
    

