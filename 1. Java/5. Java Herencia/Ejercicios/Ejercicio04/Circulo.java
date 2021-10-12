
package Ejercicio04;


public final class Circulo implements calculosFormas {
   private double radio;
   private double diametro;
   
  public Circulo(){}

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
  
  

    @Override
    public void calcularArea() {
       double area = pi*Math.pow(radio, 2);
        System.out.println("El area del circulo es de: "+area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = pi * diametro;
        System.out.println("El perimetro del circulo es de: "+perimetro);
    }
}
