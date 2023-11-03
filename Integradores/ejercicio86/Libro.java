package ejercicio86;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Libro {
    
    private Map<Capitulo, Integer> indiceCapitulos;   //titulo de cap y su pagina inicial

    public Libro() {
        this.indiceCapitulos = new LinkedHashMap<>();
    }

    public Set<String> titulosCapitulos() {
        Set<String> titulos = new LinkedHashSet<>();
        for (Capitulo capitulo : this.indiceCapitulos.keySet()) {
            String titulo = capitulo.getTitulo();
            titulos.add(titulo);
        }
        return titulos;
    }

    public int cantPaginas() {
        int cantidad = 0;
        for (Capitulo capitulo : indiceCapitulos.keySet()) {
            cantidad += capitulo.cantPaginas();
        }
        return cantidad;
    }
}
