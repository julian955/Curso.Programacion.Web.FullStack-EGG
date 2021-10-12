
package Extra03;

public class AlojamientoExtra {
    protected String nombre;
    protected boolean privado;
    protected int metros;

    public AlojamientoExtra(String nombre, boolean privado, int metros) {
        this.nombre = nombre;
        this.privado = privado;
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }
    
    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nPrivado: " + privado + "\nEspacio: " + metros + " m2";
    }
}
