package Ejercicio47;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Medible> medibles = new ArrayList<>();

        Termometro termometro = new Termometro(0);
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        MedidorDePresion medidorDePresion = new MedidorDePresion();

        medibles.add(termometro);
        medibles.add(cuentaBancaria);
        medibles.add(medidorDePresion);

        for (Medible medible : medibles) {
            for (int i=1; i<101; i++) {
                int numRandom = (int) (Math.random() * 100) + 1; 
                if (numRandom % 2 == 0) {
                    medible.decrementar(numRandom);
                    if (medible.decrementar(numRandom)) {
                        System.out.println("No se pudo decrementar");
                    }
                } else {
                    medible.incrementar(numRandom);
                }
                if (i % 10 == 0) {
                    System.out.println(medible + ", " + medible.obtenerMedida());
                }
            }
        }
    }
}
