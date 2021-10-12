
package Extra03;

public class Camping extends AlojamientoExtra{
    protected int capCarpas;
    protected int banos;
    protected boolean restaurant;

    public Camping(int capCarpas, int banos, boolean restaurant, String nombre, boolean privado, int metros) {
        super(nombre, privado, metros);
        this.capCarpas = capCarpas;
        this.banos = banos;
        this.restaurant = restaurant;
    }

   

    public int getCapCarpas() {
        return capCarpas;
    }

    public void setCapCarpas(int capCarpas) {
        this.capCarpas = capCarpas;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }
    
    @Override
     public String mostrarDatos(){
        return "--------- CAMPING ---------\n" +"Nombre: "+nombre+"\nPrivado: "+privado+"\nEspacio: "+metros+" m2"+
                "\nCapacidad de carpas: "+capCarpas+"\nBaños: "+banos+"\nRestaurant: "+restaurant;
    }
}
