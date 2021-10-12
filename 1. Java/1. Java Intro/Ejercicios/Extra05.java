
import java.util.Scanner;


public class Extra05 {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Por favor ingrese su categoria: ");
        String cat = leer.next();
        int monto,total;
        
        while(!(cat.equals("a") || cat.equals("b") || cat.equals("c"))){
            System.out.println("Categoria no valida, ingrese otra:");
            cat = leer.next();
        }
        
        System.out.println("Ingrese el monto del tratamiento: ");
        monto = leer.nextInt();
        
        if(cat.equals("a")){
            total = monto/2; 
            System.out.println("El total que debe abonar es de : "+total+" $");
        }else if(cat.equals("b")){
            total = monto - ((monto*35)/100);
            System.out.println("El total que debe abonar es de : "+total+" $");
        }else{
            System.out.println("Su categoria no posee descuentos usted debe abonar: "+monto+" $");
        }    
        
    }
    
}
