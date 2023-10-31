package ejercicio85;

import java.util.concurrent.ThreadLocalRandom;

public class Forma {
    private float largo;
    private float ancho;
    private float profundidad;

    public Forma() {
        this.largo =  ThreadLocalRandom.current().nextInt(1, 11);
        this. ancho =  ThreadLocalRandom.current().nextInt(1, 11);
        this.profundidad = ThreadLocalRandom.current().nextInt(1, 4);
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }

        if (otro == null || this.getClass() != otro.getClass()) {
            return false;
        }

        Forma otro2 = (Forma) otro;   // Downcasting a MiClase
        return this.getLargo() == otro2.getLargo() 
                && this.getAncho() == otro2.getAncho() 
                && this.getProfundidad() == otro2.getProfundidad();
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }

    
}
