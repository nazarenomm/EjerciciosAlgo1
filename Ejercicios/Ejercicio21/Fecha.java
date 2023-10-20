package Ejercicio21;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) throws MesFueraDeRangoException, DiaInvalidoException {
        if (mes < 1 || mes > 12) {
            throw new MesFueraDeRangoException();
        } else if (mes == 2 & dia > 28) {
            throw new DiaInvalidoException();
        } else if ((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) & dia > 30) {
            throw new DiaInvalidoException();
        } else if (dia > 31 || dia < 1) {
            throw new DiaInvalidoException();
        } else {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        }
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
        
        Fecha hoy;
        Fecha otraFecha;
        try {
            hoy = new Fecha(30, 2, 2023);
            otraFecha = new Fecha(29, 9, 2024);
            System.out.println(hoy + " es después de " + otraFecha + "?: " + hoy.esMayorA(otraFecha));
        } catch (MesFueraDeRangoException | DiaInvalidoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
