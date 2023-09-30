package Ejercicio23;

public class Ecuacion {
    private double a;
    private double b;
    private double c;
    
    public Ecuacion(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] raices() {
        double sq = b*b - 4*a*c;
        double x1 = (b + Math.sqrt(sq))/(2*a);
        double x2 = (b - Math.sqrt(sq))/(2*a);
        double[] raices = new double[2];
        raices[0] = x1;
        raices[1] = x2;
        return raices;
    }

    @Override
    public String toString() { 
        //String xCuad = "x" + "\u00B2";
        if (b>=0 && c>=0) {
            return a + "x" + "\u00B2" + " + " + b + "x" +" + " + c;
        } else if (b>=0) {
            return a + "x" + "\u00B2" + " + " + b + "x" +" - " + -1*c;
        } else if (c>=0) {
            return a + "x" + "\u00B2" + " - " + -1*b + "x" +" + " + c;
        } else {
            return a + "x" + "\u00B2" + " - " + -1*b + "x" +" - " + -1*c;
        }
    }

    public static void main(String[] args) {
        Ecuacion ec = new Ecuacion(1, 1, -2);
        System.out.println(ec);
        System.out.println("raices: " + ec.raices()[0] + "; " + ec.raices()[1]);
    }
    
}
