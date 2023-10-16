package ejercicio57;

import java.util.ArrayList;

public class ArrayListContainer<T extends Number & Comparable<T>> implements EstadisticaSumable<T>{
    public ArrayList<T> array;

    public ArrayListContainer(ArrayList<T> array) {
        this.array = array;
    }

    private T sumar(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else {
            throw new UnsupportedOperationException("Tipo no soportado para la suma");
        }
    }

    @Override
    public float promedio() {
        float suma = (float) suma();
        int cantElementos = cantElementos();
        return suma / cantElementos;
    }

    @Override
    public T suma() {
        T suma = null;
        for (T elemento : array) {
            if (suma == null) {
                suma = elemento;
            } else {
                suma = sumar(suma, elemento);
            }
        }
        return suma;
    }

    @Override
    public int cantElementos() {
        return array.size();
    }

    @Override
    public T maximo() {
        T maximo = null;
        for (T t : array) {
            if (t.compareTo(maximo) > 0) {
                maximo = t;
            }
        }
        return maximo;
    }

    @Override
    public T minimo() {
        T minimo = null;
        for (T t : array) {
            if (t.compareTo(minimo) < 0) {
                minimo = t;
            }
        }
        return minimo;
    }
    
}
