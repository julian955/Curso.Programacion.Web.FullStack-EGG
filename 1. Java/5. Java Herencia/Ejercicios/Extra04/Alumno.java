package Extra04;

public class Alumno extends Persona {

    private String curso;

    public Alumno(String curso, String nombre, String apellido, int dni, EstadoCivil ECivil) {
        super(nombre, apellido, dni, ECivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni + "\nEstado civil: " + ECivil + "\nCurso: " + curso;
    }
}
