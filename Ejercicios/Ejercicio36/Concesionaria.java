package Ejercicio36;

public class Concesionaria {
    
    Automovil[] autos;

    public Concesionaria(Automovil[] autos) {
        this.autos = autos;
    }

    public void autorizar(Camion camion) {
        camion.setAutorizacion(true);
    }
}
