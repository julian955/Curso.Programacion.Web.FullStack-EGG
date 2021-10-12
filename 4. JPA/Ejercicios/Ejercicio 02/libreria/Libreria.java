package libreria;

import javax.swing.JOptionPane;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;

public class Libreria {

    public static void main(String[] args) {

        try {
            LibroService ls = new LibroService();
            AutorService as = new AutorService();
            EditorialService es = new EditorialService();

            String menu = "1.Para ver el menu de libros\n2.Para ver el menu de autores\n3.Para ver el menu de editoriales\n4.Para salir";
            int men = 0;

            while (men != 4) {
                men = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (men) {
                    case 1:
                        ls.menuLibro();
                        break;
                    case 2:
                        as.menuAutor();
                        break;
                    case 3:
                        es.menuEditorial();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa!.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, Ingrese otra.");
                        break;

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de sistema.\n" + e);
        }

    }

}
