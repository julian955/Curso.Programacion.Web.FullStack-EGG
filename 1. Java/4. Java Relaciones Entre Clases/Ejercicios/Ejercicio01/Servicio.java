
package Ejercicio01;

import javax.swing.JOptionPane;


public class Servicio {
       
    public Perro crearPerro(){
        TamPerro tam = TamPerro.MEDIANO;
        int aux = 0;
        String nombre = JOptionPane.showInputDialog("Introduce el nombre de tu perro: ");
        String raza = JOptionPane.showInputDialog("Introduce la raza de tu perro: ");        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad de tu perro: "));
        
        while(aux == 0){
            String tama = JOptionPane.showInputDialog("Introduce el tamaño de tu perro: ");
            for (TamPerro aux1 : TamPerro.values()) {                
                if(aux1.toString().equalsIgnoreCase(tama)){
                      tam = aux1;
                     aux = 1;
                     break;
                }
                
            }
            
            if(aux == 0){
                JOptionPane.showMessageDialog(null, "Usted ingreso un tamaño incorrecto, Por favor ingrese uno valido");
            }
        }
        
        return new Perro(nombre, raza, tam, edad);
        
    }
    
    public Persona crearPersona(){
       String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
       String apellido = JOptionPane.showInputDialog("Introduce tu apellido:"); 
       int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
       long dni = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu dni: "));
       Perro perro = crearPerro();
       
       return new Persona(nombre, apellido, edad, dni, perro);
    }
    
    public void mostrarDatos(Persona p){
        
        String datos ="Datos de la persona: \n"+" Nombre : "+ p.getNombre()+"\n Apellido: "+p.getApellido()+
                "\n Edad: "+p.getEdad()+"\n DNI: "+p.getDni()+"\n Datos de tu mascota: \n"+" Nombre: "+
                p.getPerro().getNombre()+"\n Raza: "+p.getPerro().getRaza()+ "\n Tamaño: "+ p.getPerro().getTam()+
                "\n Edad: "+p.getPerro().getEdad();
        
        JOptionPane.showMessageDialog(null, datos);
    }
}
