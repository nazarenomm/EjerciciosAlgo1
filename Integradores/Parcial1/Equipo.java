package Parcial1;

public class Equipo implements Comparable<Equipo>{
    private String nombre;
    private int fans;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int partidosGanados;
    private int golesAFavor;
    private int golesEnContra;


    public Equipo(String nombre, int fans) {
        this.nombre = nombre;
        this.fans = fans;
    }

    public void mostrarEnTabla(String sep) {
        int partidosJugados = partidosEmpatados + partidosGanados + partidosPerdidos;
        int puntos = partidosGanados*3 + partidosEmpatados;
        int difGol = golesAFavor - golesEnContra;
        
        System.out.println(nombre + sep + partidosJugados + sep + puntos + sep + partidosGanados + sep +
            partidosEmpatados + sep + partidosPerdidos + sep + golesAFavor + sep + golesEnContra + sep + difGol + sep);
    }

    public String getNombre() {
        return nombre;
    }

    public int getFans() {
        return fans;
    }

    public void perder() {
        this.partidosPerdidos += 1;
    }

    public void empatar() {
        this.partidosEmpatados += 1;
    }

    public void ganar() {
        this.partidosGanados += 1;
    }

    public void meterGoles(int golesAFavor) {
        this.golesAFavor += golesAFavor;
    }

    public void recibirGoles(int golesEnContra) {
        this.golesEnContra += golesEnContra;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    @Override
    public int compareTo(Equipo equipo) {
        int puntos = partidosGanados*3 + partidosEmpatados;
        int puntosEquipo = equipo.getPartidosGanados()*3 + equipo.getPartidosEmpatados();
        int difGol = golesAFavor - golesEnContra;
        int difGolEquipo = equipo.getGolesAFavor() - equipo.getGolesEnContra();

        if (!(puntosEquipo == puntos)) {
            return puntos - puntosEquipo;
        } else if (!(difGol == difGolEquipo)){
            return difGol - difGolEquipo;
        } else {
            return golesAFavor - equipo.getGolesAFavor();
        }
    }

    @Override
    public boolean equals(Object otro) {
        if (this==otro) return true;
        if (this.getClass() != otro.getClass()) return false;

        Equipo otroEquipo = (Equipo) otro;
        return this.nombre.equals(otroEquipo.getNombre()) && this.fans == otroEquipo.getFans();
    }

}
