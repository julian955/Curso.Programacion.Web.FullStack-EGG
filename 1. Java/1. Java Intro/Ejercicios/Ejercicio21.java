
import java.util.Scanner;


public class Ejercicio21 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("A que moneda desea convertir?");
        String moneda = leer.nextLine();
        
        while(!moneda.equals("libras") && !moneda.equals("dolares") && !moneda.equals("yenes") ){
        
            if(!moneda.equals("libras") && !moneda.equals("dolares") && !moneda.equals("yenes")){
                System.out.println("Moneda invalida, por favor ingrese otra: ");
                moneda = leer.nextLine();
            }
        }
        
        System.out.println("Ingrese el monto a convertir: ");
        double monto = leer.nextDouble();
        
        conversion(monto,moneda);
    }
    
    static void conversion(double monto,String moneda){
        double total;
        if (moneda.equals("libras")){
            total = monto * 0.86;
        }else if(moneda.equals("dolares")){
            total = monto * 1.28611;
        }else{
            total = monto * 129.852;
        }
        
        System.out.println(monto + " euros son : " + total +" "+ moneda);
    }
    
}
