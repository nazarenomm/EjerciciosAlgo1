package Ejercicio25;

public class Main {
    public static void main(String[] args) {
        NumeroBinario binario = new NumeroBinario("1101");
        int decimalDesdeBinario = binario.aDecimal();
        System.out.println("Número decimal desde binario: " + decimalDesdeBinario);

        NumeroDecimal decimal = new NumeroDecimal(13);
        String binarioDesdeDecimal = decimal.aBinario();
        System.out.println("Número binario desde decimal: " + binarioDesdeDecimal);
    }
    
}
