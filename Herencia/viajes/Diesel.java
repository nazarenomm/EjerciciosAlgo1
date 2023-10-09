package viajes;

public class Diesel extends Viaje {

    public Diesel(Trayecto trayecto, int cantVagones, int cantMaxPasajeros) {
        super(trayecto, cantVagones, cantMaxPasajeros);
    }
    @Override
    public double tiempoDemora() {
        return ((this.trayecto.getDistancia() * this.trayecto.getCantEstaciones())/2.0) + 
        (this.trayecto.getCantEstaciones() + this.cantMaxPasajeros)/10.0;
    }
}
