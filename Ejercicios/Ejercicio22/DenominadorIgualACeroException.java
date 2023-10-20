package Ejercicio22;

public class DenominadorIgualACeroException extends Exception{
    public DenominadorIgualACeroException() {
        super("Denominador no puede ser 0");
    }
}
