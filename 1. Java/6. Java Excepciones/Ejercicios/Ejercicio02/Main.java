package Ejercicio02;

public class Main {

    public static void main(String[] args) {
        String[] s = new String[2];

        try {
            System.out.println(s[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error fuera de rango.\n"+e);
        }

    }

}
