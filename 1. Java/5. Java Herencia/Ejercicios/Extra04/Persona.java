
package Extra04;


public class Persona {
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected EstadoCivil ECivil;

    public Persona(String nombre, String apellido, int dni, EstadoCivil ECivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ECivil = ECivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public EstadoCivil getECivil() {
        return ECivil;
    }

    public void setECivil(EstadoCivil ECivil) {
        this.ECivil = ECivil;
    }
    
    
}
