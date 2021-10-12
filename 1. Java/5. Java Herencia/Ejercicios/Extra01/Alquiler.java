
package Extra01;

public class Alquiler {
    private Cliente cliente;
    private Barco barco;
    private int total;
    
    public Alquiler(){}

    public Alquiler(Cliente cliente, Barco barco, int total) {
        this.cliente = cliente;
        this.barco = barco;
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public String mostrarDatos(){
        return "Datos cliente: \n"+cliente.mostrarDatos()+"\nBarco: \n"+barco.mostrarDatos()+"\nTotal alquiler: "+total+" $";
    }
    
}
