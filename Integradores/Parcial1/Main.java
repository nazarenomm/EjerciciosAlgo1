package Parcial1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        torneo.cargarEquipo("Team A", 100);
        torneo.cargarEquipo("Team B", 100);
        torneo.cargarEquipo("Team C", 100);
        torneo.cargarEquipo("Team D", 100);
        torneo.cargarEquipo("Team E", 100);
        torneo.cargarEquipo("Team F", 100);
        torneo.cargarEquipo("Team G", 100);
        torneo.cargarEquipo("Team H", 100);
        torneo.cargarEquipo("Team H", 100);

        System.out.println();
        torneo.mostrarTabla();
        System.out.println();

        torneo.cargarPartido("Team A", "Team B", 2, 0, LocalDate.of(2023, 11, 10));
        torneo.cargarPartido("Team C", "Team D", 2, 1, LocalDate.of(2023, 11, 10));
        torneo.cargarPartido("Team E", "Team F", 2,2, LocalDate.of(2023, 11, 10));
        torneo.cargarPartido("Team G", "Team H", 2,3, LocalDate.of(2023, 11, 10));
        torneo.cargarPartido("Team Z", "Team H", 2,3, LocalDate.of(2023, 11, 10));

        torneo.cargarPartido("Team B", "Team A", 1, 1, LocalDate.of(2023, 11, 17));
        torneo.cargarPartido("Team D", "Team C", 3, 0, LocalDate.of(2023, 11, 17));
        torneo.cargarPartido("Team F", "Team E", 1,2, LocalDate.of(2023, 11, 17));
        torneo.cargarPartido("Team H", "Team G", 0,0, LocalDate.of(2023, 11, 17));
        
        System.out.println();
        torneo.mostrarPartidosFecha(LocalDate.of(2023, 11, 17));
        System.out.println();
        torneo.mostrarPartidosFecha(LocalDate.of(2023, 11, 16));
        System.out.println();
        torneo.mostrarTabla();
    }
}
