package ejercicio69enAdelante;

public class CadenaVaciaException extends Exception {
    public CadenaVaciaException() {
        super("La cadena está vacia, igual tomá un null");
    }
}
