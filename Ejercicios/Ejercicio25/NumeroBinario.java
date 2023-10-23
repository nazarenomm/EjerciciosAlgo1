package Ejercicio25;

public class NumeroBinario {
    private String numeroBinario;

    public NumeroBinario(String numeroBinario) throws NumeroBinarioInvalidoException {
        for (char c : numeroBinario.toCharArray()) {
            if (c != '0' && c != '1') {
                throw new NumeroBinarioInvalidoException();
            }
        }
        this.numeroBinario = numeroBinario;
    }

    public int aDecimal() {
        return Integer.parseInt(numeroBinario, 2);
    }

    @Override
    public String toString() {
        return this.numeroBinario;
    }

    public static void main(String[] args) {
        try {
            NumeroBinario binario = new NumeroBinario("011010");
            System.out.println(binario.toString());
            System.out.println(binario.aDecimal());
        } catch (NumeroBinarioInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
