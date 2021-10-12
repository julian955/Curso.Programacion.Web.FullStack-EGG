
package Extra07;

public class Fraccion {
    private int denominador;
    private int numerador;
    
    public Fraccion(){}
    public Fraccion(int denominador,int numerador){
        this.denominador = denominador;
        this.numerador = numerador;
    }
    
    public int getDenominador(){
        return denominador;
    }
    public void setDenominador(int denominador){
        this.denominador = denominador;
    }
    
    public int getNumerador(){
        return numerador;
    }
    public void setNumerador(int numerador){
        this.numerador = numerador;
    }
}
