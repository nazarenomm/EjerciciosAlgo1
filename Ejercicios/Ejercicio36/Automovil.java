package Ejercicio36;

public class Automovil {
    
    protected boolean habilitado;
    protected boolean permiso;

    public Automovil(boolean habilitado, boolean permiso) {
        this.habilitado = habilitado;
        this.permiso = permiso;
    }

    public Automovil(){
        this.habilitado = false;
        this.permiso = false;
    }

    public void habilitar() {
        this.habilitado = true;
    }

    public void conseguirPermiso() {
        this.permiso = true;
    }

    public boolean estaHabilitado() {
        return habilitado;
    }

    public boolean tienePermiso() {
        return permiso;
    }
    
}
