package Ejercicio02;

import javax.swing.JOptionPane;

public final class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, Double precio, String color, char consumoE, Integer peso) {
        super(precio, color, consumoE, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        carga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso maximo de carga"));

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio += 500d;
        }

    }

    public void mostrarDatos() {
        System.out.println("Lavadora: \nColor: " + color + "\nConsumo: " + consumoE + "\nPeso: " + peso + "\nCarga max(kg): " + carga + "\nPrecio: " + precio + " $");
        //JOptionPane.showMessageDialog(null, "Lavadora: \nColor: " + color + "\nConsumo: " + consumoE + "\nPeso: " + peso + "\nCarga max(kg): " + carga + "\nPrecio: " + precio + " $");

    }
}
