package ejercicio85;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

    public static int jugar(int cantidad) throws DemasiadosIntentosException {
        int intentos = 0;
        List<Forma> huecos = new ArrayList<>();
        List<Forma> bloques = new ArrayList<>();
        List<Forma> formas = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            Forma forma = new Forma();
            formas.add(forma);
        }

        for (Forma forma : formas) {
            int indice = ThreadLocalRandom.current().nextInt(0, formas.size());
            bloques.add(indice, forma);
            indice = ThreadLocalRandom.current().nextInt(0, formas.size());
            huecos.add(indice, forma);
        }

        for (Forma bloque : bloques) {
            boolean encastro = false;
            while (!encastro) {
                for (Forma hueco : huecos) {
                    intentos++;
                    if (intentos > 1000000) throw new DemasiadosIntentosException();
                    if (bloque.equals(hueco)) {
                        huecos.remove(hueco);
                        encastro = true;
                    }
                }   
            }   
        }
        return intentos;
    }
    public static void main(String[] args) {
        try {
            int intentos = jugar(10);
            System.out.println("intentos necesario: " + intentos);
        } catch (DemasiadosIntentosException e) {
            System.out.println(e.getMessage());
        }
    }
}
