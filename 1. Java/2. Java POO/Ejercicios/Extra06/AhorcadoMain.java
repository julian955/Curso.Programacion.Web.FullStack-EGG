
package Extra06;

import java.util.Scanner;


public class AhorcadoMain {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ahorcado juego1 = new Ahorcado();
        
        juego1.crearJuego();
        int intentos = juego1.getJugadasmaximas(),letrase = 0;
        String letra;
        
        while(intentos > 0 && letrase < juego1.getPalabra().length){
            System.out.println("Dame una letra: ");
             letra = leer.next();
             juego1.buscar(letra);
             System.out.println(juego1.letraEncontrada(letra));
             if(juego1.letraEncontrada(letra) == true){
                 letrase++;
             }else{
                 intentos--;
             }
             
             System.out.println("Letras encontradas: "+letrase+" de "+ juego1.longitud());
             System.out.println("Intentos restantes: "+intentos);
        }
        
        if(letrase >= juego1.getPalabra().length){
            System.out.println("Felicitaciones ganaste!!");
        }else{
            System.out.println("Perdiste, Suerte para la proxima.");
        }
    }
    
    
    
}
