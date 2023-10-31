package ejercicio85;

public class CantidadBloquesInvalida extends Exception{
    public CantidadBloquesInvalida() {
        super("Hay más bloques que huecos");
    }
}
