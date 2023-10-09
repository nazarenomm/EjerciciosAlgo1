package figuras;

abstract public class Figura {

    protected String nombre;

    abstract protected double calcularArea();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}