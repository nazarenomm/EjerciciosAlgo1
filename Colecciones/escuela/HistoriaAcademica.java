package escuela;

import java.util.Map;
import java.util.Set;

public class HistoriaAcademica {

    private Map<Materia, Set<Double>> map;

    public HistoriaAcademica(Map<Materia, Set<Double>> map) {
        this.map = map;
    }

    public double promedio(Materia materia) {
        Set<Double> calificaciones = map.get(materia);
        Double suma = 0.0;
        for (Double nota : calificaciones) {
            suma += nota;
        }

        return suma / calificaciones.size();
    }

    public int aplazos() {
        int aplazos = 0;
        for (Materia materia : map.keySet()) {
            double promedio = promedio(materia);
            if (promedio < 2) {
                aplazos += 1;
            }
        }
        return aplazos;
    }

    // public int aplazos() {
    //     int aplazos = 0;
    //     for (Set<Double> calificaciones : map.values()) {
    //         for (Double nota : calificaciones) {
    //             if (nota < 2) {
    //                 aplazos += 1;
    //             }
    //         }
    //     }
    //     return aplazos;
    // }

    public int cantidadMaterias() {
        return map.keySet().size();
    }

    public Map<Materia, Set<Double>> getMap() {
        return map;
    }

    public void setMap(Map<Materia, Set<Double>> map) {
        this.map = map;
    }
    
}
