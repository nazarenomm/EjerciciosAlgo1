package ejercicio63;

// nombre se clase descriptivo
// switch es una palabra reservada de java
public class Interruptor {
    //defino constantes para los mensajes para facilitar su mantenimiento y reutilización
    private static final String ERROR_PUNTERO = "Ocurrió un error de puntero: ";
    private static final String ERROR_IO = "Ocurrió un error de I/O: ";

    boolean estado;

    public Interruptor() {
        this.estado = false;
    }

    void on() {estado = true;}

    void off() {estado = false;}

    public static void main(String[] args) {
        Interruptor interruptor = new Interruptor();
        try {
            interruptor.on();
            // codigo
        } catch (NullPointerException e) { //agrego mensaje y stack trace
            System.out.println(ERROR_PUNTERO + e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR_IO + e.getMessage());
            e.printStackTrace();
        } finally { //como todos los bloques tienen un .off() lo pongo en un finally
            interruptor.off();
        }
    }
}
