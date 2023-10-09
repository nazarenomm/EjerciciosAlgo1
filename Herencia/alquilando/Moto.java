package alquilando;

public class Moto extends Vehiculo{
    
    public Moto(String marca, String modelo, double precioBase) {
        super(marca, modelo, precioBase);
    }

    @Override

    public double calcularCostoAlquiler(int dias) {
        return (precioBase * dias) * 0.15;
    }
}
