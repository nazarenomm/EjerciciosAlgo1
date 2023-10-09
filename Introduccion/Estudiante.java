

//agregar setters

public class Estudiante {

    private String nombre;
    private int edad;
    private String carrera;
    private String[] materias;

    public Estudiante(String nombre, int edad, String carrera, String[] materias){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.materias = materias;
    }

    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(nombre).append("\n");
        info.append("Edad: ").append(edad).append("\n");
        info.append("Carrera: ").append(carrera).append("\n");
        info.append("Materias:\n");
        for (String materia : materias) {
            info.append("- ").append(materia).append("\n");
        }
        return info.toString();
    }
    public static void main(String[] args){
        String[] materias = {"Algoritmos", "Infra", "Proba"};
        Estudiante naza = new Estudiante("Nazareno Magallanes", 24, "LCD", materias);
        System.out.println(naza.toString());
    }
    
}
