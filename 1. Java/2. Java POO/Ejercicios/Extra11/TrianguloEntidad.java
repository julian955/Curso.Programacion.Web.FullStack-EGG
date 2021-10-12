
package Extra11;

import javax.swing.JOptionPane;


public class TrianguloEntidad {
    
    public Triangulo crearTriangulo(){
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del triangulo."));
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo."));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo."));
        
        return new Triangulo(lado, base, altura);
    }
    
    public double calcularPerimetro(Triangulo t){
        double perimetro = 2*t.getLado()+t.getBase();
        return perimetro;
    }
    
    public double calcularArea(Triangulo t){
        double area = (t.getBase()*t.getAltura())/2;
        return area;
    }
    
    public void mostrarDatosMayor(Triangulo[] t){
        int aux = 0;
        double aux1 = 0,aux2 = 0;
        for(int i = 0; i<t.length; i++){
           aux1 = calcularArea(t[i]);
           if(aux1> aux2){
               aux2 = aux1;
               aux = i;
           }
        }
        System.out.println("El triangulo con mayor area es el numero: "+ (aux+1));
        System.out.println(t[aux].toString());
    
    }
    
    public void mostrarDatos(Triangulo[] t){
    
        for(int i = 0; i < t.length; i++){
            System.out.println("Triangulo "+(i+1));
            System.out.println(t[i].toString());
        }
    }
    
}
