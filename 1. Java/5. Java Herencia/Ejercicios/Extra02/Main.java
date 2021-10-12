
package Extra02;

import java.util.ArrayList;

public class Main {

  
    public static void main(String[] args) {
        ArrayList<Edificio> lista = new ArrayList();
        
        lista.add(new Polideportivo("Sarmiento", true, 500, 5, 1000));
        lista.add(new Polideportivo("Belgrano", false, 800, 4, 1200));
        lista.add(new EdificioDeOficinas(10, 25, 5, 500, 2000, 500));
        lista.add(new EdificioDeOficinas(24, 40, 12, 1000, 4000, 1000));
        
        for (Edificio aux : lista) {
            aux.calcularSuperficie();
            aux.calcularVolumen();
        }
        
        lista.get(0).techo();
        lista.get(1).techo();
        lista.get(2).cantPersonas();
        lista.get(3).cantPersonas();
                
    }
    
}
