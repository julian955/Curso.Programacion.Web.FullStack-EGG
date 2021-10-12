
package Extra08;

import java.util.Scanner;


public class TiempoMain {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la hora: ");
        int hora = leer.nextInt();
        System.out.println("Ingrese los minutos: ");
        int minutos = leer.nextInt();
        System.out.println("Ingrese los segundos: ");
        int segundos = leer.nextInt();
        
        Tiempo t1 = new Tiempo(hora, minutos, segundos);
        int i;
        
        for(i = 0;i < 160;i ++){
            if(t1.getSegundos() == 60){
                t1.setSegundos(0);
                t1.setMinutos(t1.getMinutos()+1);
            }else{
                t1.setSegundos(t1.getSegundos()+1);
            }
            t1.imprimirHora();
        }
    }
    
}
