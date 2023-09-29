package copiaProfunda;

class Persona implements Cloneable {
    private String nombre;
    private int edad;
    private Documento documento;

    private Persona() {}

    public Persona(Persona original) {
        this.setNombre(original.getNombre());
        this.setEdad(original.getEdad());
        this.documento = new Documento(0);
        this.setNroDocumento(original.documento.getNumero());
    }

    public static Persona copiaProfunda(Persona original) {
        Persona nuevo = new Persona();
        nuevo.setNombre(original.getNombre());
        nuevo.setEdad(original.getEdad());
        nuevo.documento = new Documento(0);
        nuevo.setNroDocumento(original.documento.getNumero());
        return nuevo;
    }

    public Persona(String nombre, int edad, int nroDocumento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = new Documento(nroDocumento);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNroDocumento(int nroDocumento) {
        this.documento.setNumero(nroDocumento);
    }

    @Override
    public String toString() {
        return this.nombre + ", " + this.edad + ", " + this.documento.getNumero();
    }

    @Override
    public Persona clone() {
        try {
            Persona copia = (Persona) super.clone();    // Copia superficial de persona
            copia.documento = this.documento.clone();   // Copia profunda de Documento
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Persona copiaSuperficial() {
        Persona copia = new Persona();
        copia.nombre = this.nombre;
        copia.edad = this.edad;
        copia.documento = this.documento;   // Se asigna la misma referencia original
        return copia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    
}
