package Extra06;

import java.util.Scanner;

public class AhorcadoTest {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String palabra[];
    private int letrasencontradas;
    private int jugadasmaximas;
    private String doble[];
    
    public AhorcadoTest(){}
    public AhorcadoTest(String[] palabra,int letrasencontradas,int jugadasmaximas){
        this.palabra = palabra;
        this.letrasencontradas = letrasencontradas;
        this.jugadasmaximas = jugadasmaximas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasencontradas() {
        return letrasencontradas;
    }

    public void setLetrasencontradas(int letrasencontradas) {
        this.letrasencontradas = letrasencontradas;
    }

    public int getJugadasmaximas() {
        return jugadasmaximas;
    }

    public void setJugadasmaximas(int jugadasmaximas) {
        this.jugadasmaximas = jugadasmaximas;
    }

   
    
    public void crearJuego(){
        
        int i;
        System.out.println("Ingrese la palabra a buscar: ");
        String palabrab = leer.next();
        
        palabra = new String[palabrab.length()];
        
        for(i = 0; i < palabra.length;i++){
            palabra[i] = palabrab.substring(i, i+1);
        }
        
        System.out.println("Ingrese los intentos maximos permitido.");
         jugadasmaximas = leer.nextInt();
         
         letrasencontradas = 0;
         doble = palabra;
        
    }
    
    public int longitud(){
       return palabra.length;
    }
    
    public void buscar(String letra){
        int i,aux = 0;
        //String[] doble = palabra;
        
//        System.out.println("Dame una letra: ");
//        String letra = leer.next();
         for(i = 0; i < palabra.length;i++){
            if(palabra[i].equals(letra) && palabra[i] == doble[i]){
                System.out.println("Letra Encontrada!");
                doble[i] = "xx";
                break;
            }else{
                aux++;
            }
            if(aux == palabra.length){
                System.out.println("Letra no Encontrada.");
            }
        }
    }
    
    public boolean letraEncontrada(String letra){
        int i;
        for(i = 0; i < palabra.length;i++){
           if(palabra[i].equals(letra)&& doble[i].equals("xx")){
               doble[i] = "xxx";
               return true;               
           } 
        }
        return false;
    
    }
    
    public void intentos(int intentos){
        System.out.println("Te quedan "+intentos+ " intentos");
    }
}
