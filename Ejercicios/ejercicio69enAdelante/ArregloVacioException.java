package ejercicio69enAdelante;

public class ArregloVacioException extends Exception {
    public ArregloVacioException() {
        super("El arreglo está vacío, operación inválida");
    }
}
