package Extra04;

import java.util.HashSet;
import java.util.List;

public class Voto {

    private Alumno alumno;
    private HashSet<Alumno> votos;

    public Voto() {
    }

    public Voto(Alumno alumno, HashSet<Alumno> votos) {
        this.alumno = alumno;
        this.votos = votos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getVotos() {
        return votos;
    }

    public void setVotos(HashSet<Alumno> votos) {
        this.votos = votos;
    }

    public String mostrarVotos() {
        String aux = "Alumno: " + alumno.getNombre() + "  " + alumno.getApellido()+"\n";
        int num = 0;
        
        for (Alumno voto : votos) {
            num++;
            aux += "Voto " + num + ": " + voto.getNombre() + "   " + voto.getApellido() + "\n";
        }
        
        return aux;
    }
}
