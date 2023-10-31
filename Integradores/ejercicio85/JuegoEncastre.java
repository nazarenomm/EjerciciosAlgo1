package ejercicio85;

import java.util.ArrayList;
import java.util.List;

public class JuegoEncastre {

    public static int jugar(int cantBloques, int cantHuecos) throws CantidadBloquesInvalida, DemasiadosIntentosException {
        if (cantBloques > cantHuecos) throw new CantidadBloquesInvalida();
        int intentos = 0;
        List<Forma> huecos = new ArrayList<>();
        List<Forma> bloques = new ArrayList<>();

        for (int i = 0; i < cantBloques; i++) {
            bloques.add(new Forma());
        }

        for (int i = 0; i < cantHuecos; i++) {
            huecos.add(new Forma());
        }

        for (Forma bloque : bloques) {
            for (Forma hueco : huecos) {
                intentos++;
                if (hueco.equals(bloque)) {
                    huecos.remove(hueco);
                    break; // :(
                }
                if (intentos > 1000000) throw new DemasiadosIntentosException();
            }
        }
        return intentos;
    }
    public static void main(String[] args) {
        try {
            int intentos = jugar(670, 1500);
            System.out.println("intentos necesario: " + intentos);
        } catch (CantidadBloquesInvalida | DemasiadosIntentosException e) {
            System.out.println(e.getMessage());
        }
    }
}
