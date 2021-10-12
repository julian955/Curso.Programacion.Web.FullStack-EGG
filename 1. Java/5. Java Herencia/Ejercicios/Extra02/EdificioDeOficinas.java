
package Extra02;

public class EdificioDeOficinas extends Edificio {
    private int numOf;
    private int ppOf;
    private int pisos;

    public EdificioDeOficinas(int numOf, int ppOf, int pisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numOf = numOf;
        this.ppOf = ppOf;
        this.pisos = pisos;
    }

    public int getNumOf() {
        return numOf;
    }

    public void setNumOf(int numOf) {
        this.numOf = numOf;
    }

    public int getPpOf() {
        return ppOf;
    }

    public void setPpOf(int ppOf) {
        this.ppOf = ppOf;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    @Override
    public void cantPersonas(){
        int totalPersonas = numOf * ppOf;
        int totalPiso = ppOf *2;
        System.out.println("El total de personas que estan en el efidicio es de: "+totalPersonas);
        System.out.println("El total de personas por piso es de: "+ totalPiso);
    }

    @Override
    public void calcularSuperficie() {
         double sup = largo*ancho;
         System.out.println("La superficie del edificio es de: "+sup+ " m2");
    }

    @Override
    public void calcularVolumen() {
       int vol = largo*ancho*alto;
       System.out.println("El volumen del edificio es de: "+vol+ " m2");
    }
}
