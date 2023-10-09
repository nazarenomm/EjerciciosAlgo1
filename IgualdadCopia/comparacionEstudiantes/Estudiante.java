package comparacionEstudiantes;

public class Estudiante {
    protected String nombre;
    protected int edad;
    protected int matricula;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, int edad, int matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
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
        return this.getMatricula() == otro2.getMatricula();
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public int getMatricula() {
        return matricula;
    }



    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
