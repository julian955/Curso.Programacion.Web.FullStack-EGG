package Extra03;

public class Residencia extends AlojamientoExtra {

    protected int habitaciones;
    protected boolean descGremio;
    protected boolean campoDep;

    public Residencia(int habitaciones, boolean descGremio, boolean campoDep, String nombre, boolean privado, int metros) {
        super(nombre, privado, metros);
        this.habitaciones = habitaciones;
        this.descGremio = descGremio;
        this.campoDep = campoDep;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isCampoDep() {
        return campoDep;
    }

    public void setCampoDep(boolean campoDep) {
        this.campoDep = campoDep;
    }

    public String mostrarDatos() {
        return "--------- RESIDENCIA ---------\n" + "Nombre: " + nombre + "\nPrivado: " + privado + "\nEspacio: " + metros + " m2"
                + "\nCantidad de habitaciones: " + habitaciones + "\nDescuentos a gremios: " + descGremio + "\nCampo deportivo: " + campoDep;
    }
}
