
package Extra01;


public class Barco {
    protected String matricula;
    protected int eslora;
    protected int fabricacion;
    
    public Barco(){}

    public Barco(String matricula, int eslora, int fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }
    
    public int calcularAlquiler(int dias){
        int modulo = eslora * 10;
        int total = modulo * dias;
        return total;
    }
    
    public String mostrarDatos(){
        return "Matricula: "+matricula+" Eslora(m): "+eslora+" Año de fabricacion: "+fabricacion;
    }
}
