
package Ejercicio03;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AlumnoService {
    
    public Alumno crearAlumno(){
        
        List<Integer> notas = new ArrayList();
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno");
        for (int i = 0; i < 3; i++) {
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota "+(i+1)));
            notas.add(nota);
        }
        return new Alumno(nombre, notas);
    }
    
    public void agregarAlumno(List<Alumno> alumnos){
        //List<Alumno> alumnos = new ArrayList();
        Alumno a = crearAlumno(); 
        alumnos.add(a);
    }
    
    public void notaFinal(List<Alumno> alumnos){
        int nota = 0,aux = 0;
        double promedio = 0;
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno que desea calcular su nota");
        for (int i = 0; i < alumnos.size(); i++) {
           if( alumnos.get(i).getNombre().equals(nombre)){
               for (int j = 0; j < alumnos.get(i).getNotas().size(); j++) {
                   
                   nota = nota + alumnos.get(i).getNotas().get(j);
                   
               }
                promedio = nota / alumnos.get(i).getNotas().size();
              aux = 1;
           }
        }
        
        if(aux == 1){
            JOptionPane.showMessageDialog(null, "El promedio del alumno es de: "+ promedio);
        }else{
           JOptionPane.showMessageDialog(null, "El alumno no esta en la lista"); 
        }
        
    }
    
    public void mostrarAlumnos(List<Alumno> alumnos){
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre());
        }
    }
}
