package ejercicio52;

public class Camion2 extends VehiculoMotorizado implements CapacidadLimite{
    private int remolques;
    private boolean nivelSeguridad;
    private int cantidadPasajeros;

    public Camion2(int remolques, int cantidadPasajeros) {
        this.remolques = remolques;
        this.cantidadPasajeros = cantidadPasajeros;
        if (cantidadPasajeros > capacidadCamion) {
            this.nivelSeguridad = false;
        } else {
            this.nivelSeguridad = true;
        }
    }

    public int getRemolques() {
        return remolques;
    }
    public void setRemolques(int remolques) {
        this.remolques = remolques;
    }
    public boolean getNivelSeguridad() {
        return nivelSeguridad;
    }

    public void setNivelSeguridad(boolean nivelSeguridad) {
        this.nivelSeguridad = nivelSeguridad;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    

    
}
