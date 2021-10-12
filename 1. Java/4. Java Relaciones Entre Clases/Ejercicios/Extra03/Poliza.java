package Extra03;

import java.util.List;
import javax.swing.JOptionPane;

public class Poliza {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private long numPoliza;
    private String fechaInicio;
    private String fechaFin;
    private int cuotas;
    private long montoTA;
    private boolean granizo;
    private int montoGranizo;
    private String tipoCovertura;
    private List<GestionCuotas> gCuotas;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, long numPoliza, String fechaInicio, String fechaFin, int cuotas, long montoTA, boolean granizo, int montoGranizo, String tipoCovertura, List<GestionCuotas> gCuotas) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.montoTA = montoTA;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCovertura = tipoCovertura;
        this.gCuotas = gCuotas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public long getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(long numPoliza) {
        this.numPoliza = numPoliza;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public long getMontoTA() {
        return montoTA;
    }

    public void setMontoTA(long montoTA) {
        this.montoTA = montoTA;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(int montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCovertura() {
        return tipoCovertura;
    }

    public void setTipoCovertura(String tipoCovertura) {
        this.tipoCovertura = tipoCovertura;
    }

    public List<GestionCuotas> getgCuotas() {
        return gCuotas;
    }

    public void setgCuotas(List<GestionCuotas> gCuotas) {
        this.gCuotas = gCuotas;
    }

    public void mostrarCuotas() {
        for (GestionCuotas aux : gCuotas) {
            JOptionPane.showMessageDialog(null, "     Cuota: " + aux.getNumCuota() + " De 6\n" + aux.mostrarCuota());
        }
    }

    public void mostrarPoliza() {
        String aux = "";
        if (granizo) {
            aux = "SI";
        } else {
            aux = "NO";
        }
        JOptionPane.showMessageDialog(null, "Datos del cliente: \n" + cliente.mostrarCliente());
        JOptionPane.showMessageDialog(null, "Datos del vehiculo: \n" + vehiculo.mostrarVehiculo());
        JOptionPane.showMessageDialog(null, "Numero de poliza: " + numPoliza + "\nFecha Inscripcion: " + fechaInicio + "  Fecha Vencimiento: "
                + fechaFin + "\nCuotas: " + cuotas + "\nMonto total asegurado: " + montoTA + "\nCobertura contra granizo: " + aux + "\nMonto granizo: " + montoGranizo + "\nTipo de cobertura: " + tipoCovertura);

    }

}
