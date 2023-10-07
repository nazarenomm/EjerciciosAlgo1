package Ejercicio34;

public class Vector extends Numero {
    private double a;
    private double b;

    public Vector(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Numero suma(Numero num) {
        if (num instanceof Vector) {
            Vector vector = (Vector) num;
            double aSuma = vector.a + this.a;
            double bSuma = vector.b + this.b;
            return new Vector(aSuma, bSuma);
        } else {
            return null;
        }
    }

    @Override
    public Numero producto(Numero num) {
        if (num instanceof Vector) {
            Vector vector = (Vector) num;
            double produ = (vector.a * this.a) + (vector.b * this.b);
            return new Vector(produ, 0.0); // medio raro esto
        } else {
            return null;
        }
    }

    @Override
    public void mostrar() {
        System.out.println("(" + this.a + ", " + this.b + ")");
    }
}
