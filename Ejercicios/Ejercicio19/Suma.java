package Ejercicio19;

public class Suma {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static float sumar(float a, float b) {
        return a + b;
    }

    public static Complejo sumar(Complejo c1, Complejo c2) {
        float r = c1.getA() + c2.getA();
        float i = c1.getB() + c2.getB();
        return new Complejo(r, i);
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(a + " + " + b + " = " + sumar(a,b));
        float c = (float) 4.5;
        float d = (float) 2.3;
        System.out.println(c + " + " + d + " = " + sumar(c,d));
        Complejo c1 = new Complejo(3, 2);
        Complejo c2 = new Complejo(1, -1);
        System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" +  " = " + sumar(c1,c2));
        System.out.println("(" + c1 + ")" + " x " + "(" + c2 + ")" +  " = " + c1.multiplicar(c2));
    }
}
