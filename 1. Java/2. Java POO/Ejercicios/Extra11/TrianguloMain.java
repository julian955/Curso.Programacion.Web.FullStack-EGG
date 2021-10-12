
package Extra11;


public class TrianguloMain {


    public static void main(String[] args) {
       TrianguloEntidad te = new TrianguloEntidad();
       Triangulo t[] = new Triangulo[4];
       
       for(int i = 0; i < t.length;i++){
           t[i] = te.crearTriangulo();
           System.out.println("El perimetro del triangulo "+(i+1)+" es: "+te.calcularPerimetro(t[i]));
           System.out.println("El area del triangulo "+(i+1)+"es: "+te.calcularArea(t[i]));
       }
       te.mostrarDatos(t);
       te.mostrarDatosMayor(t);
    }
    
}
