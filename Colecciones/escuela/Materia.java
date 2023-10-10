package escuela;

public class Materia {
    private String nombre;
    private int codigo;
    private boolean estado;

    public Materia(String nombre, int codigo, boolean estado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estado = estado;
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }

        if (otro == null || this.getClass() != otro.getClass()) {
            return false;
        }

        Materia otro2 = (Materia) otro;
        return this.codigo == otro2.getCodigo();
    }

    @Override
    public int hashCode() {
        int result = 17; // Número primo inicial
        result = 31 * result + codigo; // Usar código para calcular el hashCode
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean estado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}