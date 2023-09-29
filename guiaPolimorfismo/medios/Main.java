package medios;

public class Main {
    public static void main(String[] args) {
        Libro gatsby = new Libro("El Gran Gatsby", "F. Scott");
        Pelicula lalaland = new Pelicula("La La Land", "Damien Chazelle");
        Musica bohemian = new Musica("Bohemian Rapsody", "Queen");
        Medio[] medios = {gatsby, lalaland, bohemian};

        for (Medio medio : medios) {
            medio.reproducir();
        }
    }
    
}
