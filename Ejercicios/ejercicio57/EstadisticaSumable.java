package ejercicio57;

public interface EstadisticaSumable<T extends Number & Comparable<T>> extends Estadistica<T>{
    T suma();
    float promedio();

    //T debe ser numerico
}
