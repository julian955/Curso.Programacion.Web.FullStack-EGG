package Extra10;

public class FechaEntidad {

    Fecha f = new Fecha();

    public Fecha inicializar() {
        int dia = 1;
        int mes = 1;
        int ano = 1900;

        return new Fecha(dia, mes, ano);
    }

    public void verificarFecha(int dia, int mes, int ano) {
        if (ano < 1900 || ano > 2021) {
            System.out.println("La fecha introducida no es valida, se ingreso la fecha por defecto.");
            f.setDia(1);
            f.setMes(1);
            f.setAno(1900);
        } else {
            f.setDia(dia);
            f.setMes(mes);
            f.setAno(ano);
            System.out.println("La fecha se ingreso correctamente");
        }
    }

    public void verificarDias(int mes) {
        // int [] meses = new int [12]  ;

        int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("El mes seleccionado (" + mes + ") tiene " + meses[(mes + 1)] + " dias");
    }

    public void diaAnterior(int dia, int mes, int ano) {
        int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int aux1 = 0, aux2 = 0, aux3 = 0;
        if (dia == 1 && mes == 1) {
            aux1 = f.getAno() - 1;
            aux2 = 12;
            aux3 = 31;
        } else if (dia == 1) {
            int aux = meses[(mes - 2)];
            aux1 = f.getAno();
            aux2 = f.getMes() - 1;
            aux3 = aux;
        } else {
            aux1 = f.getAno();
            aux2 = f.getMes();
            aux3 = f.getDia() - 1;
        }
        System.out.println("El dia anterior es " + aux3 + "/" + aux2 + "/" + aux1);
    }

    public void diaPosterior(int dia, int mes, int ano) {
        int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int aux1 = 0, aux2 = 0, aux3 = 0;
        if (dia == 31 && mes == 12 || dia == 30 && mes == 12) {
            aux1 = f.getAno() + 1;
            aux2 = 1;
            aux3 = 1;
        } else if (dia == 31 || dia == 30) {
            int aux = meses[(mes + 2)];
            aux1 = f.getAno();
            aux2 = f.getMes() + 1;
            aux3 = aux;
        } else {
            aux1 = f.getAno();
            aux2 = f.getMes();
            aux3 = f.getDia() + 1;
        }
        System.out.println("El dia posterior es " + aux3 + "/" + aux2 + "/" + aux1);
    }

    public boolean biciesto(int ano) {
        if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
            return true;
        }
        return false;
    }

    public void mostrarFecha() {
        System.out.println("La fecha ingresada es: " + f.getDia() + "/" + f.getMes() + "/" + f.getAno());
    }
}
