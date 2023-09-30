package Ejercicio21;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public boolean esMayorA(Fecha fecha) {
        if (this.año > fecha.año) {
            return true;
        }
        else if (this.año == fecha.año) {
            if (this.mes > fecha.mes) {
                return true;
            }
            else if (this.mes == fecha.mes) {
                if (this.dia > fecha.dia) {
                    return true;
                }
                else { 
                    return false;
                }
            }
            else {
                return false;
            } 
            }
            else {
                return false;
            }
        }


    @Override
    public String toString() {
        return (dia + "/" + mes + "/" + año);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public static void main(String[] args) {
        Fecha hoy = new Fecha(29, 9, 2023);
        Fecha otraFecha = new Fecha(29, 9, 2024);
        System.out.println(hoy + "es después de " + otraFecha + "?: " + hoy.esMayorA(otraFecha));
    }
    
}
