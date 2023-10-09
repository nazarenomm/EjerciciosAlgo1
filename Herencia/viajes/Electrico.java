package viajes;

public class Electrico extends Viaje {

    public Electrico(Trayecto trayecto, int cantVagones, int cantMaxPasajeros) {
        super(trayecto, cantVagones, cantMaxPasajeros);
    }
    @Override
    public double tiempoDemora() {
        return ((trayecto.getDistancia() * trayecto.getCantEstaciones())) /2.0;
    }
}
