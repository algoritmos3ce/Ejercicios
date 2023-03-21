package HerenciaYPolimorfismo.ListaDuplicante.Solucion;

import java.util.ArrayList;

public class ListaDuplicanteHerencia<T> extends ArrayList<T> {
    public boolean add(T elemento) {
        super.add(elemento);
        super.add(elemento);
        return true;
    }
}
