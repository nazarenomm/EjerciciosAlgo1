package ejercicio87;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carta implements Comparable<Carta>{
    private int valor;
    private String palo;

    public Carta(int valor, String palo) {
        String[] arrayPalos = {"Corazón", "Pica", "Trébol", "Diamante"};
        List<String> palos = new ArrayList<>();
        for (String p : arrayPalos) {
            palos.add(p);
        }
        if (valor < 0 || valor > 13) throw new IllegalArgumentException();
        if (!(palos.contains(palo))) throw new IllegalArgumentException();

        this.valor = valor;
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }
    
    @Override
    public String toString() {
        if (valor < 11) {
            return String.valueOf(valor) + " de " + palo;
        } else if (valor == 11){
            return "J"  + " de " + palo;
        } else if (valor == 12) {
            return "Q" + " de " + palo;
        } else {
            return "K" + " de " + palo;
        }
    }

    @Override
    public int compareTo(Carta otraCarta) {
        return valor - otraCarta.getValor();
    }

    @Override
    public boolean equals(Object otro) {
        if (otro == this) return true;
        if (this.getClass() != otro.getClass()) return false;

        Carta otro2 = (Carta) otro;
        return this.valor == otro2.getValor() && this.palo.equals(otro2.getPalo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, palo);
    }
}
