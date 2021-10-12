
package Extra03;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String tipo;
    private String color;
    private long numMotor;
    private String chasis;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int ano, String tipo, String color, long numMotor, String chasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
        this.color = color;
        this.numMotor = numMotor;
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(long numMotor) {
        this.numMotor = numMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
    
    public String mostrarVehiculo(){
        return "Marca: "+marca+" Modelo: "+modelo+"\nAño: "+ano+" Tipo: "+tipo+"\nColor: "+color+"Numero Motor: "+numMotor+"\n Chasis: "+chasis;

    }
    
}
