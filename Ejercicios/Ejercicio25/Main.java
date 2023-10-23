package Ejercicio25;

public class Main {
    public static void main(String[] args) {
        try {
            NumeroBinario binario = new NumeroBinario("1101");
            int decimalDesdeBinario = binario.aDecimal();
            System.out.println("Número decimal desde binario: " + decimalDesdeBinario);
        } catch (NumeroBinarioInvalidoException e) {
            System.out.println(e.getMessage());
        }

        NumeroDecimal decimal = new NumeroDecimal(13);
        String binarioDesdeDecimal = decimal.aBinario();
        System.out.println("Número binario desde decimal: " + binarioDesdeDecimal);
    }
    
}
