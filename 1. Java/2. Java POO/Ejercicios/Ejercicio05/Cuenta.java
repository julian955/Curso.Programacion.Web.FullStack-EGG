
package Ejercicio05;


public class Cuenta {
    
    int numCuenta;
    int DNI;
    float saldo;
    String nombre;
    
    public Cuenta(){}
    
    public Cuenta(String nombre,int numCuenta,int DNI,float saldo){
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.nombre = nombre;
    }
    
    public int getNumCuenta(){
        return numCuenta;
    }
    
    public void setNumCuenta(int NumCuenta){
        this.numCuenta = numCuenta;
    }
    
    public int getDNI(){
        return DNI;
    }
    
    public void setDNI(int DNI){
        this.DNI = DNI;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void consultarDatos(){
   
        System.out.println("Titular de la cuenta: "+ nombre);
        System.out.println("DNI del titular: "+ DNI);
        System.out.println("Numero de cuenta: "+numCuenta);
     
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", DNI=" + DNI + ", saldo=" + saldo + ", nombre=" + nombre + '}';
    }
    
}
