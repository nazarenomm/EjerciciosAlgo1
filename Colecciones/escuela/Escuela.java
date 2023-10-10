package escuela;

import java.util.List;
import java.util.Set;

public class Escuela {

    List<Estudiante> estudiantes;
    Set<Materia> materias;

    public Escuela(List<Estudiante> estudiantes, Set<Materia> materias) {
        this.estudiantes = estudiantes;
        this.materias = materias;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public Set<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    
}
