package Ejercicio02;

import javax.swing.JOptionPane;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoE;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoE, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (consumoE != 'A' && consumoE != 'B' && consumoE != 'C' && consumoE != 'D' && consumoE != 'E' && consumoE != 'F') {
            consumoE = 'F';
        }
    }

    public void comprobarColor(String color) {
        if (!(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris"))) {
            this.color = "Blanco";
        }
    }

    public void crearElectrodomestico() {
        precio = 1000d;
        color = JOptionPane.showInputDialog("Ingrese el color");
        String x = JOptionPane.showInputDialog("Ingrese el consumo");
        consumoE = x.charAt(0);
        peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso"));
        comprobarConsumoEnergetico(consumoE);
        comprobarColor(color);
    }

    public void precioFinal() {
        switch (consumoE) {
            case ('A'):
                precio += 1000d;
                break;
            case ('B'):
                precio += 800d;
                break;
            case ('C'):
                precio += 600d;
                break;
            case ('D'):
                precio += 500d;
                break;
            case ('E'):
                precio += 300d;
                break;
            case ('F'):
                precio += 100d;
                break;
        }

        if (peso < 19) {
            precio += 100d;
        } else if (peso < 49) {
            precio += 500d;
        } else if (peso < 79) {
            precio += 800d;
        } else {
            precio += 1000d;
        }
    }
}
