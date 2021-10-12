
package Extra01;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Numero {

   
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        int num = 0,contador = 0,suma = 0;
        
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if(num != -99){
            numeros.add(num);
            suma+=num;
            contador++;
            }           
            
        }while(num != -99);
            
       // numeros.remove(-99);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println(suma+","+contador);
        System.out.println("Promedio = "+(suma/contador));
        
    }
    
}
