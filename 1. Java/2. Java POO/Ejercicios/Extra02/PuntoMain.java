
package Extra02;


public class PuntoMain {

 
    public static void main(String[] args) {
        Punto p = new Punto();
        
        p.crearPuntos();
        System.out.println("La distancia entre los puntos ingresados es de: "+p.calcularDistancia());
    }
    
}
