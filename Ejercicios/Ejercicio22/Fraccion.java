package Ejercicio22;

public class Fraccion {
    private int numerador;
    private int denominador;
    
    public Fraccion(int numerador, int denominador) throws DenominadorIgualACeroException {
        if (denominador == 0) throw new DenominadorIgualACeroException();
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

    public static Fraccion sumar(Fraccion fr1, Fraccion fr2) {
        int num = (fr1.numerador * fr2.denominador) + (fr1.denominador * fr2.numerador);
        int den = (fr1.denominador * fr2.denominador); 
        try {
            return new Fraccion(num, den);
        } catch (DenominadorIgualACeroException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static Fraccion restar(Fraccion fr1, Fraccion fr2) {
        int num = (fr1.numerador * fr2.denominador) - (fr1.denominador * fr2.numerador);
        int den = (fr1.denominador * fr2.denominador); 
        try {
            return new Fraccion(num, den);
        } catch (DenominadorIgualACeroException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static Fraccion multiplicar(Fraccion fr1, Fraccion fr2) {
        int num = fr1.numerador * fr2.numerador;
        int den = fr1.denominador * fr2.denominador;
        try {
            return new Fraccion(num, den);
        } catch (DenominadorIgualACeroException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static Fraccion dividir(Fraccion fr1, Fraccion fr2) {
        int num = fr1.numerador * fr2.denominador;
        int den = fr1.denominador * fr2.numerador;
        try {
            return new Fraccion(num, den);
        } catch (DenominadorIgualACeroException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Fraccion fr1 = new Fraccion(2,3);
            Fraccion fr2 = new Fraccion(3,5);
            Fraccion suma = sumar(fr1, fr2);
            System.out.println(fr1 + " + " + fr2 + " = " + suma);

            Fraccion resta = restar(fr1, fr2);
            System.out.println(fr1 + " - " + fr2 + " = " + resta);

            Fraccion multiplicacion = multiplicar(fr1, fr2);
            System.out.println(fr1 + " * " + fr2 + " = " + multiplicacion);

            Fraccion division = dividir(fr1, fr2);
            System.out.println("(" + fr1 + ")" + " / " 
                            + "( " + fr2 + ")" + " = " + division);
        } catch (DenominadorIgualACeroException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
