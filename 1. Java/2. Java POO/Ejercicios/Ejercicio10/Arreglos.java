
package Ejercicio10;

import java.util.Arrays;


public class Arreglos {

   
    public static void main(String[] args) {
        double[] array1,array2;
        array1 = new double[50];
        array2 = new double[20];
        int i;
        double num;
        
        for(i = 0; i < 50;i++){
            num = (int)(Math.random()*10);
            array1[i] = num;
        }
//         for(i = 0; i < 20;i++){
//             num = (int)(Math.random()*10);
//            array2[i] = num;
//         }
         
        Arrays.sort(array1);
       Arrays.fill(array2, 0.5);
        
        array2 = Arrays.copyOf(array1, 20);
        Arrays.fill(array2,10,20, 0.5);
        
        System.out.println("\nARRAY ORDENADO\n");
        for(i = 0; i < 50;i++){
             System.out.print("["+array1[i]+"]");
         }
        System.out.println("");
        for(i = 0; i < 20;i++){
             System.out.print("["+array2[i]+"]");
         }
    }
    
}
