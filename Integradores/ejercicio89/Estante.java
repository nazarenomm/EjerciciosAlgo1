package ejercicio89;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Estante {
    
    private List<Libro> libros;

    public Estante() {
        this.libros = new ArrayList<>();
    }

    public Estante(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void eliminarLibro(Libro libroTarget) {
        boolean eliminado = false;
        for (Libro libro : libros) {
            if (libro.equals(libroTarget)) {
                this.libros.remove(libro);
                eliminado = true;
            }
        }
        if (!eliminado) throw new IllegalArgumentException("El libro no está en el estante");
    }

    public void reorganizarLibros(Libro[] nuevoOrden) {
        if (nuevoOrden.length != libros.size()) {
            throw new IllegalArgumentException("El nuevo orden debe tener la misma cantidad de libros que la estantería");
        }
        libros.clear();
        for (Libro libro : nuevoOrden) {
            libros.add(libro);
        }
    }

    public void reorganizarLibros(List<Libro> nuevoOrden) {
        Libro[] nuevoOrdenArray = (Libro[]) nuevoOrden.toArray();
        reorganizarLibros(nuevoOrdenArray);
    }

    public double edadPromedioLibros() {
        Year año = Year.now();
        int añoActual = año.getValue();
        
        int suma = 0;
        for (Libro libro : libros) {
            suma += añoActual - libro.getAñoPublicacion();
        }
        return suma/libros.size();
    }

    
}
