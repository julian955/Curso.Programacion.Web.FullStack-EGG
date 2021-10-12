
import java.util.Scanner;


public class Extra22 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       String[][] matriz;
       matriz = new String[20][20];
       
      
       
       int i,j,aux,aux1,aux2,control=0,cont = 0;
        String var;
        
         for(i = 0 ; i <= 19; i++){
           for(j = 0; j <= 19; j++){
               matriz[i][j] = "&";
           }
           
       }
       
       while(cont <= 4){
       
           System.out.println("Dame una frase:");
           var = leer.nextLine();
           while(var.length()<3 || var.length()>5){
               System.out.println("Palabra incorrecta,ingrese otra:");
               var = leer.nextLine();
           }
           
           aux = (int)(Math.random()*10);
           while(aux == control){
           aux = (int)(Math.random()*10);
           }
           control = aux;
           aux1 = (int)(Math.random()*10);
           
           while(aux1>16){
               aux1 = (int)(Math.random()*100);
           }
           
           for(i = 0; i <= var.length()-1; i ++){
               matriz[aux][aux1] = var.substring(i,i+1);
               aux1++;
           }
           cont++;
           
       }
       
      
        for(i = 0 ; i <= 19; i++){
           for(j = 0; j <= 19; j++){
               aux2 = (int)(Math.random()*10);
               if(matriz[i][j].equals("&")){
                   matriz[i][j] = String.valueOf(aux2);
               }
           }
           
       }
       
      
       
      
       
       for(i = 0 ; i <= 19; i++){
           for(j = 0; j <= 19; j++){
               System.out.print("["+matriz[i][j]+"]");
           }
           System.out.println("");
       }
        
    }
    
}
