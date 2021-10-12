package Extra03;

public class GestionCuotas {

    private int numCuota;
    private double monto;
    private boolean pago;
    private String vencimiento;
    private String formaPago;

    public GestionCuotas() {
    }

    public GestionCuotas(int numCuota, double monto, boolean pago, String vencimiento, String formaPago) {
        this.numCuota = numCuota;
        this.monto = monto;
        this.pago = pago;
        this.vencimiento = vencimiento;
        this.formaPago = formaPago;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String mostrarCuota() {
        String aux = "";
        if (pago) {
            aux = "PAGADA";
        } else {
            aux = "IMPAGA";
        }

        return "Cuota numero: " + numCuota + "\nMonto: " + monto + "\nEstado: " + aux + "\nVencimiento: " + vencimiento + "\nFormas de pago: " + formaPago;
    }
}
