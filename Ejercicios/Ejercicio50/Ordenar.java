package Ejercicio50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordenar {

    public static <T extends Comparable<T>> void ordenarArrayList(ArrayList<T> lista) {
        Collections.sort(lista);
    }

    public static <T extends Comparable<T>> void ordenarArrayListEnOrdenInverso(ArrayList<T> lista, Comparator<T> comparador) {
        Collections.sort(lista, Collections.reverseOrder(comparador));
    }

    public static void main(String[] args) {
    
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Zebra");
        palabras.add("Manzana");
        palabras.add("Perro");
        palabras.add("Gato");

        System.out.println("Lista original: " + palabras);

        ordenarArrayList(palabras);

        System.out.println("Lista ordenada en orden descendente: " + palabras);

        ordenarArrayListEnOrdenInverso(palabras, Comparator.naturalOrder());

        System.out.println("Lista ordenada en orden inverso: " + palabras);
        
    }
}
