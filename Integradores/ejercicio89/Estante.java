package ejercicio89;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Estante {
    
    private Map<Libro, Integer> librosIndices;

    public Estante() {
        this.librosIndices = new LinkedHashMap<>();
    }

    public void agregarLibro(Libro libro) {
        this.librosIndices.put(libro, librosIndices.size());
    }

    public Set<Libro> getLibros() {
        return librosIndices.keySet();
    }
    
    public Map<Libro, Integer> getLibrosIndices() {
        return librosIndices;
    }
    
}
