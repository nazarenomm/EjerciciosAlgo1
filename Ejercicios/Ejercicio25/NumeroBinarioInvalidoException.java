package Ejercicio25;

public class NumeroBinarioInvalidoException extends Exception {
    public NumeroBinarioInvalidoException() {
        super("Número no puede ser interpretado como binario");
    }
}
