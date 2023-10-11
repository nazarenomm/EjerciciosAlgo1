package Ejercicio47;

public class CuentaBancaria implements Medible{
    private float saldo;

    public CuentaBancaria() {
        this.saldo = 0;
    }

    @Override
    public float obtenerMedida() {
        return this.saldo;
    }

    @Override
    public void incrementar(float f) {
        this.saldo += f;
    }

    @Override
    public boolean decrementar(float f) {
        if (saldo - f < 0) {
            return true;
        } else {
            saldo -= f;
            return false;
        }
    }
}
