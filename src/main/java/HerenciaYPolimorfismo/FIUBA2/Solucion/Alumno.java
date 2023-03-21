package HerenciaYPolimorfismo.FIUBA2.Solucion;

public class Alumno extends Integrante {
    private int padron;

    public Alumno(String nombre, int dni, int padron) {
        super(nombre, dni);
        this.padron = padron;
    }

    public int getPadron() {
        return padron;
    }
}