package ejercicio86;

import java.util.List;

public class Capitulo {

    private List<Pagina> paginas;
    private String titulo;

    public int cantPaginas() {
        return paginas.size();
    }

    public String getTitulo() {
        return titulo;
    }

}
