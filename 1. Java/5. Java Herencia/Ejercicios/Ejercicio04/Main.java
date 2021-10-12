package Ejercicio04;

public class Main {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(50, 100);
        Rectangulo r1 = new Rectangulo(6, 5);

        c1.calcularArea();
        c1.calcularPerimetro();
        r1.calcularArea();
        r1.calcularPerimetro();
    }

}
