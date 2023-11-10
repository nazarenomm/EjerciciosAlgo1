package Parcial1;

public class EquipoInvalidoException extends Exception {
    public EquipoInvalidoException(String equipo) {
        super("Equipo inválido: " + equipo);
    }
}
