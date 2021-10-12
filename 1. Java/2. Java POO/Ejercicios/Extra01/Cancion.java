
package Extra01;


public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion(){}
    
    public Cancion(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void mostrarCancion(){
        System.out.println("El autor de la cancion es: "+autor);
        System.out.println("El titulo de la cancion es: "+titulo);
    }
    
}
