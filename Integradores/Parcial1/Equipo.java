package Parcial1;

public class Equipo implements Comparable<Equipo>{
    private String nombre;
    private int cantidadFans;
    private int partidosJugados;
    private int partidosEmpatados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int golesAFavor;
    private int golesEnContra;
    private int diferenciaGol;
    
    public Equipo(String nombre, int cantidadFans) {
        this.nombre = nombre;
        this.cantidadFans = cantidadFans;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void jugarPartido(int goles, int golesRival) {
        this.partidosJugados += 1;
        this.golesAFavor += goles;
        this.golesEnContra += golesRival;
        this.diferenciaGol = this.golesAFavor - this.golesEnContra;

        if (goles > golesRival) {
            this.partidosGanados += 1;
        } else if (goles < golesRival) {
            this.partidosPerdidos += 1;
        } else {
            this.partidosPerdidos += 1;
        }

    }

    public int getCantidadFans() {
        return cantidadFans;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public int getDiferenciaGol() {
        return diferenciaGol;
    }

    public String printData(String separador) {
        int puntos = this.partidosGanados*3 + this.partidosEmpatados;
        return this.nombre + separador + this.partidosJugados + separador + puntos + separador + this.partidosGanados + separador
             + this.partidosEmpatados + separador + this.partidosPerdidos + separador + this.golesAFavor + separador
             + this.golesEnContra + separador + this.diferenciaGol + separador;
    }

    @Override
    public int compareTo(Equipo equipo) {
        int puntos = this.partidosGanados*3 + this.partidosEmpatados;
        int equipoPuntos = equipo.getPartidosGanados()*3 + equipo.getPartidosEmpatados();

        if (puntos > equipoPuntos) {
            return 1;
        } else if (puntos < equipoPuntos) {
            return -1;
        } else if (this.diferenciaGol > equipo.getDiferenciaGol()) {
            return 1;
        } else if (this.diferenciaGol < equipo.getDiferenciaGol()) {
            return -1;
        } else return 0;
    }


}
