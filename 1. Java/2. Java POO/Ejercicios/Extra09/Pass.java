package Extra09;

import java.util.Scanner;

public class Pass {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private String pass;
    private int dni;

    public Pass() {
    }

    public Pass(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Pass(String nombre, String pass, int dni) {
        this.nombre = nombre;
        this.pass = pass;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void crearPass() {
        System.out.println("Ingrese su contraseña: ");
        String contra = leer.next();

        while (contra.length() < 10) {
            System.out.println("La contraseña ingresada tiene menos de 10 caracteres, por favor ingrese otra: ");
            contra = leer.next();
        }

        setPass(contra);
        System.out.println("La contraseña se ingreso correctamente  ");
    }

    public void analizarPass() {
        int a = 0, z = 0, i;
        String aux;

        for (i = 0; i < pass.length(); i++) {
            aux = pass.substring(i, (i + 1));
            if (aux.equals("a") && aux.equals("z")) {
                a++;
                z++;
            } else if (aux.equals("a")) {
                a++;
            } else if (aux.equals("z")) {
                z++;
            }
        }
        if (z >= 1 && a >= 2) {
            System.out.println("Su password es ALTA");
        } else if (z >= 1) {
            System.out.println("Su password es MEDIA");
        } else {
            System.out.println("Su password es BAJA");
        }

    }
}
