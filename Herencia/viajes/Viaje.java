package viajes;

abstract public class Viaje {
    protected Trayecto trayecto;
    protected int cantVagones;
    protected int cantMaxPasajeros;

    abstract public double tiempoDemora();

    public Viaje(Trayecto trayecto, int cantVagones, int cantMaxPasajeros) {
        this.trayecto = trayecto;
        this.cantVagones = cantVagones;
        this.cantMaxPasajeros = cantMaxPasajeros;
        }
}
