
package Ejercicio08;

public class Cadena {
    private String frase;
    private int longitud;
    
    public Cadena(String frase,int longitud){
        this.frase = frase;
        this.longitud = longitud;
    }
    
    public String getFrase(){
        return frase;
    }
    
    public void setFrase(String frase){
        this.frase = frase;
    }
    
    public int getLongitud(){
        return longitud;
    }
    
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
    
    public int mostrarVocales(){
     int i = 0,aux = 0;
     String aux1;
     
     for(i = 0 ; i < frase.length(); i++){
         aux1 = frase.substring(i, i+1);
         if(aux1.equals("a")|| aux1.equals("e")||aux1.equals("i")||aux1.equals("o")||aux1.equals("u")){
             aux++;
         }
         
     }
       return aux; 
    }
    
    public String invertirFrase(){
       int i = 0, aux = longitud;
       String var = "";
       for(i = 0; i < longitud;i++){
           var += frase.substring(aux-1, aux);
           aux--;
       }
       return var;
    }
    
    public int vecesRepetida(String letra){
        int i = 0,aux = 0;
        String var;
        
        for(i=0;i<longitud;i++){
            var = frase.substring(i, i+1);
            if(var.equals(letra)){
                aux++;
            }
        }
        return aux;
    }
    
    public boolean compararLongitud(String frase){
        boolean cond;
        if(frase.length()>longitud){
            cond = true;
        }else{
            cond = false;
        }
        return cond;
    }
    
    public String unirFrase(String frase){         
      String  var = this.frase.concat(frase);
        return var;
    }
    
    public String reemplazar(char letra){
        int i;
        String var = "";
        for(i = 0; i < longitud;i++){
           var += frase.substring(i, i+1).replace('a', letra);
        }
        return var;
    }
    
    public boolean contiene(String letra){
        int i;
        for(i = 0;i<longitud;i++){
            if(frase.substring(i, i+1).equals(letra)){
                return true;
                
            }
        }
        
        return false;
    }
}
