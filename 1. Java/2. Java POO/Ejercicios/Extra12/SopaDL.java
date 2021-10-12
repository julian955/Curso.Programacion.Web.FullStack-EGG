package Extra12;

import javax.swing.JOptionPane;

public class SopaDL {

    private String[][] matriz;
    private String palabraBuscada;

    public SopaDL() {
        matriz = new String[10][10];
    }

    public SopaDL(String[][] matriz, String palabraBuscada) {
        this.matriz = matriz;
        this.palabraBuscada = palabraBuscada;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public String[] crearPalabras() {
        String[] palabra = new String[5];
        String frase = JOptionPane.showInputDialog("Ingrese una palabra de 5 letras");

        while (frase.length() != 5) {
            frase = JOptionPane.showInputDialog("Palabra incorrecta,ingrese una palabra de 5 letras");
        }
        for (int i = 0; i < frase.length(); i++) {
            palabra[i] = frase.substring(i, (i + 1));
        }

        return palabra;
    }

    public void llenarSopa() {
        String[] palabra = new String[5];

        String[] palabra1 = new String[5];
        int aux = 0;

        for (int i = 0; i < 10; i++) {
            palabra = crearPalabras();
            palabra1 = crearPalabras();
            aux = 0;
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = palabra[j];
            }
            for (int j = 5; j < 10; j++) {
                matriz[i][j] = palabra1[aux];
                aux++;
            }
        }
    }

    public void imprimirSopa() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public void buscarPalabra() {
        palabraBuscada = JOptionPane.showInputDialog("Ingrese la palabra a buscar:");

        while (palabraBuscada.length() != 5) {
            palabraBuscada = JOptionPane.showInputDialog("Palabra incorrecta,ingrese una palabra de 5 letras");
        }
        String[] palabra = new String[5];
        for (int i = 0; i < palabraBuscada.length(); i++) {
            palabra[i] = palabraBuscada.substring(i, (i + 1));
        }
        int x = 0, aux = 0, f = 0, c = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j].equals(palabra[x])) {
                    x++;
                    aux++;
                    if (aux == 5) {
                        f = i;
                        c = j;
                        break;
                    }
                } else {
                    x = 0;
                    aux = 0;
                }

            }
            if (aux == 5) {
                System.out.println("Encontramos tu palabra!");
                System.out.println("Tu palabra se encuentra en la fila " + (f+1) + " columna " + (c - 4));
                break;
            }

        }
        if (aux < 5) {
            System.out.println("No encontramos tu palabra");
        }
    }

    public void reemplazarPalabra() {
        System.out.println("Ingrese la palabra a remplazar");
        String[] palabra = crearPalabras();
        int f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna:"));

        while (c != 0 && c != 5) {
            c = Integer.parseInt(JOptionPane.showInputDialog("Columna incorrecta, ingrese otra:"));
        }

        for (int i = 0; i < 5; i++) {
            matriz[f-1][c] = palabra[i];
            c++;
        }
    }

    public void invertirSopa() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
