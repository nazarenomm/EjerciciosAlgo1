package Ejercicio27;

public class ImporteInvalidoException extends Exception{
    public ImporteInvalidoException() {
        super("El importe debe ser mayor a 0");
    }
}
