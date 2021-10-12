
package Extra01;


public class BarcoMotor extends Barco {
    protected int potencia;
    
    public BarcoMotor(){
        
    }

    public BarcoMotor(int potencia, String matricula, int eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    @Override
     public int calcularAlquiler(int dias){
        int modulo = (eslora * 10)+potencia;
        int total = modulo * dias;
        return total;
    }
     
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nEslora(m): "+eslora+"\nAño de fabricacion: "+fabricacion+"\nPotencia(cv): "+potencia;
    } 
}
