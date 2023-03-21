package HerenciaYPolimorfismo.ListaDuplicante.Solucion;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de ListaDuplicante usando composición
        ListaDuplicanteComposicion<String> listaComp = new ListaDuplicanteComposicion<>();
        listaComp.add("Hola");
        listaComp.add("Mundo");
        listaComp.add("!");
        for (int i = 0; i < listaComp.size(); i++) {
            System.out.println(listaComp.get(i));
        }

        // Ejemplo de ListaDuplicante usando herencia
        ListaDuplicanteHerencia<Integer> listaHered = new ListaDuplicanteHerencia<>();
        listaHered.add(1);
        listaHered.add(2);
        listaHered.add(3);
        for (int i = 0; i < listaHered.size(); i++) {
            System.out.println(listaHered.get(i));
        }
    }
}
