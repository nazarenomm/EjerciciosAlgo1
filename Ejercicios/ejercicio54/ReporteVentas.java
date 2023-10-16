package ejercicio54;

public class ReporteVentas extends Reporte implements Imprimible, Customizable{
    private String formato;

    //metodos propios

    @Override
    public void imprimir(){
        System.out.println("se imprime");
    }

    @Override
    public void cambiarColorFondo(String color){
        System.out.println("se cambia el color del fondo a " + color);
    }

    @Override
    public void cambiarColorLetra(String color) {
        System.out.println("se cambia el color de la letra a " + color);
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
}
