package registro.excepciones;

public class NombreInvalidoException extends Exception {
    public NombreInvalidoException() {
        super("Nombre inválido");
    }
}
