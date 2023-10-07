package Ejercicio34;

public class Fraccion extends Numero{
    private int numerador;
    private int denominador;
    
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public void mostrar() {
        System.out.println(this.numerador + "/" + this.denominador);
    }

    @Override
    public Numero suma(Numero num) {
        if (num instanceof Fraccion) {
            Fraccion fr = (Fraccion) num;
            int numSuma = (this.numerador * fr.denominador) + (this.denominador * fr.numerador);
            int denSuma = this.denominador * fr.denominador;
            return new Fraccion(numSuma, denSuma);
        } else {
            return null;
        }
    }

    @Override
    public Numero producto(Numero num) {
        if (num instanceof Fraccion) {
            Fraccion fr = (Fraccion) num;
            int numProducto = this.numerador * fr.numerador;
            int denProducto = this.denominador * fr.denominador;
            return new Fraccion(numProducto, denProducto);
        } else {
            return null;
        }
    }
}