package celda;

public class CeldaBool extends Celda implements Comparable<CeldaBool> {
    private Boolean valor;

    public CeldaBool(Boolean valor) {
        this.valor = valor;
    }

    @Override
    public boolean isNA() {
        return valor == null;
    }

    @Override
    public int compareTo(CeldaBool otraCelda) {
        if (this.isNA()) {
            return -1;
        } else if (otraCelda.isNA()) {
            return 1;
        }

        int valorThis = this.valor ? 1 : 0;
        int valorOtraCelda = otraCelda.getValor() ? 1 : 0;
        if (valorThis > valorOtraCelda) {
            return 1;
        } else if (valorThis < valorOtraCelda) {
            return -1;
        } else return 0;
    }

    public Boolean getValor() {
        return valor;
    }

    public void setValor(Boolean valor) {
        this.valor = valor;
    }
}
