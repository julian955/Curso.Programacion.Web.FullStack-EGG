
package Ejercicio03;

import Ejercicio02.Electrodomestico;
import Ejercicio02.Lavadora;
import Ejercicio02.Televisor;
import java.util.ArrayList;
import java.util.List;


public class Main {
    
    
    
    public static void main(String[] args) {
       List<Electrodomestico> elect = new ArrayList();
       double precioTotal = 0;
       double tele,lava;
       elect.add(new Lavadora(40, 1000d, "Blanco", 'A', 80));
       elect.add(new Lavadora(20, 1000d, "Gris", 'C', 50));
       elect.add(new Televisor(60, true, 1000d, "Negro", 'A', 50));
       elect.add(new Televisor(32, false, 1000d, "Blanco", 'B', 20));
       
        for (Electrodomestico aux : elect) {
            aux.precioFinal();
            precioTotal += aux.getPrecio();
        }
        lava = elect.get(0).getPrecio()+elect.get(1).getPrecio();
        tele = elect.get(2).getPrecio()+elect.get(3).getPrecio();
        
        System.out.println("El precio total de los electrodomesticos es de: "+precioTotal+" $");
        System.out.println("El precio de las lavadoras es de: "+lava+" $");
        System.out.println("El precio de los televisores es de: "+tele+" $");
    }
    
}
