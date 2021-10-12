
public class Ejercicio18 {

   
    public static void main(String[] args) {
        int i,j,k;
        String a;
        
       for (i = 0 ; i<= 9; i++){
            for (j = 0 ; j<= 9; j++){
                 for (k = 0 ; k<= 9; k++){
                     if(i == 3){
                         //i = Integer.parseInt("E");
                         System.out.println("E"+"-"+j+"-"+k);
                         
                     }else if (j == 3) {
                        // j = Integer.parseInt("E");
                         System.out.println(i+"-"+"E"+"-"+k);
                     }else if(k == 3){
                        // k = Integer.parseInt("E");
                         System.out.println(i+"-"+j+"-"+"E");
                         
                     }else{
                         System.out.println(i+"-"+j+"-"+k);
                     }
                     
                     
                 }
            }
       }
    }
    
}
