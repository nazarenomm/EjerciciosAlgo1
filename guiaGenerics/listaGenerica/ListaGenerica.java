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
            resizeArreglo(size + 1);
            elementos[elementos.length] = elemento;
        } else {
            elementos[size + 1] = elemento;
            size++;
        }
        return true;
    }
    
    @Override
    public E get(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
        return elementos[indice];
    }

    @Override
    public E set(int index, E elemento) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
        }
        E antiguoElemento = elementos[index];
        elementos[index] = elemento;
        return antiguoElemento;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
        }
        E elementoRemovido = (E) elementos[index];
        System.arraycopy(elementos, index + 1, elementos, index, size - index - 1);
        elementos[size - 1] = null;
        size--;
        return elementoRemovido;
    }

    @Override
    public int size() {
        return size;
    }
}
