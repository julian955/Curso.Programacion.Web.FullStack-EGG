package Extra04;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Servicio {

    List<Alumno> alumnos;
    List<Profesor> profesores;
    List<PersonalServicio> personalS;

    public Servicio() {
        alumnos = new ArrayList();
        profesores = new ArrayList();
        personalS = new ArrayList();
    }

    public Alumno crearAlumno() {
        EstadoCivil ec = EstadoCivil.Soltero;
        int aux = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido");
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI"));

        while (aux == 0) {
            String ECivil = JOptionPane.showInputDialog("Ingrese el estado civil");
            for (EstadoCivil aux1 : EstadoCivil.values()) {
                if (aux1.toString().equalsIgnoreCase(ECivil)) {
                    ec = aux1;
                    aux = 1;
                    break;
                }

            }

            if (aux == 0) {
                JOptionPane.showMessageDialog(null, "Usted ingreso un estado civil incorrecto, Por favor ingrese uno valido");
            }
        }
        String curso = JOptionPane.showInputDialog("Ingrese el curso del alumno");

        return new Alumno(curso, nombre, apellido, dni, ec);
    }

    public Profesor crearProfesor() {
        EstadoCivil ec = EstadoCivil.Soltero;
        int aux = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido");
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI"));

        while (aux == 0) {
            String ECivil = JOptionPane.showInputDialog("Ingrese el estado civil");
            for (EstadoCivil aux1 : EstadoCivil.values()) {
                if (aux1.toString().equalsIgnoreCase(ECivil)) {
                    ec = aux1;
                    aux = 1;
                    break;
                }

            }

            if (aux == 0) {
                JOptionPane.showMessageDialog(null, "Usted ingreso un estado civil incorrecto, Por favor ingrese uno valido");
            }

        }
        int despacho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de despacho"));
        int incorporacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de incorporacion"));
        String materia = JOptionPane.showInputDialog("Ingrese la materia asignada");

        return new Profesor(materia, incorporacion, despacho, nombre, apellido, dni, ec);
    }

    public PersonalServicio crearPServicio() {
        EstadoCivil ec = EstadoCivil.Soltero;
        int aux = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido");
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI"));

        while (aux == 0) {
            String ECivil = JOptionPane.showInputDialog("Ingrese el estado civil");
            for (EstadoCivil aux1 : EstadoCivil.values()) {
                if (aux1.toString().equalsIgnoreCase(ECivil)) {
                    ec = aux1;
                    aux = 1;
                    break;
                }

            }

            if (aux == 0) {
                JOptionPane.showMessageDialog(null, "Usted ingreso un estado civil incorrecto, Por favor ingrese uno valido");
            }

        }
        int despacho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de despacho"));
        int incorporacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de incorporacion"));
        String seccion = JOptionPane.showInputDialog("Ingrese la seccion asignada");

        return new PersonalServicio(seccion, incorporacion, despacho, nombre, apellido, dni, ec);
    }

    public void agregarPersona() {
        String x = "1. Para agregar un alumno\n2. Para agregar un profesor\n3. Para agregar un personal de servicio\n4. Para volver";
        int menu = Integer.parseInt(JOptionPane.showInputDialog(x));

        switch (menu) {
            case 1:
                alumnos.add(crearAlumno());
                JOptionPane.showMessageDialog(null, "Se agrego el alumno correctamente.");
                break;
            case 2:
                profesores.add(crearProfesor());
                JOptionPane.showMessageDialog(null, "Se agrego el profesor correctamente.");
                break;
            case 3:
                personalS.add(crearPServicio());
                JOptionPane.showMessageDialog(null, "Se agrego el personal de servicio correctamente.");
                break;
        }
    }

    public void CambioEC() {
        String x = "1. Para cambiar el estado civil de un alumno\n2. Para cambiar el estado civil de un profesor\n3. Para cambiar el estado civil de un personal de servicio\n4. Para volver";
        int menu = Integer.parseInt(JOptionPane.showInputDialog(x));
        EstadoCivil ec;
        int aux = 0, num = 0;
        switch (menu) {
            case 1:
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno: ");
                for (Alumno aux1 : alumnos) {
                    if (aux1.getNombre().equalsIgnoreCase(nombre)) {
                        while (aux == 0) {
                            String ECivil = JOptionPane.showInputDialog("Ingrese el estado civil");
                            for (EstadoCivil aux2 : EstadoCivil.values()) {
                                if (aux2.toString().equalsIgnoreCase(ECivil)) {
                                    aux1.setECivil(aux2);
                                    aux = 1;
                                    num = 1;
                                    JOptionPane.showMessageDialog(null, "Se cambio el estado civil correctamente.");
                                    break;
                                }

                            }

                            if (aux == 0) {
                                JOptionPane.showMessageDialog(null, "Usted ingreso un estado civil incorrecto, Por favor ingrese uno valido");
                            }

                        }
                    }
                }
                if (num == 0) {
                    JOptionPane.showMessageDialog(null, "El alumno ingresado no se encontro en la lista.");
                }
                break;

            case 2:
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
                for (Profesor aux1 : profesores) {
                    if (aux1.getNombre().equalsIgnoreCase(nombre)) {
                        while (aux == 0) {
                            String ECivil = JOptionPane.showInputDialog("Ingrese el estado civil");
                            for (EstadoCivil aux2 : EstadoCivil.values()) {
                                if (aux2.toString().equalsIgnoreCase(ECivil)) {
                                    aux1.setECivil(aux2);
                                    aux = 1;
                                    num = 1;
                                    JOptionPane.showMessageDialog(null, "Se cambio el estado civil correctamente.");
                                    break;
                                }

                            }

                            if (aux == 0) {
                                JOptionPane.showMessageDialog(null, "Usted ingreso un estado civil incorrecto, Por favor ingrese uno valido");
                            }

                        }
                    }
                }
                if (num == 0) {
                    JOptionPane.showMessageDialog(null, "El profesor ingresado no se encontro en la lista.");
                }
                break;

            case 3:
                nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
                for (PersonalServicio aux1 : personalS) {
                    if (aux1.getNombre().equalsIgnoreCase(nombre)) {
                        while (aux == 0) {
                            String ECivil = JOptionPane.showInputDialog("Ingrese el estado civil");
                            for (EstadoCivil aux2 : EstadoCivil.values()) {
                                if (aux2.toString().equalsIgnoreCase(ECivil)) {
                                    aux1.setECivil(aux2);
                                    aux = 1;
                                    num = 1;
                                    JOptionPane.showMessageDialog(null, "Se cambio el estado civil correctamente.");
                                    break;
                                }

                            }

                            if (aux == 0) {
                                JOptionPane.showMessageDialog(null, "Usted ingreso un estado civil incorrecto, Por favor ingrese uno valido");
                            }

                        }
                    }
                }
                if (num == 0) {
                    JOptionPane.showMessageDialog(null, "El nombre ingresado no se encontro en la lista.");
                }
                break;

        }
    }

    public void cambiarDespacho() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("1. Para cambiar el despacho de un profesor\n2. Para cambiar el despacho de un personal de servicio\n3. Para volver atras."));
        int num = 0;
        switch (menu) {
            case 1:
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
                for (Profesor aux : profesores) {
                    if (aux.getNombre().equalsIgnoreCase(nombre)) {
                        int despacho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de despacho."));
                        aux.setDespacho(despacho);
                        JOptionPane.showMessageDialog(null, "Se cambio el numero de despacho correctamente.");
                        num = 1;
                        break;
                    }
                }
                if (num == 0) {
                    JOptionPane.showMessageDialog(null, "No se encontro el profesor ingresado. ");
                }
                break;

            case 2:
                nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
                for (PersonalServicio aux : personalS) {
                    if (aux.getNombre().equalsIgnoreCase(nombre)) {
                        int despacho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de despacho."));
                        aux.setDespacho(despacho);
                        JOptionPane.showMessageDialog(null, "Se cambio el numero de despacho correctamente.");
                        num = 1;
                        break;
                    }
                }
                if (num == 0) {
                    JOptionPane.showMessageDialog(null, "No se encontro el nombre ingresado. ");
                }
                break;

        }
    }

    public void cambiarCurso() {
        int num = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno: ");

        for (Alumno aux : alumnos) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                String curso = JOptionPane.showInputDialog("Ingrese el nuevo curso: ");
                aux.setCurso(curso);
                JOptionPane.showMessageDialog(null, "Se cambio el curso correctamente.");
                num = 1;
                break;
            }
        }
        if (num == 0) {
            JOptionPane.showMessageDialog(null, "No se encontro el alumno ingresado. ");
        }
    }

    public void cambioDepto() {
        int num = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
        for (Profesor aux : profesores) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                String curso = JOptionPane.showInputDialog("Ingrese el nuevo departamento: ");
                aux.setMateria(curso);
                JOptionPane.showMessageDialog(null, "Se cambio el departamento correctamente.");
                num = 1;
                break;
            }
        }

        if (num == 0) {
            JOptionPane.showMessageDialog(null, "No se encontro el profesor ingresado. ");
        }
    }

    public void trasladoSeccion() {
        int num = 0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
        for (PersonalServicio aux : personalS) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                String seccion = JOptionPane.showInputDialog("Ingrese la nueva seccion: ");
                aux.setSeccion(seccion);
                JOptionPane.showMessageDialog(null, "Se cambio la seccion correctamente.");
                num = 1;
                break;
            }
        }

        if (num == 0) {
            JOptionPane.showMessageDialog(null, "No se encontro el empleado ingresado. ");
        }
    }

    public void imprimirTodo() {
        alumnos.forEach((alumno) -> {
            JOptionPane.showMessageDialog(null, "      ALUMNOS:\n" + alumno.mostrarDatos());
        });

        profesores.forEach((aux) -> {
            JOptionPane.showMessageDialog(null, "      PROFESORES:\n" + aux.mostrarDatos());
        });

        personalS.forEach((aux1) -> {
            JOptionPane.showMessageDialog(null, "      PERSONAL SERVICIO:\n" + aux1.mostrarDatos());
        });
    }

    public void imprimirLista() {
        String x = "      ALUMNOS:\n";
        int num = 0;
        for (Alumno alumno : alumnos) {
            num++;
            x += num + " == Nombre: " + alumno.getNombre() + "  Apellido: " + alumno.getApellido() + "  DNI: " + alumno.getDni() + "\n";
        }
        x += " ----------------------\n     PROFESORES:\n";
        for (Profesor aux : profesores) {
            num++;
            x += num + " == Nombre: " + aux.getNombre() + "  Apellido: " + aux.getApellido() + "  DNI: " + aux.getDni() + "\n";
        }

        x += "\n----------------------\n     PERSONAL SERVICIO:\n";
        for (PersonalServicio aux : personalS) {
            num++;
            x += num + " == Nombre: " + aux.getNombre() + "  Apellido: " + aux.getApellido() + "  DNI: " + aux.getDni() + "\n";
        }

        JOptionPane.showMessageDialog(null, x);
    }
}
