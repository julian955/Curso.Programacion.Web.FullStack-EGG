
package Extra04;


public class CodigoPostal {
    private String ciudad;
    private Integer cp;

    public CodigoPostal() {
    }

    public CodigoPostal(String ciudad, int cp) {
        this.ciudad = ciudad;
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
    
    
}
