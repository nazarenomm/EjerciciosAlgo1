package ejercicio52;

public class Motocicleta extends VehiculoMotorizado {
    private String uso;

    public Motocicleta(String uso) {
        this.uso = uso;
    }

    public Motocicleta() {
        this.uso = null;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

}
