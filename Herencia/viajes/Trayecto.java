package viajes;

public class Trayecto {
    private String origen;
    private String destino;
    private double distancia;
    private int cantEstaciones;

    public Trayecto(String origen, String destino, double distancia, int cantEstaciones) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.cantEstaciones = cantEstaciones;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public int getCantEstaciones() {
        return this.cantEstaciones;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setCantEstaciones(int cantEstaciones) {
        this.cantEstaciones = cantEstaciones;
    }
    
}