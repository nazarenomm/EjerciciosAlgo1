package Ejercicio24;

public class Potencia {

    private double base;
    private int exp;


    public Potencia(double base, int exp) {
        this.base = base;
        this.exp = exp;
    }

    public double evaluar() {
        double resultado = 1; 
        for (int i = 1; i<=exp; i++) {
            resultado *= this.base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Potencia pot = new Potencia(-2, 2);
        System.out.println(pot.evaluar());
    }
}
