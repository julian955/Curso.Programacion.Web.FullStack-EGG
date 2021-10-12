
package Ejercicio07;

import java.util.Scanner;


public class PersonaMain {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        PersonaService ps = new PersonaService();
        
        System.out.println("Cuantas personas desea registrar?");
        int num = leer.nextInt();
        
        Persona p[] = new Persona[num];
        
        int i ,desnutrido = 0,pesoi = 0,sobrepeso = 0,mayor = 0,menor = 0;
        boolean edad;
        
        for(i = 0 ; i < num; i++){
            System.out.println("Ingrese los datos de la persona "+ (i+1));
            p[i] = ps.crearPersona();
        }
        
        for(i = 0; i < num; i++){
            if(ps.calcularIMC(p[i].getPeso(), p[i].getAltura()) == -1){
                //System.out.println("La persona "+ (i+1)+" esta por debajo del peso ideal.");
                desnutrido++;
            }else if (ps.calcularIMC(p[i].getPeso(), p[i].getAltura()) == 0){
               // System.out.println("La persona "+ (i+1)+" esta en su peso ideal.");
                pesoi++;
            }else{
               //System.out.println("La persona "+ (i+1)+" tiene sobrepeso.");
                sobrepeso++;
            }
            
            edad = ps.mayorEdad(p[i].getEdad());
            if(edad == true){
                //System.out.println("La persona "+ (i+1)+" es mayor de edad.");
                mayor++;
            }else{
               //System.out.println("La persona "+ (i+1)+" es menor de edad.");
                menor++; 
            }
        }
        
        int pd = (desnutrido * 100)/num;
        int ppi = (pesoi * 100)/num;
        int psp = (sobrepeso * 100)/num;
        int pmayor = (mayor * 100)/num;
        int pmenor = (menor * 100)/num;
        
        System.out.println("hay un "+pd+" % de personas con peso menor al ideal.");
        System.out.println("hay un "+ppi+" % de personas con peso ideal.");
        System.out.println("hay un "+psp+" % de personas con sobrepeso .");
        System.out.println("hay un "+pmayor+" % de personas mayores de edad .");
        System.out.println("hay un "+pmenor+" % de personas menores de edad .");
    }
    
}
