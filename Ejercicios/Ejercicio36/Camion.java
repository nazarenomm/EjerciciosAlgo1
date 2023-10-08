package Ejercicio36;

public class Camion extends Automovil {

    private boolean autorizacion;

    public Camion(boolean habilitado, boolean permiso, boolean autorizacion) {
        super(habilitado, permiso);
        this.autorizacion = autorizacion;
    }

    public Camion(boolean autorizacion) {
        this.autorizacion = autorizacion;
    }

    @Override
    public void conseguirPermiso() {
        if (autorizacion) {
            this.permiso = true;
        } else {
            System.out.println("No tiene autorización de la concesionaria");
            this.permiso = false;
        }
    }

    @Override
    public void habilitar() {
        if (permiso) {
            this.habilitado = true;
        } else {
            System.out.println("Aun no tiene permiso");
            this.habilitado = false;
        }
    }
    

    public boolean tieneAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(boolean autorizacion) {
        this.autorizacion = autorizacion;
    }
    
}
