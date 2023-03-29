package TDD.Calculadora.Solucion;

public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            if (a == 0) {
                return Double.NaN;
            } else {
                return Double.POSITIVE_INFINITY;
            }
        } else {
            return (double) a / b;
        }
    }

    public double sqrt(int a) {
        return Math.sqrt(a);
    }
}