package Ejercicio32;

public class Disco extends Publicacion {
    private int minutosDuracion;

    public Disco(String titulo, double precio, int minutosDuracion) {
        super(titulo, precio);
        this.minutosDuracion = minutosDuracion;
    }

    public int getMinutosDuracion() {
        return minutosDuracion;
    }

    public void setMinutosDuracion(int minutosDuracion) {
        this.minutosDuracion = minutosDuracion;
    }

    @Override
    public String toString() {
        return this.getTitulo() + ", duración: " + this.minutosDuracion + ", precio: " + this.getPrecio();
    }
}
