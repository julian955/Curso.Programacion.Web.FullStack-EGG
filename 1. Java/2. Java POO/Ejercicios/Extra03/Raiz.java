
package Extra03;


public class Raiz {
    private int a;
    private int b;
    private int c;
    
    public Raiz(){}
    public Raiz(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }
    
    public int getB(){
        return b;
    }
    public void setB(int b){
        this.b = b;
    }
    
    public int getC(){
        return c;
    }
    public void setC(int c){
        this.c = c;
    }
    
    public int getDiscriminante(){
        int d = (int)(Math.pow(b, 2))-4 *a*c;
        return d;
    }
    
    public boolean tieneRaices(int d){
        boolean f;
        if(d > 0){
            f = true;
        }else{
            f = false;
        }  
        return f;
    }
    
    public boolean tieneRaiz(int d){
        boolean f;
          if(d == 0){
            f = true;
        }else{
            f = false;
        }  
        return f;
        
    }
    
    public void obtenerRaices(boolean f, int d){
        if(f == true){
            System.out.println("solucion 1: x = "+(-1)*b+" + "+Math.sqrt(d) +" / "+2*a);
            System.out.println("solucion 2: x = "+(-1)*b+" - "+Math.sqrt(d) +" / "+2*a);
        }
    }
    public void obtenerRaiz(boolean f,int d){
        if(f == true){
            System.out.println("solucion: x = "+(-1)*b+" + "+Math.sqrt(d) +" / "+2*a);
        }
    }
    
    public void calcular(boolean f, boolean f1, int d){
        int s,e;
         s = ((-1)*b);
         e = (int) Math.sqrt(d);
        if(f == true){
            System.out.println("solucion 1: x = "+ (s+e)/(2*a));
           
            System.out.println("solucion 2: x = "+(s-e) /(2*a));
                       
        }else if(f1 == true){
            System.out.println("Solo tiene una solucion.");
            System.out.println("solucion : x = "+ (s+e)/(2*a));
        }else{
            System.out.println("No tiene solucion.");
        }
    }
            
}
