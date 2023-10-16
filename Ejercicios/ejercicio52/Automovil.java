package ejercicio52;

public class Automovil extends VehiculoMotorizado implements CapacidadLimite {
    private String estilo;
    private int capacidad;

    public Automovil(String estilo) {
        this.estilo = estilo;
        if (estilo.equalsIgnoreCase("Van")) {
            this.capacidad = capacidadVan;
        } else if (estilo.equalsIgnoreCase("Normal")) {
            this.capacidad = capacidadAuto;
        }
    }

    public Automovil() {
        this.estilo = "Normal";
        this.capacidad = capacidadAuto;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
}
