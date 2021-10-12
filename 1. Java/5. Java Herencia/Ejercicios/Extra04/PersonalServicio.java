package Extra04;

public final class PersonalServicio extends Empleado {

    private String seccion;

    public PersonalServicio(String seccion, int incorporacion, int despacho, String nombre, String apellido, int dni, EstadoCivil ECivil) {
        super(incorporacion, despacho, nombre, apellido, dni, ECivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni + "\nEstado civil: " + ECivil + "\nAño de incorporacion: "
                + incorporacion + "\nNumero de despacho: " + despacho + "\nSeccion: " + seccion;
    }
}
