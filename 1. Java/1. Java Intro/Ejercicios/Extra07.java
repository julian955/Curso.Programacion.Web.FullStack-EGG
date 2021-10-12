
import java.util.Scanner;


public class Extra07 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int min = 999999,max = 0,prom,num,n,cont = 0,total = 0;
        
        System.out.println("Ingrese la cantidad de numeros a ingresar: ");
        
        num = leer.nextInt();
        
        while(num<=0){
            System.out.println("Maximo no valido, Por favor ingrese otro:");
            num = leer.nextInt();
        }
        
        while(cont <= num-1){
            
            System.out.println("Ingrese un numero: ");
            n = leer.nextInt();
            
            if(n > max){
                max = n;
            }
            if(n < min) {
                min = n;
            }
            
            total = total + n;
            cont ++;
        
        }
        
        prom = total/num;
        
        System.out.println("El numero maximo ingresado fue: "+max);
        System.out.println("El numero minimo ingresado fue: "+min);
        System.out.println("El promedio de los numeros ingresados es de: "+prom);
        
        cont = 0;
        max = 0;
        min = 9999;
        total = 0;
        
        System.out.println("Ingrese la cantidad de numeros a ingresar: ");
        
        num = leer.nextInt();
        
         while(num<=0){
            System.out.println("Maximo no valido, Por favor ingrese otro:");
            num = leer.nextInt();
        }
         
         do{
             
            System.out.println("Ingrese un numero: ");
            n = leer.nextInt();
            
            if(n > max){
                max = n;
            }
            if(n < min) {
                min = n;
            }
            
            total = total + n;
            cont ++;
         
         }while(cont <= num-1);
         
         prom = total/num;
        System.out.println("El numero maximo ingresado fue: "+max);
        System.out.println("El numero minimo ingresado fue: "+min);
        System.out.println("El promedio de los numeros ingresados es de: "+prom);
    
    }
    
}
