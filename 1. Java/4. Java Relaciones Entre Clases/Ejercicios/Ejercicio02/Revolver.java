
package Ejercicio02;


public class Revolver {
    private int pAct;
    private int pAgua;   
    
    public Revolver(){}
    
    public Revolver(int pAct,int pAgua){
        this.pAct = pAct;
        this.pAgua = pAgua;
    }
    
    public int getPAgua(){
        return pAgua;
    }
    public void setPAgua(int pAgua){
        this.pAgua = pAgua;
    }
    
    public int getPAct(){
        return pAct;
    }
    public void setPAct(int pAct){
        this.pAct = pAct;
    }
    
    public void llenarRevolver(){
        pAct = (int) (Math.random()*10);
        pAgua = (int) (Math.random()*10);
    }
    
    public boolean mojar(){
        if(pAgua == pAct){
            return true;
        }
        return false;
    }
    
    public void siguienteChorro(){
        if(pAct == 10){
            pAct = 0;
        }else{
            pAct++;
        }
    }
    
    public String mostrarDatos(){
        return " Posicion Actual: "+pAct+" Posicion Agua : "+pAgua;
    }
}
