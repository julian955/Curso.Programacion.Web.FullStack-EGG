
package Extra04;

import java.util.Scanner;


public class NIF {
    private int dni;
    private char letra;
    
    public NIF(){}
    
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public char getLetra(){
        return letra;
    }
    public void setLetra(char letra){
        this.letra = letra;
    }
    
    public void crearNif(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce tu numero de DNI: ");
        dni = leer.nextInt();
        
        while(dni > 99999999 || dni < 0){
            System.out.println("DNI incorrecto, ingrese otro.");
            dni = leer.nextInt();
        }
        
        char[] array;
        array = new char[23];       
        
        array[0] ='T';
        array[1] ='R';
        array[2] ='W';
        array[3] ='A';
        array[4] ='G';
        array[5] ='M';
        array[6] ='Y';
        array[7] ='F';
        array[8] ='P';
        array[9] ='D';
        array[10] ='X';
        array[11] ='B';
        array[12] ='N';
        array[13] ='J';
        array[14] ='Z';
        array[15] ='S';
        array[16] ='Q';
        array[17] ='V';
        array[18] ='H';
        array[19] ='L';
        array[20] ='C';
        array[21] ='K';
        array[22] ='E';
        //String vector[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int lugar = dni%23;
        letra = array[lugar];
        
        
    }
    
    public void mostrar(){
        String dnit = String.valueOf(dni);
        
        if(dnit.length() == 8){
            System.out.println(dnit+"-"+letra);
        }else if(dnit.length() == 7){
            System.out.println("0"+dnit+"-"+letra);
        }else if(dnit.length() == 6){
            System.out.println("00"+dnit+"-"+letra);
        }else if(dnit.length() == 5){
            System.out.println("000"+dnit+"-"+letra);
        }else{
            System.out.println("0000"+dnit+"-"+letra);
        }
    }
    
}
