package Parcial1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Ejercicio43.Par;

public class Torneo {
    
    private List<Equipo> equipos;
    private List<Par<LocalDate, String>> partidosFecha;

    public Torneo() {
        this.equipos = new ArrayList<>();
        this.partidosFecha = new ArrayList<>();
    }

    public void cargarEquipo(String nombreEquipo, int cantidadFans) {
        Equipo equipo = new Equipo(nombreEquipo, cantidadFans);
        this.equipos.add(equipo);
    }

    public void cargarPartido(String local, String visitante, LocalDate fecha, int golesLocal, int golesVisitante) {
        if (equipos.size() < 2) {
            throw new IllegalArgumentException("Equipos insuficientes");
        }
        boolean encontrados = false;
        for (Equipo equipoLocal : this.equipos) {
            if (equipoLocal.getNombre().equals(local)) {
                for (Equipo equipoVisitante : this.equipos) {
                    if(equipoVisitante.getNombre().equals(visitante)) {
                        encontrados = true;
                        equipoLocal.jugarPartido(golesLocal, golesVisitante);
                        equipoVisitante.jugarPartido(golesVisitante, golesLocal);
                        String partido = "Fecha: " + fecha.toString() + ", " + local + " (" + golesLocal + ")" + " - " + visitante + " (" + golesVisitante + ")";
                        partidosFecha.add(new Par<LocalDate,String>(fecha, partido));
                    }
                }
            }
        }
        if (!encontrados) {
            throw new IllegalArgumentException("Equipo no encontrado");
        }
    }

    public void mostrarPartidosFecha(LocalDate fecha) {
        boolean encontrado = false;
        for (Par<LocalDate,String> partido : partidosFecha) {
            if (partido.getA().equals(fecha)) {
                System.out.println(partido.getB());
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new IllegalArgumentException("Fecha no encontrada");
        }
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

        torneo.mostrarPartidosFecha(LocalDate.of(2023, 11, 8));
        System.out.println();
        torneo.mostrarTablaPosiciones();
    }
}
