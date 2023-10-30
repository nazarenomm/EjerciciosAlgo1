package ejercicio67.excepciones;

public class SucesionVaciaException extends Exception {
    public SucesionVaciaException() {
        super("La sucesión está vacía, operación inválida");
    }
}
