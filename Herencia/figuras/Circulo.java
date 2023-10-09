package figuras;

public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio, String nombre) {
        this.radio = radio;
        this.nombre = nombre;
    }

    public double calcularArea() {
        return (Math.PI * (radio * radio));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
