package ejercicio51;

public abstract class Sort<T> {
    public T[] elementos;
    public int numComparaciones;
    public int numIntercambios;

    public abstract void ordenar();

    public abstract void agregar(T elemento);

    public abstract boolean comparar(T elemento1, T elemento2);

    public abstract void intercambiar(T elemento1, T elemento2);

    // tiene que ser subclase de sort
    // sería mejor que fuera una interfaz, los elementos T pueden tener distintas formas de ser comparados
    // y entonces seria mejor que las clases que implementan sort sobreescriban el metodo comparar qsy
    
}
