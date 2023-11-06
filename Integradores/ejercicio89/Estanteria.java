package ejercicio89;

import java.util.ArrayList;
import java.util.List;

import Ejercicio43.Par;

public class Estanteria {
    
    private List<Estante> estantes;

    public Estanteria(int cantEstantes, int cantidadLibros) {}

    public void agregarEstante(Estante estante) {
        this.estantes.add(estante);
    }

    public Par<Estante, Integer> buscarLibro(Libro libroBuscado) {
        Estante estanteBuscado = null;
        int indiceLibro = -1;
        for (Estante estante : estantes) {
            for (Libro libro : estante.getLibros()) {
                if (libro.equals(libroBuscado)) {
                    estanteBuscado = estante;
                    indiceLibro = estante.getLibros().indexOf(libro);
                }
            }
        }
        return new Par<>(estanteBuscado, indiceLibro);
    }

    public void eliminarLibro(Libro libroTarget) {
        for (Estante estante : estantes) {
            for (Libro libro : estante.getLibros()) {
                if (libro.equals(libroTarget)) {
                    estante.eliminarLibro(libro);
                }
            }
        }
    }

    public void eliminarLibro(int indiceEstante, int indiceLibro) {
        Estante estante = this.estantes.get(indiceEstante);
        Libro libro = estante.getLibros().get(indiceLibro);
        estante.eliminarLibro(libro);
    }

    public List<Libro> listarLibros(int indiceEstante) {
        Estante estante = this.estantes.get(indiceEstante);
        return estante.getLibros();
    }

    public List<Libro> listaLibros(Estante estante) {
        return estante.getLibros();
    }

    public void reorganizarLibros(Libro[] nuevoOrden, Estante estante) {
        estante.reorganizarLibros(nuevoOrden);
    }

    public void reorganizarLibros(Libro[] nuevoOrden, int indiceEstante) {
        Estante estante =this.estantes.get(indiceEstante);
        this.reorganizarLibros(nuevoOrden, estante);
    }

    public void reorganizarLibros(List<Libro> nuevoOrden, Estante estante) {
        Libro[] nuevoOrdenArray = (Libro[]) nuevoOrden.toArray();
        this.reorganizarLibros(nuevoOrdenArray, estante);
    }

    public void reorganizarLibros(List<Libro> nuevoOrden, int indiceEstante) {
        Estante estante = this.estantes.get(indiceEstante);
        this.reorganizarLibros(nuevoOrden, estante);
    }

    public double edadPromedioLibros(Estante estante) {
        return estante.edadPromedioLibros();
    }

    public double edadPromedioLibros(int indiceEstante) {
        Estante estante = this.estantes.get(indiceEstante);
        return this.edadPromedioLibros(estante);
    }

    public List<Libro> listarLibrosAutor(String autor) {
        List<Libro> librosDelAutor = new ArrayList<>();
        for (Estante estante : estantes) {
            for (Libro libro : estante.getLibros()) {
                if (libro.getAutor().equals(autor)) {
                    librosDelAutor.add(libro);
                }
            }
        }
        return librosDelAutor;
    }
}
