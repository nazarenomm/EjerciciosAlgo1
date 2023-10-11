package Ejercicio42;

public class Wrapper<T> {
    private T valor;

    public Wrapper(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public void visualizar() {
        System.out.println("Valor: " + valor);
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Wrapper con un String
        Wrapper<String> wrapperString = new Wrapper<>("Hola, mundo!");
        wrapperString.visualizar(); // Salida esperada: Valor: Hola, mundo!
        
        // Ejemplo de uso de la clase Wrapper con un Integer
        Wrapper<Integer> wrapperInteger = new Wrapper<>(42);
        wrapperInteger.visualizar(); // Salida esperada: Valor: 42
    }
}