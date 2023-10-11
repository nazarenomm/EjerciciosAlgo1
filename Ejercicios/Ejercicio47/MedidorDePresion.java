package Ejercicio47;

public class MedidorDePresion implements Medible {
    private float unidades;
    private int incrementosSinDecrementos;

    public MedidorDePresion() {
        this.unidades = 0;
        this.incrementosSinDecrementos = 0;
    }
    @Override
    public float obtenerMedida() {
        return this.unidades;
    }

    @Override
    public void incrementar(float f) {
        this.unidades += f;
        this.incrementosSinDecrementos += 1;
    }

    @Override
    public boolean decrementar(float f) {
        if (incrementosSinDecrementos == 0) {
            return true;
        } else {
            this.unidades -= f/incrementosSinDecrementos;
            this.incrementosSinDecrementos = 0;
            return false;
        }
    }
}
