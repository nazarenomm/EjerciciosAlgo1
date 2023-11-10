package Parcial1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// import Parcial1.EquipoInvalidoException;

public class Torneo {
    private List<Partido> partidos;
    private List<Equipo> equipos;

    public Torneo() {
        this.partidos = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }

    public void cargarEquipo(String nombreEquipo, int cantidadFans) {
        try {
            Equipo equipo = new Equipo(nombreEquipo, cantidadFans);
            if (this.equipos.contains(equipo)) throw new EquipoInvalidoException(nombreEquipo);
            this.equipos.add(equipo);
        } catch (EquipoInvalidoException e) {
            System.out.println(e.getMessage() + " ya participa del torneo");
        }
    }

    public void cargarPartido(String nombreLocal, String nombreVisitante, 
                    int golesLocal, int golesVisitante, LocalDate fecha) {
        try {
            Equipo local = null; //TODO: no me gusta
            Equipo visitante = null;

            for (Equipo equipo : equipos) {
                if (equipo.getNombre().equals(nombreLocal)) {
                    local = equipo;
                }
                if (equipo.getNombre().equals(nombreVisitante)) {
                    visitante = equipo;
                }
            }

            if (local == null) throw new EquipoInvalidoException(nombreLocal);
            if (visitante == null) throw new EquipoInvalidoException(nombreVisitante);

            Partido partido = new Partido(local, visitante, golesLocal, golesVisitante, fecha);
            partidos.add(partido);
            partido.jugar();
        } catch (EquipoInvalidoException e) {
            System.out.println(e.getMessage() + " no participa del torneo");
        }
    }

    public void mostrarPartidosFecha(LocalDate fecha) {
        try {
            boolean huboPartido = false;
            for (Partido partido : this.partidos) {
                if (partido.getFecha().equals(fecha)) {
                    partido.mostrar();
                    huboPartido = true;
                }
            }
            if (!huboPartido) throw new IllegalArgumentException("No hubo partidos esa fecha");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarTabla() {
        Collections.sort(equipos, Collections.reverseOrder());
        System.out.println("Equipo  | PJ | Pu | PG | PE | PP | GF | GC | DG |");
        for (Equipo equipo : equipos) {
            equipo.mostrarEnTabla("  | ");
        }
    }
}
