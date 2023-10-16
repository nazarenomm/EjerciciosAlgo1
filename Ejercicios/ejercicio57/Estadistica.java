package ejercicio57;

public interface Estadistica<T extends Comparable<T>> {
    
    T minimo();
    T maximo();
    int cantElementos();
}
