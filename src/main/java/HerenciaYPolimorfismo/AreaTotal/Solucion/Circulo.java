package HerenciaYPolimorfismo.AreaTotal.Solucion;

public class Circulo implements Figura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }
}