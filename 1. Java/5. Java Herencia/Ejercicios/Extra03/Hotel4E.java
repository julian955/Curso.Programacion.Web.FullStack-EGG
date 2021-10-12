
package Extra03;


public class Hotel4E extends Hotel {
    protected char gym;
    protected String nombreRestaurant;
    protected int capacidadRestaurant;

    public Hotel4E(char gym, String nombreRestaurant, int capacidadRestaurant, String nombre, int habitaciones, int camas, int pisos, double precio) {
        super(nombre, habitaciones, camas, pisos, precio);
        this.gym = gym;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

   
    public char getGym() {
        return gym;
    }

    public void setGym(char gym) {
        this.gym = gym;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }
    
    @Override
    public String mostrarDatos(){
        return "--------- HOTEL **** ---------\n" +"Nombre del hotel: "+nombre+"\nCantidad de pisos: "+pisos+"\nCantidad de habitaciones: "+habitaciones+"\nCantidad de camas: "+camas
                +"\nGimnacio tipo: "+gym+"\nNombre del restaurante: "+nombreRestaurant+"\nCapacidad del restaurante: "+capacidadRestaurant+"\nPRECIO ==  "+precio+" $";
    }
}
