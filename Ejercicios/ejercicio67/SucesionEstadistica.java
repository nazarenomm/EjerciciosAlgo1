package ejercicio67;

import java.util.ArrayList;
import java.util.List;

import ejercicio67.excepciones.SucesionVaciaException;

public class SucesionEstadistica<T extends Number> {
    List<T> sucesion;

    public SucesionEstadistica(List<T> sucesion) {
        this.sucesion = sucesion;
    }

    public void agregar(T numero) {
        this.sucesion.add(numero);
    }

    public int cantElementos() {
        return this.sucesion.size();
    }

    public float media() throws SucesionVaciaException {
        if (this.sucesion.isEmpty()) {
            throw new SucesionVaciaException();
        }
        float suma = 0; 
        for (T number : sucesion) {
            suma += number.floatValue();
        }
        return suma / this.cantElementos(); 
    }

    public float desvioStandard() throws SucesionVaciaException {
        if (this.sucesion.isEmpty()) {
            throw new SucesionVaciaException();
        }
        float media = this.media();
        float sumaDifCuadradas = 0;
        for (T numero : this.sucesion) {
            sumaDifCuadradas += Math.pow(numero.floatValue() - media, 2);
        }

        return (float) Math.sqrt(sumaDifCuadradas / this.cantElementos());
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(4);
        lista.add(7);
        lista.add(12);
        lista.add(3);
        lista.add(2);
        lista.add(21);
        lista.add(-1);
        SucesionEstadistica<Integer> sucesion = new SucesionEstadistica<>(lista);
        
        System.out.println(sucesion.cantElementos());
        sucesion.agregar(2);
        System.out.println(sucesion.cantElementos());

        try {
            System.out.println("media: " + sucesion.media());
            System.out.println("Desvío Estandard: " + sucesion.desvioStandard());
        } catch (SucesionVaciaException e) {
            System.out.println(e.getMessage());
        }
    }
}
