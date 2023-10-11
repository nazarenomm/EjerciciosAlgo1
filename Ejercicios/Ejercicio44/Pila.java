package Ejercicio44;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pila<E> {
    private ArrayList<E> lista;

    public Pila() {
        this.lista = new ArrayList<>();
    }

    public void push(E elemento) {
        lista.add(elemento);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return lista.remove(lista.size() - 1);
    }

    public int size() {
        return lista.size();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public static void main(String[] args) {
        Pila<String> pila = new Pila<>();

        // Agregar elementos a la pila
        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");

        // Mostrar el tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.size());

        // Sacar elementos de la pila y mostrarlos
        System.out.println("Elemento superior de la pila: " + pila.pop());
        System.out.println("Elemento superior de la pila: " + pila.pop());

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pila.isEmpty());

        // Sacar otro elemento de la pila
        System.out.println("Elemento superior de la pila: " + pila.pop());

        // Verificar de nuevo si la pila está vacía
        System.out.println("¿La pila está vacía? " + pila.isEmpty());

        // Intentar sacar un elemento de una pila vacía
        try {
            System.out.println("Elemento superior de la pila: " + pila.pop());
         } catch (EmptyStackException e) {
             System.out.println("La pila está vacía, no se puede sacar más elementos.");
         }
    }
}

