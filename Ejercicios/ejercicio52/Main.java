package ejercicio52;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Camion2 camion = new Camion2(1, 2);
        Motocicleta moto = new Motocicleta();
        Automovil auto = new Automovil();
        Automovil van = new Automovil("van");

        List<VehiculoMotorizado> vehiculos = new ArrayList<>();

        vehiculos.add(camion);
        vehiculos.add(moto);
        vehiculos.add(auto);
        vehiculos.add(van);

        for (VehiculoMotorizado vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}