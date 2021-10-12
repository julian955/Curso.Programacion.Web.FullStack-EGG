
package Extra04;

public class Empleado extends Persona {
    protected int incorporacion;
    protected int despacho;

    public Empleado(int incorporacion, int despacho, String nombre, String apellido, int dni, EstadoCivil ECivil) {
        super(nombre, apellido, dni, ECivil);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
    }

    public int getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(int incorporacion) {
        this.incorporacion = incorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }
    
    
}
