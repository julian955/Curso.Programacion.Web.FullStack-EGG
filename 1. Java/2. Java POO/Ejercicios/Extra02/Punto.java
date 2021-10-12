
package Extra02;

import java.util.Scanner;


public class Punto {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    
    public Punto(){}
    public Punto(int x1,int x2,int y1,int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public int getX1(){
        return x1;
    }
    public void setX1(int x1){
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Punto 1");
        System.out.println("Ingrese el valor de x: ");
        x1 = leer.nextInt();
        System.out.println("Ingrese el valor de y: ");
        y1 = leer.nextInt();
        System.out.println("Punto 2");
        System.out.println("Ingrese el valor de x: ");
        x2 = leer.nextInt();
        System.out.println("Ingrese el valor y: ");
        y2 = leer.nextInt();
    }
    
    public double calcularDistancia(){
        double distancia;
        double x,y;
        x = x2 - x1;
        y = y2 - y1;
        
        x = Math.pow(x, 2);
        y = Math.pow(y, 2);
        double p = x + y;
        distancia = Math.sqrt(p);
        return distancia;
    }
}
