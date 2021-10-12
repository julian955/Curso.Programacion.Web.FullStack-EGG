package Extra03;

public class Hotel5E extends Hotel4E {

    protected int salonesConf;
    protected int cantSuit;
    protected int cantLimusinas;

    public Hotel5E(int salonesConf, int cantSuit, int cantLimusinas, char gym, String nombreRestaurant, int capacidadRestaurant, String nombre, int habitaciones, int camas, int pisos, double precio) {
        super(gym, nombreRestaurant, capacidadRestaurant, nombre, habitaciones, camas, pisos, precio);
        this.salonesConf = salonesConf;
        this.cantSuit = cantSuit;
        this.cantLimusinas = cantLimusinas;
    }

    public int getSalonesConf() {
        return salonesConf;
    }

    public void setSalonesConf(int salonesConf) {
        this.salonesConf = salonesConf;
    }

    public int getCantSuit() {
        return cantSuit;
    }

    public void setCantSuit(int cantSuit) {
        this.cantSuit = cantSuit;
    }

    public int getCantLimusinas() {
        return cantLimusinas;
    }

    public void setCantLimusinas(int cantLimusinas) {
        this.cantLimusinas = cantLimusinas;
    }

    @Override
    public String mostrarDatos() {
        return "--------- HOTEL ***** ---------\n"+"Nombre del hotel: " + nombre + "\nCantidad de pisos: " + pisos + "\nCantidad de habitaciones: " + habitaciones + "\nCantidad de camas: " + camas
                + "\nGimnacio tipo: " + gym + "\nNombre del restaurante: " + nombreRestaurant + "\nCapacidad del restaurante: " + capacidadRestaurant +
                "\nSalones de conferencia: "+salonesConf+"\nSuits: "+cantSuit+"\nLimusinas: "+cantLimusinas+"\nPRECIO ==  " + precio + " $";
    }

}
