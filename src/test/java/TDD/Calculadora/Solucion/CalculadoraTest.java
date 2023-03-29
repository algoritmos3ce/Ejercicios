package TDD.Calculadora.Solucion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.suma(2, 2));
        assertEquals(-4, calc.suma(-2, -2));
        assertEquals(0, calc.suma(0, 0));
        assertEquals(10, calc.suma(7, 3));
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.resta(2, 2));
        assertEquals(4, calc.resta(2, -2));
        assertEquals(-2, calc.resta(0, 2));
        assertEquals(4, calc.resta(7, 3));
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.multiplicacion(2, 2));
        assertEquals(-4, calc.multiplicacion(-2, 2));
        assertEquals(0, calc.multiplicacion(0, 0));
        assertEquals(21, calc.multiplicacion(7, 3));
    }

    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.division(4, 2), 0.0);
        assertEquals(-1, calc.division(2, -2), 0.0);
        assertEquals(Double.NaN, calc.division(0, 0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, calc.division(1, 0), 0.0);
    }

    @Test
    public void testSqrt() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.sqrt(4), 0.0);
        assertEquals(0, calc.sqrt(0), 0.0);
        assertEquals(1, calc.sqrt(1), 0.0);
        assertEquals(3, calc.sqrt(9), 0.0);
    }
}