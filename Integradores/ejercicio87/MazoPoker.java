package ejercicio87;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MazoPoker {
    private ArrayDeque<Carta> cartas;
    private static final int SIZE_MAX = 52;

    public MazoPoker(ArrayDeque<Carta> cartas) {
        this.cartas = cartas;
    }

    public MazoPoker() {
        this.cartas = new ArrayDeque<>();
    }

    public void barajar() {
        List<Carta> listaCartas = new ArrayList<>(this.cartas);
        Collections.shuffle(listaCartas);
        this.cartas = new ArrayDeque<>(listaCartas);
    }

    public List<Carta> sacarCartasArriba(int cantidad) {
        if (this.cartas.size() < cantidad) throw new IllegalArgumentException("No hay suficientes cartas");
        List<Carta> retorno = new ArrayList<>();
        
        for (int i = 0; i < cantidad; i++) {
            retorno.add(cartas.removeFirst());
        }
        return retorno;
    }

    public List<Carta> sacarCartasAbajo(int cantidad) {
        if (this.cartas.size() < cantidad) throw new IllegalArgumentException("No hay suficientes cartas");
        List<Carta> retorno = new ArrayList<>();
        
        for (int i = 0; i < cantidad; i++) {
            retorno.add(cartas.removeLast());
        }
        return retorno;
    }

    public void agregarCartasArriba(int cantidad) {
        if (cartas.size() + cantidad > SIZE_MAX) {
            throw new IllegalArgumentException("No hay suficientes cartas");
        }
        if (cantidad < 1) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        int sizeInicial = cartas.size();
        String[] palos = {"Pica", "Trébol", "Corazón", "Diamante"};
        while (cartas.size() < cantidad + sizeInicial) {
            int valor = ThreadLocalRandom.current().nextInt(1, 14);
            int indicePalo = ThreadLocalRandom.current().nextInt(0, 4);
            String palo = palos[indicePalo];

            Carta carta = new Carta(valor, palo);
            if (!(cartas.contains(carta))) {
                cartas.addFirst(carta);
            }
        }
    }

    //TODO ver si hay forma de invertir un deque, para no repetir codigo
    public void agregarCartasAbajo(int cantidad) {
        if (cartas.size() + cantidad > SIZE_MAX) {
            throw new IllegalArgumentException("No hay suficientes cartas");
        }
        if (cantidad < 1) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        int sizeInicial = cartas.size();
        String[] palos = {"Pica", "Trébol", "Corazón", "Diamante"};
        while (cartas.size() < cantidad + sizeInicial) {
            int valor = ThreadLocalRandom.current().nextInt(1, 14);
            int indicePalo = ThreadLocalRandom.current().nextInt(0, 4);
            String palo = palos[indicePalo];

            Carta carta = new Carta(valor, palo);
            if (!(cartas.contains(carta))) {
                cartas.addLast(carta);
            }
        }
    }

    public void ordenar(String[] ordenPalos) {
        List<Carta> cartasOrdenadas = new ArrayList<>();
        for (String palo : ordenPalos) {
            List<Carta> cartasPalo = new ArrayList<>();
            for (Carta carta : cartas) {
                if (carta.getPalo().equals(palo)) {
                    cartasPalo.add(carta);
                }
            }
            Collections.sort(cartasPalo);
            cartasOrdenadas.addAll(cartasPalo);
        }
        this.cartas = new ArrayDeque<>(cartasOrdenadas);
    }

    @Override
    public String toString() {
        String out = "";
        for (Carta carta : cartas) {
            out += carta.toString() + "\n";
        }
        return out;
    }

    public static void main(String[] args) {
        MazoPoker mazo = new MazoPoker();

        System.out.println("Agrego 40 arriba");
        mazo.agregarCartasArriba(40);

        System.out.println("Mazo:");
        System.out.println(mazo);

        System.out.println("Agrego 3 abajo");
        mazo.agregarCartasAbajo(3);

        System.out.println("Mazo:");
        System.out.println(mazo);

        System.out.println("Saco 5 de abajo");
        List<Carta> sacadasAbajo = mazo.sacarCartasAbajo(5);
        System.out.println("cartas que saqué de abajo");
        for (Carta carta : sacadasAbajo) {
            System.out.println(carta);
        }

        System.out.println("Mazo:");
        System.out.println(mazo);

        System.out.println("Saco 8 de arriba");
        List<Carta> sacadasArriba = mazo.sacarCartasArriba(8);
        System.out.println("cartas que saqué de arriba");
        for (Carta carta : sacadasArriba) {
            System.out.println(carta);
        }

        System.out.println("Mazo:");
        System.out.println(mazo);

        System.out.println("Ordeno: Corazón, Diamante, Pica, Trébol");
        String[] orden = {"Corazón", "Diamante", "Pica", "Trébol"};
        mazo.ordenar(orden);

        System.out.println("Mazo:");
        System.out.println(mazo);
    }
}
