package figuras;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2, "Circulo de radio 2");
        Rectangulo rectangulo = new Rectangulo(2, 3, "Rectangulo 2x3");

        System.out.println("Un " + circulo.getNombre() + " tiene un area de " + circulo.calcularArea());
        System.out.println("El " + rectangulo.getNombre() + " tiene un area de " + rectangulo.calcularArea());
    }
    
}
