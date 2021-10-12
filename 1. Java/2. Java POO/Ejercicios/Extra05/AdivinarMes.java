package Extra05;

public class AdivinarMes {

    private String mes[];
    private String mesSecreto;

    public AdivinarMes() {
        mes = new String[12];
    }

    public void llenarMeses() {
        mes[0] = "enero";
        mes[1] = "febrero";
        mes[2] = "marzo";
        mes[3] = "abril";
        mes[4] = "mayo";
        mes[5] = "junio";
        mes[6] = "julio";
        mes[7] = "agosto";
        mes[8] = "septiembre";
        mes[9] = "octubre";
        mes[10] = "noviembre";
        mes[11] = "diciembre";

    }
    
    public void mesSecreto(){
        int random = (int)(Math.random()*10);
        mesSecreto = mes[random];
    }
    
    public void elegirMes(int select){
        mesSecreto = mes[select];
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

}
