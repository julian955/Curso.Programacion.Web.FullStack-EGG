
package Extra03;


public class Hotel {
    protected String nombre;
    protected int habitaciones;
    protected int camas;
    protected int pisos;
    protected double precio;

    public Hotel(String nombre, int habitaciones, int camas, int pisos, double precio) {
        this.nombre = nombre;
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String mostrarDatos(){
        return "Nombre del hotel: " + nombre + "\nCantidad de pisos: " + pisos + "\nCantidad de habitaciones: " + habitaciones + "\nCantidad de camas: " + camas + "\nPRECIO ==  " + precio + " $";
    }
}
