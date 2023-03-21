package HerenciaYPolimorfismo.FIUBA2.Solucion;

public class Integrante {
    private String nombre;
    private int dni;

    public Integrante(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
}