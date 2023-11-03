package ejercicio89;

public class Libro {
    
    private String titulo;
    private String autor;
    private String editorial;
    private int añoPublicacion;

    @Override
    public boolean equals(Object otro) {
        if (this == otro) return true;

        if (this.getClass() != otro.getClass()) return false;

        Libro otro2 = (Libro) otro;
        return this.titulo == otro2.getTitulo() && this.autor == otro2.getAutor()
                && this.editorial == otro2.getEditorial() && this.añoPublicacion == otro2.getAñoPublicacion();
    }

    @Override
    public int hashCode() {
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

}
