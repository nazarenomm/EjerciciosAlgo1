package listaGenerica;
import java.util.AbstractList;

public class ListaGenerica<E> extends AbstractList<E> {
    private E[] elementos;
    private int size = 0;
    private static final int CAPACIDAD_INICIAL = 10; // Tamaño inicial del arreglo

    public ListaGenerica() {
        elementos = (E[]) new Object[CAPACIDAD_INICIAL];
    }


    private void resizeArreglo(int nuevaCapacidad) {
        E[] nuevoArreglo = (E[]) new Object[nuevaCapacidad];
        for (int i = 0; i < size; i++) {
            nuevoArreglo[i] = elementos[i];
        }

        elementos = nuevoArreglo;
    }

    public boolean add(E elemento) {
        if (size == elementos.length) {
            
        }
    }
    

    @Override
    public E get(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
        return elementos[indice];
    }

    @Override
    public int size() {
        return size;
    }
}
