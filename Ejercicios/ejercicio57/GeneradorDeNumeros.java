package ejercicio57;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class GeneradorDeNumeros implements List<Integer>, Iterator<Integer>, Estadistica<Integer> {

    private int valorInicial;
    private int valorFinal;
    private int incremento;
    private int siguienteNumero;

    public GeneradorDeNumeros(int valorInicial, int valorFinal, int incremento) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.incremento = incremento;
        this.siguienteNumero = valorInicial;
    } 

    @Override
    public boolean hasNext() {
        return siguienteNumero <= valorFinal;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int numeroActual = siguienteNumero;
        siguienteNumero += incremento;
        return numeroActual;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return valorInicial + index * incremento;
    }

    @Override
    public Integer minimo() {
        return valorInicial;
    }

    @Override
    public Integer maximo() {
        return valorFinal;
    }

    @Override
    public int cantElementos() {
        return size();
    }

    @Override
    public int size() {
        return valorFinal - valorInicial;
    }

    //metodos que no voy a utilizar

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Iterator<Integer> iterator() {
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean add(Integer e) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public Integer set(int index, Integer element) {
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, Integer element) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public Integer remove(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<Integer> listIterator() {
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }
    
}

