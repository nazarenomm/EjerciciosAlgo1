package ejercicio69enAdelante;

public class ArregloNuloException extends Exception {
    public ArregloNuloException() {
        super("El arreglo es nulo, operación inválida");
    }
}