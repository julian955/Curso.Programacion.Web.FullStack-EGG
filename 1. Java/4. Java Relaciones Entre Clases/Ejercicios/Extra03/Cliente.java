
package Extra03;

public class Cliente {
    private String nombre;
    private String apellido;
    private long documento;
    private String mail;
    private int telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, long documento, String mail, int telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String mostrarCliente(){
        return "Nombre: "+nombre+" Apellido: "+apellido+"\nDocumento: "+documento+" Mail: "+mail+"\nTelefono: "+telefono+" Direccion: "+direccion;
    }
}
