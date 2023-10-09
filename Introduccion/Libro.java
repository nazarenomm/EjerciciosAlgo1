

import java.time.LocalDate;

public class Libro {
    
    String titulo;
    String autor;
    int anioPublicacion;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = LocalDate.now().getYear();
    }

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Titulo: ").append(this.titulo).append("\n");
        info.append("Autor: ").append(this.autor).append("\n");
        info.append("Año de Publicacion: ").append(this.anioPublicacion).append("\n");
        return info.toString();
    }

    public static void main(String[] args){

        Libro libro1 = new Libro("Mucho después de medianoche","Ray Bradbury");
        Libro libro2 = new Libro("El Resplandor","Stephen King", 1977);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
    }

}