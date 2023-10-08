package Ejercicio36;

public class AutoMediano extends Automovil {

    public AutoMediano() {
        super();
    }

    public AutoMediano(boolean habilitado, boolean permiso) {
        super(habilitado, permiso);
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
}
