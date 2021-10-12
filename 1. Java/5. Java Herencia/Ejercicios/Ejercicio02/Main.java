package Ejercicio02;

public class Main {

    public static void main(String[] args) {
        Lavadora l1 = new Lavadora();
        Lavadora l2 = new Lavadora();
        Lavadora l3 = new Lavadora();
        Lavadora l4 = new Lavadora();
        Televisor t1 = new Televisor();
        Televisor t2 = new Televisor();
        Televisor t3 = new Televisor();
        Televisor t4 = new Televisor();

        l1.crearLavadora();
        l1.precioFinal();
//
//        l2.crearLavadora();
//        l2.precioFinal();
//
//        l3.crearLavadora();
//        l3.precioFinal();
//
//        l4.crearLavadora();
//        l4.precioFinal();

        t1.crearTelevisor();
        t1.precioFinal();

//        t1.crearTelevisor();
//        t1.precioFinal();
//
//        t1.crearTelevisor();
//        t1.precioFinal();
//
//        t1.crearTelevisor();
//        t1.precioFinal();
        
        l1.mostrarDatos();
//        l2.mostrarDatos();
//        l3.mostrarDatos();
//        l4.mostrarDatos();
//        t1.mostrarDatos();
//        t2.mostrarDatos();
//        t3.mostrarDatos();
        t1.mostrarDatos();
    }

}
