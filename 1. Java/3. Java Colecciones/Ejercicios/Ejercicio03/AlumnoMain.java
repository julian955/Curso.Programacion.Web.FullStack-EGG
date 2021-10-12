
package Ejercicio03;

import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;


public class AlumnoMain {

   
    public static void main(String[] args) {
        int menu = 0;
        AlumnoService as = new AlumnoService();
        List<Alumno> alumnos = new ArrayList();
       
        while (menu != 3) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("1. Para agregar un alumno\n2. Para ver el promedio del alumno\n3. Para salir"));
            switch (menu) {
                case 1:
                    as.agregarAlumno(alumnos);
                    break;
                case 2:
                    as.notaFinal(alumnos);
                  
                    break;
                case 3:
                    as.mostrarAlumnos(alumnos);
                    JOptionPane.showMessageDialog(null, "Gracias");
                    break;
                default:
                  JOptionPane.showMessageDialog(null, "Opcion Invalida, Seleccione otra."); 
                   break; 
            }
        }

    }
    
}
