package Ejercicio19;

public class Complejo {
    private float a;
    private float b;

    public Complejo(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        if (b>=0) {
            return (a + " + " + b + "i");
        } else {
            return (a + " - " + -1*b + "i");
        }
    }

    public Complejo multiplicar(Complejo otro) {
        float real = (this.a * otro.a) - (this.b * otro.b);
        float i = (this.a * otro.b) + (this.b * otro.a);
        return new Complejo(real, i);
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    
}
