package Ejercicio25;

public class NumeroDecimal {
    private int numeroDecimal;

    public NumeroDecimal(int numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }

    public String aBinario() {
        return Integer.toBinaryString(numeroDecimal);
    }

    @Override
    public String toString() {
        return Integer.toString(numeroDecimal);
    }
}
