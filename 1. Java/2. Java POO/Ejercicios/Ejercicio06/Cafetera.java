
package Ejercicio06;


public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    
    public Cafetera(){}
    
    public Cafetera(int capacidadMaxima,int cantidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public int getCantidadActual(){
        return cantidadActual;
    }
    
    public void setCantidadActual(int cantidadActual){
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
    }
    
    public void servirTaza(int taza){
       if(taza > cantidadActual){           
           taza = cantidadActual;
           System.out.println("El cafe no alcanzo a llenar la taza, la taza quedo con "+ taza+" Ml");           
       }else{           
           cantidadActual -= taza;
           System.out.println("La taza se lleno correctamente");
       }
    }
    
    public void vaciarCafetera(){
        cantidadActual = 0;
    }
    
    public void agregarCafe(int cantidad){
        int total;
        total = cantidadActual + cantidad;
        if(total > capacidadMaxima){
            cantidadActual = capacidadMaxima;
            System.out.println("La cantidad ingresada supera el maximo de la cafetera, por lo tanto se coloca el maximo de la cafetera.");
            
        }else{
            cantidadActual += total;
            System.out.println("Se agrego el cafe correctamente;");
        }
    }
}
