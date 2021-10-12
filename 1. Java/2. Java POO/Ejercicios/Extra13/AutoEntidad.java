package Extra13;

import java.util.Date;
import javax.swing.JOptionPane;

public class AutoEntidad {

    public Auto crearAuto() {
        Date fecha = new Date();
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        String modelo = JOptionPane.showInputDialog("Ingrese la marca y el modelo del vehiculo: ");
        String color = JOptionPane.showInputDialog("Ingrese el color del vehiculo:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del vehiculo:"));
        int km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el km del vehiculo:"));

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de vencimiento de su carnet:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de vencimiento de su carnet:"));
        int anoc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de vencimiento de su carnet:"));
        
        fecha.setDate(dia);
        fecha.setMonth(mes);
        fecha.setYear(anoc);
        
        return new Auto(nombre, fecha, color, modelo, ano, km);

    }
    
    public void modificarTitular(Auto a){
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del nuevo titular:");
        a.setNombre(titular);
        JOptionPane.showMessageDialog(null, "El titular se modifico correctamente.");
    }
    
    public void modificarKM(Auto a){
        int kmr = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los km recorridos:"));
        int total = kmr + a.getKm();
        a.setKm(total);
        JOptionPane.showMessageDialog(null, "Los km se agregaron correctamente.");
    }
    
    public void verificarService(Auto a){
        if(a.getKm() > 10000){
             JOptionPane.showMessageDialog(null, "Atencion el vehiculo necesita un service.");
        }else{
             JOptionPane.showMessageDialog(null, "El vehiculo no necesita un service.");
        }
    }
    
    public void mostrarDatos(Auto a){
    
        String datos = "Titular: "+a.getNombre()+"\n"
                      +"Vehiculo: "+a.getModelo()+"\n"
                      +"Color: "+a.getColor()+"\n"
                      +"Año: "+a.getAno()+"\n"
                      +"KM: "+a.getKm()+"\n"
                      +"Vencimiento del carnet: "+a.mostrarFecha()+"\n";
        
        JOptionPane.showMessageDialog(null,datos);
    }
}
