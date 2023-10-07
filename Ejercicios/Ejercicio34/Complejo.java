package Ejercicio34;

public class Complejo extends Numero {
    private float a;
    private float b;

    public Complejo(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void mostrar() {
        if (b>=0) {
            System.out.println(a + " + " + b + "i");
        } else {
            System.out.println(a + " - " + -1*b + "i");
        }
    }

    public Numero producto(Numero num) {
        if (num instanceof Complejo){
            Complejo comp = (Complejo) num;
            float real = (this.a * comp.a) - (this.b * comp.b);
            float i = (this.a * comp.b) + (this.b * comp.a);
            return new Complejo(real, i);
        } else {
            return null;
        }
    }

    @Override
    public Numero suma(Numero num) {
        if (num instanceof Complejo) {
            Complejo comp = (Complejo) num;
            float r = this.a + comp.a;
            float i = this.b + comp.b;
            return new Complejo(r, i);
        } else {
            return null;
        }
    }
}
