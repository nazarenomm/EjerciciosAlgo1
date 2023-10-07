package Ejercicio32;

public class Libro extends Publicacion {
    private int numPaginas;
    private int añoPublicacion;

    public Libro(String titulo, double precio, int numPaginas, int añoPublicacion) {
        super(titulo, precio);
        this.numPaginas = numPaginas;
        this.añoPublicacion = añoPublicacion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
    @Override
    public String toString() {
        return this.getTitulo() + ", " + "año: " + this.añoPublicacion + ", precio: " + this.getPrecio();
    }
    
}
