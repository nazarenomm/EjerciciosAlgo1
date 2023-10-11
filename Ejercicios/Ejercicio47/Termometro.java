package Ejercicio47;

public class Termometro implements Medible {
    private float temperatura;

    public Termometro(float temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public float obtenerMedida() {
        return this.temperatura;
    }

    @Override
    public void incrementar(float f) {
        this.temperatura += f;
    }

    @Override
    public boolean decrementar(float f) {
        if (this.temperatura - f < -273) {
            return true;
        } else {
            this.temperatura -= f;
            return false;
        }
    }
}
