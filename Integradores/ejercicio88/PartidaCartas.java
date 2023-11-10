package ejercicio88;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ejercicio87.Carta;
import ejercicio87.MazoPoker;

public class PartidaCartas {
    private String jugador1;
    private String jugador2;
    private Map<String, List<Carta>> manos;
    private MazoPoker mazo;

    public PartidaCartas(String nombreJugador1, String nombreJugador2) {
        this.mazo = new MazoPoker();
        this.jugador1 = nombreJugador1;
        this.jugador2 = nombreJugador2;
        this.manos = new HashMap<>();
        this.repartir(nombreJugador1, nombreJugador2, 5);
    }

    private void repartir(String nombreJugador1, String nombreJugador2, int cantidadCartas) {
        List<Carta> mano1 = new ArrayList<>();
        List<Carta> mano2 = new ArrayList<>();

        mazo.agregarCartasArriba(52);
        mazo.barajar();
        mano1 = mazo.sacarCartasArriba(cantidadCartas);
        mano2 = mazo.sacarCartasArriba(cantidadCartas);

        manos.put(nombreJugador1, mano1);
        manos.put(nombreJugador2, mano2);
    }

    public void ganaMayorSuma() {
        List<Carta> mano1 = manos.get(jugador1);
        List<Carta> mano2 = manos.get(jugador2);

        int sumaMano1 = 0;
        int sumaMano2 = 0;

        for (Carta carta : mano1) {
            sumaMano1 += carta.getValor();
        }

        for (Carta carta : mano2) {
            sumaMano2 += carta.getValor();
        }

        if (sumaMano1 > sumaMano2) {
            mostrarGanador(jugador1);
            System.out.println("suma : " + sumaMano1);
        } else if (sumaMano1 < sumaMano2) {
            mostrarGanador(jugador2);
            System.out.println("suma : " + sumaMano2);
        } else {
            System.out.println("Empate");
        }
    }

    private void mostrarGanador(String ganador) {
        String manoGanadora = "";
        for (Carta carta : manos.get(ganador)) {
            manoGanadora += carta.toString() + ", ";
        }
        System.out.println("Ganó " + ganador + ", mano: " + manoGanadora);
    }

    public static void main(String[] args) {
        PartidaCartas partida = new PartidaCartas("Martín", "Daniela");
        partida.ganaMayorSuma();
    }
}
