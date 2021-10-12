
package Extra01;


public final class Velero extends Barco {
    private int mastil;
    
    public Velero(){
        
    }

    public Velero(int mastil, String matricula, int eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
        this.mastil = mastil;
    }

    public int getMastil() {
        return mastil;
    }

    public void setMastil(int mastil) {
        this.mastil = mastil;
    }
    
    @Override
     public int calcularAlquiler(int dias){
        int modulo = (eslora * 10)+mastil;
        int total = modulo * dias;
        return total;
    }
     
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nEslora(m): "+eslora+"\nAño de fabricacion: "+fabricacion+"\nMastiles: "+mastil;
    } 
}
