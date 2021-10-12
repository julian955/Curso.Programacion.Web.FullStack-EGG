
package Extra13;

import java.util.Date;


public class Auto {
    private String nombre;
    private Date fechav;
    private String color;
    private String modelo;
    private int ano;
    private int km;

    public Auto() {
    }

    public Auto(String nombre, String color, String modelo, int ano, int km) {
        this.nombre = nombre;
        this.color = color;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
    }

    
    public Auto(String nombre, Date fechav, String color, String modelo, int ano, int km) {
        this.nombre = nombre;
        this.fechav = fechav;
        this.color = color;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Date getFechav() {
        return fechav;
    }

    public void setFechav(Date fechav) {
        this.fechav = fechav;
    }
    public String mostrarFecha(){
        String fecha = fechav.getDate()+"/"+fechav.getMonth()+"/"+fechav.getYear();
        return fecha;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombre=" + nombre + ", fechav=" + fechav + ", color=" + color + ", modelo=" + modelo + ", ano=" + ano + ", km=" + km + '}';
    }
    
    
    
    
}
