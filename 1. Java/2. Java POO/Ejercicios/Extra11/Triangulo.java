
package Extra11;

public class Triangulo {
    private double lado;
    private double base;
    private double altura;
    
    public Triangulo(){}
    public Triangulo(double lado,double base, double altura){
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }
    
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado=" + lado + ", base=" + base + ", altura=" + altura + '}';
    }
            
}


