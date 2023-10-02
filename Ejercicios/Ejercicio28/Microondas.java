package Ejercicio28;

public class Microondas {

    private boolean puertaAbierta;
    private boolean vacio;
    private String contenido;
    private boolean encendido;
    private int puntoCoccion;

    public Microondas() {
        this.puertaAbierta = false;
        this.vacio = true;
        this.encendido = false;
        this.contenido = null;
    }

    public void abrirPuerta() {
        if (!encendido) {
            this.puertaAbierta = true;
        } else {
            System.out.println("El microondas está encendido, no se puede abrir la puerta");
        }
    }

    public void cerrarPuerta() {
        this.puertaAbierta = false;
    }

    public void insertarComida(String comida) {
        if (puertaAbierta && vacio) {
            this.vacio = false;
            this.contenido = comida;
        } else if (puertaAbierta) {
            System.out.println("El microondas no está vacío");
        } else if (vacio) {
            System.out.println("La puerta está cerrada");
        }
    }

    public void retirarComida() {
        if (puertaAbierta && !vacio) {
            System.out.println("Retiro " + this.contenido);
            this.vacio = true;
            this.contenido = null;
        } else if (!puertaAbierta) {
            System.out.println("La puerta está cerrada");
        } else if (vacio) {
            System.out.println("No hay comida para retirar");
        }
    }

    public void iniciarCoccion(int intensidad, int segundos) {
        if (!puertaAbierta && !vacio) {
            this.encendido = true;
            this.puntoCoccion = intensidad * segundos;
            System.out.println("Cocinando...");
        } else if (!puertaAbierta) {
            System.out.println("La puerta está cerrada");
        } else if (!vacio) {
            System.out.println("El microondas no está vacío");
        }
    }

    public void finalizarCoccion() {
        if (this.encendido) {
            System.out.println("Cocción finalizada");
            this.encendido = false;
            this.contenido = this.contenido + ", punto de cocción: " + this.puntoCoccion;
        } else {
            System.out.println("El microondas está apagado");
        }
    }

    
}
