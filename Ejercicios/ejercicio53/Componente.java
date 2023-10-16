package ejercicio53;


public class Componente implements Comparable<Componente> {
    private String nombre;

    public Componente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Componente o) {
        if (this.nombre.equals(o.nombre)) {
            return 0;
        } else if (this.nombre.equals("C")) {
            return -1;
        } else if (o.nombre.equals("H")) {
            return 1;
        } else if (o.nombre.equals("C")) {
            return 1;
        } else if (this.nombre.equals("H")) {
            return -1;
        } else {
            return this.nombre.compareTo(o.nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
