package guiaPolimorfismo.calculadora;

public class PruebaCalculadoraAvanzada {
    public static void main(String[] args) {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();

        System.out.println("Suma de enteros 3 y 2 = " + calculadora.sumar(3, 2));
        System.out.println("Suma de dobles 3.2 y 2.1 = " + calculadora.sumar(3.2, 2.1));
        System.out.println("Resta de enteros 3 y 2 = " + calculadora.restar(3, 2));
        System.out.println("Resta de enteros 3.2 y 2.2 = " + calculadora.restar(3.2, 2.2));
        System.out.println("Producto de enteros 3 y 2 = " + calculadora.multiplicar(3, 2));
        System.out.println("Productos de dobles 3.5 y 2.5 = " + calculadora.multiplicar(3.5, 2.5));
        System.out.println("División de enteros 3 y 2 = " + calculadora.dividir(3, 2));
        System.out.println("División de dobles 3.5 y 2.5 = " + calculadora.dividir(3.5, 2.5));
    }
}
