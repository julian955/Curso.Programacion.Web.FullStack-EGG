
package Extra02;

public class Polideportivo extends Edificio {
    private String nombre;
    private boolean tipo;

    public Polideportivo(String nombre, boolean tipo, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

   
    @Override
    public void techo(){
        if(tipo){
            System.out.println("El polideportivo "+nombre+"  es techado");
        }else{
            System.out.println("El polideportivo  "+nombre+" es abierto");
        }
    }

    @Override
    public void calcularSuperficie() {
        double sup = largo*ancho;
        System.out.println("La superficie del polideportivo "+nombre+" es de: "+sup+ " m2");
    }

    @Override
    public void calcularVolumen() {
        int vol = largo*ancho*alto;
        System.out.println("El volumen del polideportivo "+nombre+" es de: "+vol+ " m2");
    }
}
