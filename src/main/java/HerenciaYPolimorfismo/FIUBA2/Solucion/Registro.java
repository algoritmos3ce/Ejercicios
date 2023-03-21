package HerenciaYPolimorfismo.FIUBA2.Solucion;
import java.util.ArrayList;

public class Registro {
    private ArrayList<Integrante> integrantes;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Docente> docentes;

    public Registro() {
        integrantes = new ArrayList<>();
        alumnos = new ArrayList<>();
        docentes = new ArrayList<>();
    }
    public void agregarIntegrante(Integrante integrante) {
        if (integrante instanceof Alumno) {
            Alumno alumno = (Alumno) integrante;
            if (buscarAlumnoPorPadron(alumno.getPadron()) == null) {
                integrantes.add(alumno);
                alumnos.add(alumno);
            }
        } else if (integrante instanceof Docente) {
            Docente docente = (Docente) integrante;
            if (buscarDocentePorPadron(docente.getPadron()) == null) {
                integrantes.add(docente);
                docentes.add(docente);
            }
        }
    }

    public Alumno buscarAlumnoPorPadron(int padron) {
        for (Alumno alumno : alumnos) {
            if (alumno.getPadron() == padron) {
                return alumno;
            }
        }
        return null;
    }

    public Docente buscarDocentePorPadron(int padron) {
        for (Docente docente : docentes) {
            if (docente.getPadron() == padron) {
                return docente;
            }
        }

        return null;
    }

    public void ListarAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getDni());
            System.out.println(alumno.getPadron());
        }
    }

    public void ListarDocentes() {
        for (Docente docente : docentes) {
            System.out.println(docente.getNombre());
            System.out.println(docente.getDni());
            System.out.println(docente.getPadron());
        }
    }

    public void ListarIntegrantes() {
        for (Integrante integrante : integrantes) {
            System.out.println(integrante.getNombre());
            System.out.println(integrante.getDni());
            if (integrante instanceof Alumno) {
                System.out.println(((Alumno) integrante).getPadron());
            } else if (integrante instanceof Docente) {
                System.out.println(((Docente) integrante).getPadron());
            }
        }
    }
}