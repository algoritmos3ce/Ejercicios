package HerenciaYPolimorfismo.AreaTotal.Solucion;

public class Cuadrado implements Figura {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }
}