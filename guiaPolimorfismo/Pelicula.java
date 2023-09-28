package guiaPolimorfismo;

public class Pelicula extends Medio {

    private String titulo;
    private String director;

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo " + this.titulo + " dirigida por " + this.director);
    }
    
}
