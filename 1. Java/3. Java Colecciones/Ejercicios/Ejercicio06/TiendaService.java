
package Ejercicio06;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class TiendaService {
    
    public Tienda crearProductos(){
       String produto =  JOptionPane.showInputDialog("Ingrese el nombre del producto");
       int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"));
       
       return new Tienda(produto, precio);
    }
    
    public void agregarProductos(HashMap<String,Integer> prod){
        Tienda p = crearProductos();
        prod.put(p.getProducto(),p.getPrecio());
    }
    
    public void modificarPrecio(HashMap<String,Integer> prod,int precio,String producto){
        int aux = 0;
        for (Map.Entry<String,Integer> entry : prod.entrySet()) {
           if(entry.getKey().equalsIgnoreCase(producto)){
               entry.setValue(precio);
               JOptionPane.showMessageDialog(null, "El precio se modifico correctamente.");
               aux = 1;
               break;
           }
            
        }
        if(aux == 0){
        JOptionPane.showMessageDialog(null, "El producto ingresado no se encuentra en la lista.");
        
        }
    }
    
    public void eliminarProducto(HashMap<String,Integer> prod,String producto){
        int aux = 0;
        
        for (Map.Entry<String, Integer> entry : prod.entrySet()) {
            if(entry.getKey().equalsIgnoreCase(producto)){
                prod.remove(entry.getKey());
                JOptionPane.showMessageDialog(null, "El producto se elimino correctamente.");
                aux = 1;
                break;
            }
            
        }
         if(aux == 0){
        JOptionPane.showMessageDialog(null, "El producto ingresado no se encuentra en la lista.");
        
        }
    }
    
    public void mostrarProductos(HashMap<String,Integer> prod){
        String produ = "";
        int aux = 0;
        for (Map.Entry<String, Integer> entry : prod.entrySet()) {
            aux++;
            produ = produ + " Producto "+aux+": "+entry.getKey()+" Precio: "+entry.getValue()+" $\n";
                        
        }
        JOptionPane.showMessageDialog(null, produ);
    }
}
