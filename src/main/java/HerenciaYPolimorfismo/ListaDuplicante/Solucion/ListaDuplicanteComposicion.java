package HerenciaYPolimorfismo.ListaDuplicante.Solucion;

import java.util.ArrayList;

public class ListaDuplicanteComposicion<T> {
    private ArrayList<T> lista;

    public ListaDuplicanteComposicion() {
        this.lista = new ArrayList<>();
    }

    public boolean add(T elemento) {
        boolean agregado = lista.add(elemento);
        lista.add(elemento);
        return agregado;
    }

    public T get(int indice) {
        return lista.get(indice);
    }

    public int size() {
        return lista.size();
    }

    // otros métodos de ArrayList se pueden delegar al objeto interno
}
