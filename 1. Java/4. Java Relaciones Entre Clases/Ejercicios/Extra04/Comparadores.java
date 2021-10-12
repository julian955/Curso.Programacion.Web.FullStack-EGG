
package Extra04;

import java.util.Comparator;


public class Comparadores {
      public static Comparator<Alumno> ordPorVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t1.getVotos().compareTo(t.getVotos());
        }
    };
}
