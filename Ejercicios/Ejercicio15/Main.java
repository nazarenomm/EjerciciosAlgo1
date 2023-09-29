package Ejercicio15;

public class Main {
    public static void main(String[] args) {
        Hora tresCuarto = new Hora(3, 15, 50);
        Hora diezMedia = new Hora(22, 30, 15);
        Hora nuevoHora;

        nuevoHora = tresCuarto.sumar(diezMedia);
        //nuevoHora = nuevoHora.sumarReemplazar(horaSuma);

        System.out.println(nuevoHora);
    }
}
