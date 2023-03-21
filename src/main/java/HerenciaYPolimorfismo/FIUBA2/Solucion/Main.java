package HerenciaYPolimorfismo.FIUBA2.Solucion;

public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();
        registro.agregarIntegrante(new Docente("Juan", 12345678, 1234));
        registro.agregarIntegrante(new Alumno("Pedro", 87654321, 4321));
        registro.agregarIntegrante(new Alumno("Maria", 12345678, 1234));
        registro.agregarIntegrante(new Docente("Jose", 87654321, 4321));
        System.out.println("Listar Alumnos-----------------");
        registro.ListarAlumnos();
        System.out.println("Listar Docentes-----------------");
        registro.ListarDocentes();
        System.out.println("Listar Integrantes-----------------");
        registro.ListarIntegrantes();
    }
}
