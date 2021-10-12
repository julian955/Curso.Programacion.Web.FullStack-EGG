
package Extra01;


public final class Yate extends BarcoMotor {
    private int camarotes;
    
    public Yate(){
        
    }

    public Yate(int camarotes, int potencia, String matricula, int eslora, int fabricacion) {
        super(potencia, matricula, eslora, fabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
      public int calcularAlquiler(int dias){
        int modulo = (eslora * 10)+potencia+camarotes;
        int total = modulo * dias;
        return total;
    }
      
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nEslora(m): "+eslora+"\nAño de fabricacion: "+fabricacion+"\nPotencia(cv): "+potencia+"\nCamarotes: "+camarotes;
    }  
}
