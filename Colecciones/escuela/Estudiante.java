package escuela;

public class Estudiante {

    private String nombre;
    private int matricula;
    private int edad;
    private HistoriaAcademica historiaAcademica;

    public Estudiante(String nombre, int matricula, int edad, HistoriaAcademica historiaAcademica) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.historiaAcademica = historiaAcademica;
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }

        if (otro == null || this.getClass() != otro.getClass()) {
            return false;
        }

        Estudiante otro2 = (Estudiante) otro;
        return this.matricula == otro2.getMatricula();
    }

    @Override
    public int hashCode() {
        int result = 17; // Número primo inicial
        result = 31 * result + matricula; // Usar código para calcular el hashCode
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public HistoriaAcademica getHistoriaAcademica() {
        return historiaAcademica;
    }

    public void setHistoriaAcademica(HistoriaAcademica historiaAcademica) {
        this.historiaAcademica = historiaAcademica;
    }

    
}
