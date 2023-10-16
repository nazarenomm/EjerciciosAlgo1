package ejercicio53;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Formula {
    private List<Componente> componentes;

    public Formula(List<Componente> componentes) {
        this.componentes = componentes;
        Collections.sort(this.componentes);
    }

    public void mostrar() {
        for (Componente componente : componentes) {
            System.out.println(componente.getNombre());
        }
    }

    public static void main(String[] args) {
        Componente h = new Componente("H");
        Componente c = new Componente("C");
        Componente a = new Componente("A");
        Componente z = new Componente("Z");

        List<Componente> componentes = new ArrayList<>();
        componentes.add(z);
        componentes.add(a);
        componentes.add(c);
        componentes.add(h);

        System.out.println("Desordenada:");
        for (Componente componente : componentes) {
            System.out.println(componente.getNombre());
        }

        Formula formula = new Formula(componentes);

        System.out.println("Formula:");
        formula.mostrar();
    }
}
