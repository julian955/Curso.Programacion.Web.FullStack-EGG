
package Ejercicio05;

import java.util.Scanner;


public class CuentaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta(){
       
        System.out.println("Introduce tu nombre: ");
        String nombre = leer.next();
        System.out.println("Introduce tu D.N.I: ");
        int DNI = leer.nextInt();
        System.out.println("Introduce tu numero de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.println("Introduce el saldo: ");
        float saldo = leer.nextFloat();
        
        return new Cuenta(nombre, numeroCuenta, DNI, saldo);
    
    }
    
    public float ingresarDinero(float obj){        
        
        System.out.println("Cuanto dinero desea ingresar?");
        float dinero = leer.nextFloat();
        float total = dinero + obj;        
        return total;
    }
    
    public float retirarDinero(float obj){
        
        System.out.println("Cuanto dinero desea retirar?");
        float retiro = leer.nextFloat();
        
        while(retiro > obj){
            System.out.println("Transaccion no valida, Ingrese otro monto: ");
            retiro = leer.nextFloat();
        }
        float total = obj - retiro;
        
        return total;
    }
    
    public float extraccionRapida(float obj){        
        
        float disponible = (float) (obj*0.2);        
        System.out.println("Su saldo disponible para retirar es de: "+disponible);
        
        System.out.println("Ingrese la cantidad a retirar: ");
        float retiro = leer.nextFloat();
        
        while(retiro > disponible){
            System.out.println("Transaccion no valida, Ingrese otro monto: ");
            retiro = leer.nextFloat();
        }
        
        float total = obj - retiro;
        return total;
    }
    
    public void consultarSaldo(float obj){
        System.out.println("Su saldo actual es de: "+obj);
    }
    
    
}
