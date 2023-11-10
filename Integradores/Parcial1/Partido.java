package Parcial1;

import java.time.LocalDate;

public class Partido {
    private Equipo local;
    private Equipo visitante;
    private int golesLocal;
    private int golesVisitante;
    private LocalDate fecha;

    public Partido(Equipo local, Equipo visitante, int golesLocal, int golesVisitante, LocalDate fecha) {
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.fecha = fecha;
    }

    public void jugar() {
        local.meterGoles(golesLocal);
        local.recibirGoles(golesVisitante);
        visitante.meterGoles(golesVisitante);
        visitante.recibirGoles(golesLocal);

        if (golesLocal > golesVisitante) {
            local.ganar();
            visitante.perder();
        }
        if (golesLocal < golesVisitante) {
            local.perder();
            visitante.ganar();
        }
        if (golesLocal == golesVisitante) {
            local.empatar();
            visitante.empatar();
        }
    }

    public void mostrar() {
        System.out.println("Fecha: " + fecha.toString() + ", " + local.getNombre() + " (" 
                + golesLocal + ") - " + visitante.getNombre() + " (" + golesVisitante + ")");
    }

    public LocalDate getFecha() {
        return this.fecha;
    }
}
