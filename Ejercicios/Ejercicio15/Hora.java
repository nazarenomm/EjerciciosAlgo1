package Ejercicio15;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Hora() {
        this(0, 0, 0);
    }
    @Override
    public String toString() {
        return horas + ":" + minutos + ":" + segundos;
    }

    public Hora sumar(Hora hora) {
        int horasRes;
        int minutosRes;
        int segundosRes;

        if (hora.horas + this.horas >= 24) {
            horasRes =  hora.horas + this.horas - 24; 
        } else horasRes = hora.horas + this.horas;

        if (hora.minutos + this.minutos >= 60) {
            horasRes += 1;
            minutosRes = hora.minutos + this.minutos - 60;
        } else minutosRes = hora.minutos + this.minutos;

        if (hora.segundos + this.segundos >= 60) {
            minutosRes += 1;
            segundosRes = hora.segundos + this.segundos - 60;
        } else segundosRes = hora.segundos + this.segundos;

        return new Hora(horasRes, minutosRes, segundosRes);
    }


    public Hora sumarReemplazar(Hora hora) {
        int horasRes;
        int minutosRes;
        int segundosRes;

        if (hora.horas + this.horas >= 24) {
            horasRes =  hora.horas + this.horas - 24; 
        } else horasRes = hora.horas + this.horas;

        if (hora.minutos + this.minutos >= 60) {
            horasRes += 1;
            minutosRes = hora.minutos + this.minutos - 60;
        } else minutosRes = hora.minutos + this.minutos;

        if (hora.segundos + this.segundos >= 60) {
            minutosRes += 1;
            segundosRes = hora.segundos + this.segundos - 60;
        } else segundosRes = hora.segundos + this.segundos;
        
        this.setHoras(horasRes);
        this.setMinutos(minutosRes);
        this.setSegundos(segundosRes);
        return this;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    
}
