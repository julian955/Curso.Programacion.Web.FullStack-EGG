
package Extra04;

import java.util.Objects;


public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private int votos;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String dni, int votos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.votos = votos;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + Objects.hashCode(this.apellido);
        hash = 11 * hash + Objects.hashCode(this.dni);
        hash = 11 * hash + this.votos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return true;
    }
    
    public String mostrarAlumno(){
        return "Nombre: "+nombre+" Apellido: "+apellido+" DNI: "+dni;
    }
    
    public String recuentoVotos(){
        return "Nombre: "+nombre+" Apellido: "+apellido+" Votos: "+votos;
    }
}
