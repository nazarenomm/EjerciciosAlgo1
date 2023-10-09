package medios;

public class Musica extends Medio {
    private String titulo;
    private String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo " + this.titulo + " por " + this.artista);
    }
    
}
