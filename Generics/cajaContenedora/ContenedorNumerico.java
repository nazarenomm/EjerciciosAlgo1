package cajaContenedora;

public class ContenedorNumerico<T extends Number> {

    private T elemento;

    public void agregar(T elemento) {
        this.elemento = elemento;
    }

    public void quitar() {
        this.elemento = null;
    }

    public boolean estaVacio() {
        return this.elemento == null;
    }

    public T obtener() {
        return this.elemento;
    }

    public boolean esIgualA(T otroElemento) {
        if (this.elemento == null) {
            return otroElemento == null;
        }
        return this.elemento.equals(otroElemento);
    }

    public static void main(String[] args) {
        ContenedorNumerico<Integer> contenedorEntero = new ContenedorNumerico<>();
        contenedorEntero.agregar(5);

        Contenedor<Double> contenedorDouble = new Contenedor<>();
        contenedorDouble.agregar(12.3);

        System.out.println("Contenedor de enteros: " + contenedorEntero.obtener());
        System.out.println("Contenedor de dobles: " + contenedorDouble.obtener());

        System.out.println("¿Contenedor de enteros está vacío? " + contenedorEntero.estaVacio());
        contenedorEntero.quitar();
        System.out.println("¿Contenedor de enteros está vacío después de quitar el elemento? " + contenedorEntero.estaVacio());

        System.out.println("El contenedor de enteros es igual a 5? " + contenedorEntero.esIgualA(5));
        System.out.println("El contenedor de dobles es igual a 12.3? " + contenedorDouble.esIgualA(12.3));

    }
}
