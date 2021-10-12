package Extra04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;

public class Simulador {

    List<Alumno> alumnos;
    List<Voto> votos;
    List<String> nombres;
    List<String> apellidos;
    List<String> dni;
    List<Alumno> facilitadores;
    List<Alumno> facilitadorese;

    public Simulador() {
        nombres = new ArrayList();
        apellidos = new ArrayList();
        dni = new ArrayList();
        alumnos = new ArrayList();
        votos = new ArrayList();
        facilitadores = new ArrayList();
        facilitadorese = new ArrayList();

    }

    public void llenarNombres() {
        nombres.add("Carla");
        nombres.add("Sandra");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Camila");
        nombres.add("Juan");
        nombres.add("Soledad");
        nombres.add("Mauricio");
        nombres.add("Laura");
        nombres.add("Facundo");
    }

    public void llenarApellidos() {
        apellidos.add("Salas");
        apellidos.add("Perez");
        apellidos.add("Mora");
        apellidos.add("Paez");
        apellidos.add("Montaner");
        apellidos.add("Mendoza");
        apellidos.add("Moyano");
        apellidos.add("Sanchez");
        apellidos.add("Gonzalez");
        apellidos.add("Molina");
    }

    public String llenarDni() {
        int num = 0, num1 = 0, num2 = 0;
        String dni1 = "";
        String dni = "";
        while (dni1.length() != 10) {
            num2 = (int) (Math.random() * 100);

            if (num2 < 44 && num2 > 16) {
                num = (int) (Math.random() * 1000);
                num1 = (int) (Math.random() * 1000);
                dni1 = num2 + "." + num + "." + num1;
                if (dni1.length() == 10) {
                    dni = dni1;
                }
            }
        }
        return dni;
    }

    public void crearAlumnos() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos desea crear?"));
        int num1 = 0, num2 = 0, num3 = 0;
        llenarNombres();
        llenarApellidos();
        llenarDni();

        for (int i = 0; i < num; i++) {
            num1 = (int) (Math.random() * 10);
            num2 = (int) (Math.random() * 10);

            String nombre = nombres.get(num1);
            String apellido = apellidos.get(num2);
            String dni1 = llenarDni();

            alumnos.add(new Alumno(nombre, apellido, dni1, 0));
        }
    }

    public void mostrarAlumnos() {
        String al = "";
        for (Alumno aux : alumnos) {
           al += aux.mostrarAlumno()+"\n";
        }
        JOptionPane.showMessageDialog(null, al);
    }

    public void votacion() {
        for (Alumno aux : alumnos) {
            HashSet<Alumno> votar = new HashSet();
            while (votar.size() != 3) {
                int num = (int) (Math.random() * 10);
                if (alumnos.get(num) != aux) {
                    votar.add(alumnos.get(num));
                    alumnos.get(num).setVotos(alumnos.get(num).getVotos()+1);
                }

            }
            votos.add(new Voto(aux, votar));
        }
        JOptionPane.showMessageDialog(null, "La votacion se realizo satifactoriamente.");
    }

    public void mostrarVotos() {
        for (Voto aux : votos) {
            JOptionPane.showMessageDialog(null, aux.mostrarVotos());
        }
    }

    public void recuentoVotos() {
         String al = "";
        for (Alumno aux : alumnos) {
           al += aux.recuentoVotos()+"\n";
        }
        JOptionPane.showMessageDialog(null, al);
    }

    public void facilitadores() {
        List<Alumno> alumnosx = new ArrayList<Alumno>(alumnos);
        int num = 0;

        for (int i = 0; i < 5; i++) {
            Alumno x = alumnosx.get(0);
            System.out.println(x.getNombre()+x.getApellido());
            for (Alumno aux : alumnosx) {
                if (aux.getVotos() > x.getVotos()) {
                    x = aux;
                    
                }
            }
            facilitadores.add(x);
            alumnosx.remove(x);
            
        }

        for (int i = 0; i < 5; i++) {
            Alumno x = alumnosx.get(0);
            for (Alumno aux : alumnosx) {
                if (aux.getVotos() > x.getVotos()) {
                    x = aux;
                }
            }
            facilitadorese.add(x);
            alumnosx.remove(x);
        }

    }
    
    public void agregarFacilitadores(){
        int aux = 0;
        Collections.sort(alumnos,Comparadores.ordPorVotos );
        for (Alumno alumno : alumnos) {
            if(aux < 5){
                facilitadores.add(alumno);
            }else if( aux <10){
                facilitadorese.add(alumno);
            }
            aux++;
        }
    }

    public void mostrarFacilitadores() {
        String aux = "Facilitadores: \n";
        int num = 0;
        for (Alumno x : facilitadores) {
            num++;
            aux += num + ". == " + x.getNombre() + "  " + x.getApellido() + "\n";
        }        

        String aux1 = "Faculitadores Suplentes: \n";
        int num1 = 0;
        for (Alumno x : facilitadorese) {
            num1++;
            aux1 += num1 + ". == " + x.getNombre() + "  " + x.getApellido() + "\n";
        }       
        JOptionPane.showMessageDialog(null, aux);
        JOptionPane.showMessageDialog(null, aux1);

    }
    
    

}
