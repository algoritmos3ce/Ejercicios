package ObjetosSimples.FIUBA.Solucion;

public class Main {

    public static void main(String[] args) {
        Materia algo1 = new Materia("75.40", "Algoritmos I", 6);
        Materia fisica2 = new Materia("62.03", "Fisica II", 8);
        Materia quimica = new Materia("32.14", "Quimica", 6);

        Carrera informatica = new Carrera(
                "Ingenieria en Informatica",
                "4",
                new Materia[] { algo1, fisica2 },
                new Materia[] { quimica },
                16);

        System.out.println("Ingrese su padron"); //FIXME: se rompe aca
        String padron = System.console().readLine();
        Alumno alumno1 = new Alumno(Integer.parseInt(padron));
        System.out.println("Las Carreras disponibles son:");
        informatica.printCarrera();

        System.out.println("Ingrese el codigo de la carrera que desea inscribir");
        String codigo = System.console().readLine();
        if (codigo.equals(informatica.getCodigo())) {
            boolean ok = alumno1.inscribir(informatica);
            if (!ok) {
                System.out.println("No me puedo inscribir :(");
                return;
            }
        }
        System.out.println("Materias disponibles:");
        algo1.printMaterial();
        fisica2.printMaterial();
        quimica.printMaterial();

        System.out.println("Ingrese el codigo de la materia que desea aprobar");
        String codigoMateria = System.console().readLine();
        if (codigoMateria.equals(algo1.getCodigo())) {
            boolean ok = alumno1.aprobar(algo1);
            if (!ok) {
                System.out.println("No me puedo aprobar :(");
                return;
            }
        }
        String estadoCarrera = alumno1.getEstadoCarrera(informatica);
        System.out.println(estadoCarrera);
    }
}
