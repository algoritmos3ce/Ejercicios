package HerenciaYPolimorfismo.FIUBA2.Solucion;

public class Docente extends Integrante {
    private int padron;

    public Docente(String nombre, int dni, int padron) {
        super(nombre, dni);
        this.padron = padron;
    }

    public int getPadron() {
        return padron;
    }
}
