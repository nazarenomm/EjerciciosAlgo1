package Ejercicio25;

public class NumeroBinario {
    private String numeroBinario;

    public NumeroBinario(String numeroBinario) {
        this.numeroBinario = numeroBinario;
    }

    public int aDecimal() {
        return Integer.parseInt(numeroBinario, 2);
    }

    @Override
    public String toString() {
        return this.numeroBinario;
    }
}
