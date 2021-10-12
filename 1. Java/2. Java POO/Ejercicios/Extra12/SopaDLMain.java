
package Extra12;

import javax.swing.JOptionPane;


public class SopaDLMain {

    
    public static void main(String[] args) {
        SopaDL sopa = new SopaDL();
        
         String menul = "1. Llenar sopa\n2. Imprimir sopa\n"
                  + "3. Buscar una palabra\n4. Reemplazar una palabra\n"
                  + "5. Invertir sopa\n6. Salir";
         
         int menu = 0;
         
         while(menu != 6){
             menu = Integer.parseInt(JOptionPane.showInputDialog(menul));
             
             switch(menu){
                 case 1:
                    sopa.llenarSopa();
                    break;
                 case 2:
                   sopa.imprimirSopa();
                   break;
                 case 3:
                     sopa.buscarPalabra();
                     break;
                 case 4:
                     sopa.reemplazarPalabra();
                     break;
                 case 5:
                     sopa.invertirSopa();
                     break;
                 case 6:
                     System.out.println("Gracias!");
                     break;
                 default:
                     System.out.println("Opcion incorrecta,seleccione otra:");
                     break;
             }
         }
        
        
        
    }
    
}
