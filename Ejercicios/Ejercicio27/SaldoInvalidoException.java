package Ejercicio27;

public class SaldoInvalidoException extends Exception {
    public SaldoInvalidoException() {
        super("Saldo inicial debe ser mayor o igual a 0");
    }
}
