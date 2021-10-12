
import java.util.Scanner;


public class Extra13 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] array;
        
        System.out.println("Ingrese la cantidad de familias: ");
        int fam = leer.nextInt();
        
        array = new int[fam];
        int i,cont,edad = 0,hijos = 0;
        double promedio;
        
        for(i = 0; i <= fam-1 ; i++){
            System.out.println("Ingrese los hijos de la familia "+(i+1));
            array[i] = leer.nextInt();
            hijos = hijos + array[i];
        }
        
        for(i = 0; i <= fam-1 ; i++){
            System.out.print("["+array[i]+"]");
          
        }
        System.out.println("");
        for(i = 0; i <= fam-1 ; i++){
            cont = 0;
            while(array[i] != cont){
                System.out.println("ingrese la edad del hijo "+(cont+1)+ " de la familia "+(i+1));
                edad = edad + leer.nextInt();
                cont++;
            }
        }
        promedio = edad/hijos;
        //Math.floor(promedio);
        
        System.out.println("El total de las edades es: "+edad);
        System.out.println("El total de los hijos es de: "+hijos);
        System.out.println("El promedio de todas las edades es de: "+(promedio));
        
    }
    
}
