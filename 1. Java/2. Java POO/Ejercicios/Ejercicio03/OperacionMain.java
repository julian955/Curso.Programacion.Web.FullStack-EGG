
package Ejercicio03;

public class OperacionMain {

   
    public static void main(String[] args) {
        
        
        Operacion op1 = new Operacion();
        Operacion op2 = new Operacion();
        
        op1.crearOperacion();
        System.out.println("La suma es: "+op1.sumar());
        System.out.println("La resta es: "+ op1.restar());
        System.out.println("La multiplicacion es: "+op1.multiplicar());
        System.out.println("La divicion es: "+op1.dividir());
        
        System.out.println("\n<------------------------------------------------->");
        
       op2.crearOperacion();
       System.out.println("La suma es: "+op2.sumar());
       System.out.println("La resta es: "+ op2.restar());
       System.out.println("La multiplicacion es: "+op2.multiplicar());
       System.out.println("La divicion es: "+op2.dividir());
    }
    
}
