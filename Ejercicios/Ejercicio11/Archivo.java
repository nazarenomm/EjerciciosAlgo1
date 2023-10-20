package Ejercicio11;

public class Archivo {
    String nombre;
    int longreg;
    void init (int r) throws LongregInvalidoException {
        if (r < 0) {
            throw new LongregInvalidoException();
        }
    longreg = r;
}
public static void main(String[] args) {
    Archivo f = new Archivo();
    try {
         f.init(-1);
         System.out.println(f.longreg);
    } catch (LongregInvalidoException e) {
        System.out.println("Longitud inválida");
    }
}
}

