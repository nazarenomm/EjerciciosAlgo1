package alquilando;

public class Auto extends Vehiculo{

    public Auto(String marca, String modelo, double precioBase) {
        super(marca, modelo, precioBase);
    }

    @Override

    public double calcularCostoAlquiler(int dias) {
        return (precioBase * dias) * 0.2;
    }
}
