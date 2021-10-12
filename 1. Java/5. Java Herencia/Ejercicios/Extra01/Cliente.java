
package Extra01;

import java.sql.Time;
import java.time.LocalDate;


public class Cliente {
    private String nombre;
    private long dni;
    private LocalDate fechaIngreso;
    private LocalDate fechaEgreso;
    private int dias;

    public Cliente() {
    }

    public Cliente(String nombre, long dni, LocalDate fechaIngreso, LocalDate fechaEgreso, int dias) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.dias = dias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public String mostrarDatos(){
        return "Nombre: "+nombre+"\nDNI: "+dni+"\nFecha ingreso: "+fechaIngreso+"\nFecha salida: "+fechaEgreso;
    }
    
}
