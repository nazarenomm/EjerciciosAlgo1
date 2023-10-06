package cajaContenedora;

public class Contenedor<T> {
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
    
        Contenedor<Integer> contenedorEntero = new Contenedor<>();
        contenedorEntero.agregar(5);

        Contenedor<String> contenedorString = new Contenedor<>();
        contenedorString.agregar("Hola, mundo!");

        System.out.println("Contenedor de enteros: " + contenedorEntero.obtener());
        System.out.println("Contenedor de strings: " + contenedorString.obtener());

        System.out.println("¿Contenedor de enteros está vacío? " + contenedorEntero.estaVacio());
        contenedorEntero.quitar();
        System.out.println("¿Contenedor de enteros está vacío después de quitar el elemento? " + contenedorEntero.estaVacio());

        System.out.println("El contenedor de enteros es igual a 5? " + contenedorEntero.esIgualA(5));
        System.out.println("El contenedor de strings es igual a \"Hola, mundo!\"? " + contenedorString.esIgualA("Hola, mundo!"));
    }

}
