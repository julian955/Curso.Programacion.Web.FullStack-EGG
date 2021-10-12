package Ejercicio02;

import javax.swing.JOptionPane;

public final class Televisor extends Electrodomestico {

    private int pulgadas;
    private boolean tdt;

    public Televisor() {

    }

    public Televisor(int pulgadas, boolean tdt, Double precio, String color, char consumoE, Integer peso) {
        super(precio, color, consumoE, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        pulgadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las pulgadas del TV"));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Posee sintonizador TDT? 1. SI / 2. NO"));
        tdt = x == 1;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if (pulgadas > 40) {
            double x = (precio * 0.1) * 3;
            precio += x;
        }

        if (tdt) {
            precio += 500d;
        }
    }

    public void mostrarDatos() {
         System.out.println("Televisor: \nColor: " + color + "\nConsumo: " + consumoE + "\nPulgadas: " + pulgadas + "\nPeso: " + peso + "\nConversor: " + tdt + "\nPrecio: " + precio + " $");
       // JOptionPane.showMessageDialog(null, "Televisor: \nColor: " + color + "\nConsumo: " + consumoE + "\nPulgadas: " + pulgadas + "\nPeso: " + peso + "\nConversor: " + tdt + "\nPrecio: " + precio + " $");

    }
}
