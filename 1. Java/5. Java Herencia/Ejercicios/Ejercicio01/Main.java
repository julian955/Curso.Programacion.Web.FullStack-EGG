package Ejercicio01;

public class Main {

    public static void main(String[] args) {
        Animal perro = new Perro("Ciro", "Carne", 3, "Ovejero");
        Perro perro1 = new Perro("Nicky", "Alimento", 5, "Caniche");
        Gato gato = new Gato("Jaimito", "Alimento", 4, "Siames");
        Caballo caballo = new Caballo("Spirit", "Pasto", 6, "Fino");

        perro.Alimentarse();
        perro1.Alimentarse();
        gato.Alimentarse();
        caballo.Alimentarse();
    }

}
