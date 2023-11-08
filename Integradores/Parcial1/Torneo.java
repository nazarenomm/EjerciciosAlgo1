package Parcial1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Torneo {
    
    private List<Equipo> equipos;


    public Torneo() {
        this.equipos = new ArrayList<>();
    }

    public void cargarEquipo(String nombreEquipo, int cantidadFans) {
        Equipo equipo = new Equipo(nombreEquipo, cantidadFans);
        this.equipos.add(equipo);
    }

    public void cargarPartido(String equipoLocal, String equipoVisitante, LocalDate fecha, int golesLocal, int golesVisitante) {
        boolean localEncontrado = false;
        boolean visitanteEncontrado = false;
        Equipo local = null;  //:(
        Equipo visitante = null;
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(equipoLocal)) {
                localEncontrado = true;
                local = equipo;
                }
            if (equipo.getNombre().equals(equipoVisitante)) {
                visitanteEncontrado = true;
                visitante = equipo;
            }
        }

        if (!(localEncontrado && visitanteEncontrado)) {
            throw new IllegalArgumentException("Un equipo no participa del torneo");
        }

        local.jugarPartido(golesLocal, golesVisitante);
        visitante.jugarPartido(golesVisitante, golesLocal);
    }

    public mostrarPartidosFecha(LocalDate fecha) {

    }

    public void mostrarTablaPosiciones() {
        System.out.println("Equipo  | Pts | PJ | PG | PE | PP | GF | GC | DG |");
        Collections.sort(equipos, Collections.reverseOrder());
        for (Equipo equipo : equipos) {
            System.out.println(equipo.printData(" |  "));
        }
    }

    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        torneo.cargarEquipo("Arsenal ", 1000);
        torneo.cargarEquipo("Boca Jrs", 20000000);
        torneo.cargarEquipo("Colón SF", 30000);
        torneo.cargarEquipo("Defensa ", 4000);
        torneo.cargarEquipo("Estudian", 500000);
        torneo.cargarEquipo("Ferro CO", 60000);
        torneo.cargarEquipo("Gimnasia", 400000);
        torneo.cargarEquipo("Huracán ", 500000);

        torneo.cargarPartido("Arsenal ", "Boca Jrs", LocalDate.of(2023, 11, 8), 1, 3);
        torneo.cargarPartido("Colón SF", "Defensa ", LocalDate.of(2023, 11, 8), 2, 1);
        torneo.cargarPartido("Estudian", "Ferro CO", LocalDate.of(2023, 11, 8), 3, 0);
        torneo.cargarPartido("Gimnasia", "Huracán ", LocalDate.of(2023, 11, 8), 1, 1);

        torneo.mostrarTablaPosiciones();
    }
}
