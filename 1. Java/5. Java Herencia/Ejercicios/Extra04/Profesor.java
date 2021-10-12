package Extra04;

public final class Profesor extends Empleado {

    private String materia;

    public Profesor(String materia, int incorporacion, int despacho, String nombre, String apellido, int dni, EstadoCivil ECivil) {
        super(incorporacion, despacho, nombre, apellido, dni, ECivil);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni + "\nEstado civil: " + ECivil + "\nAño de incorporacion: "
                + incorporacion + "\nNumero de despacho: " + despacho + "\nMateria: " + materia;
    }
}
