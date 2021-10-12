
package Ejercicio06;


public class Tienda {
    private String producto;
    private int precio;
    
    public Tienda(){}
    
    public Tienda(String producto, int precio){
        this.producto = producto;
        this.precio = precio;
    }
    
    public String getProducto(){
        return producto;
    }
    public void setProducto(String producto){
        this.producto = producto;
    }
    
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    public String mostrarProductos(){
        return "Producto: "+producto+" Precio: "+precio;
    }
}
