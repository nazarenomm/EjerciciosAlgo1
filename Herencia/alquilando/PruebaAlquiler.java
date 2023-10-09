package alquilando;

public class PruebaAlquiler {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Chevrolet", "modelo", 2000000);
        Auto auto = new Auto("Ford", "Focus", 8400000);
        Moto moto = new Moto("Mondial", "LD", 500000);

        System.out.println("El precio del alquiler semanal de " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " es " + vehiculo.calcularCostoAlquiler(7));
    
        System.out.println("El precio del alquiler semanal de " + auto.getMarca() + " " + auto.getModelo() + " es " + auto.calcularCostoAlquiler(7));
        
        System.out.println("El precio del alquiler semanal de " + moto.getMarca() + " " + moto.getModelo() + " es " + moto.calcularCostoAlquiler(7));
    
    }
    
}
