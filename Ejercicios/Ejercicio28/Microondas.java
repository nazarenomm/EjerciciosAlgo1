package Ejercicio28;

public class Microondas {

    private boolean puertaAbierta;
    private boolean vacio;
    private String contenido;
    private boolean encendido;
    private int segundos;
    private int intensidad;

    public Microondas() {
        this.puertaAbierta = false;
        this.vacio = true;
        this.encendido = false;
        this.contenido = null;
    }

    public void abrirPuerta() {
        if (!encendido) {
            this.puertaAbierta = true;
            System.out.println("Se abre la puerta");
        } else {
            System.out.println("El microondas está encendido, no se puede abrir la puerta");
        }
    }

    public void cerrarPuerta() {
        this.puertaAbierta = false;
        System.out.println("Se cierra la puerta");
    }

    public void insertarComida(String comida) {
        if (puertaAbierta && vacio) {
            this.vacio = false;
            this.contenido = comida;
            System.out.println("Pongo " + comida + " en el microondas");
        } else if (vacio) {
            System.out.println("El microondas no está vacío");
        } else if (!puertaAbierta) {
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
            this.intensidad = intensidad;
            this.segundos = segundos;
            this.encendido = true;
            System.out.println("Cocinando " + this.contenido);
        } else if (puertaAbierta) {
            System.out.println("La puerta está abierta");
        } else if (vacio) {
            System.out.println("El microondas está vacío");
        }
    }

    public void finalizarCoccion() {
        if (this.encendido) {
            System.out.println("Cocción finalizada");
            this.encendido = false;
            this.contenido = this.contenido + ", punto de cocción: " + (this.intensidad * this.segundos);
        } else {
            System.out.println("El microondas está apagado");
        }
    }

    public void abortarCoccion(int segundosFaltantes) {
        if (segundosFaltantes <= this.segundos) {
            this.segundos -= segundosFaltantes;
            this.finalizarCoccion();
            this.abrirPuerta();
        } else {
            System.out.println("Segundos faltantes inválidos");
        }
    }

    public static void main(String[] args) {
        Microondas microondas = new Microondas();
        microondas.abrirPuerta();
        microondas.insertarComida("Papas");
        microondas.iniciarCoccion(10, 30);
        microondas.cerrarPuerta();
        microondas.iniciarCoccion(10, 30);
        microondas.abortarCoccion(16);
        microondas.retirarComida();
        
    }
}
