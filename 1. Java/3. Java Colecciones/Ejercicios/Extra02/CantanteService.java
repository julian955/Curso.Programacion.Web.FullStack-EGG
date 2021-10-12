
package Extra02;

import java.util.List;
import javax.swing.JOptionPane;


public class CantanteService {
    
    public Cantante crearCantante(){
        
       String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cantante");
       String dmv = JOptionPane.showInputDialog("Ingrese el disco mas vendido");
       
       return new Cantante(nombre, dmv);
    }
    
    public void agregarCantante(List<Cantante> cantantes){
        
        Cantante c = crearCantante();
        cantantes.add(c);
        JOptionPane.showMessageDialog(null, "El cantante se agrego correctamente!");        
    }
    
    public void eliminarCantante(List<Cantante> cantantes,String cantante){
        int n = 0;
        for (Cantante aux : cantantes) {
            if(aux.getNombre().equalsIgnoreCase(cantante)){
                cantantes.remove(aux);
                JOptionPane.showMessageDialog(null, "El cantante se elimino correctamente.");
                n = 1;
                break;
            }
        }
        if(n == 0){
            JOptionPane.showMessageDialog(null, "El cantante no se encuentra en la lista.");
        }
    }
    
    public void mostrarCantante(List<Cantante> cantantes){
        int aux = 0;
        String x = "";
        
        for (Cantante cant : cantantes) {
            aux++;
            x =x+ aux+" == "+cant.mostrarCantante()+"\n";
        }
        JOptionPane.showMessageDialog(null, x);
    }
    
}
