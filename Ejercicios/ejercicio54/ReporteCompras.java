package ejercicio54;

public class ReporteCompras extends Reporte implements Imprimible {
    private String formato;

    //metodos propios

    @Override
    public void imprimir(){
        System.out.println("se imprime");
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
