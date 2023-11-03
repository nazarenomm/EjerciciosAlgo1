package ejercicio89;

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
                    indiceLibro = estante.getLibrosIndices().get(libro);
                }
            }
        }
        return new Par<>(estanteBuscado, indiceLibro);
    }

    public void eliminarLibro(Libro libro) {
        
    }
}
