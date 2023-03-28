package TDD.ROT13.Solucion;

import org.junit.Test;

import static org.junit.Assert.*;

public class ROT13Test {
    @Test
    public void ROT13ConUnaLetraMayuscula() {
        Main m = new Main();
        assertEquals("U", m.rot13("H"));
    }

    @Test
    public void ROT13ConUnaLetraMinuscula() {
        Main m = new Main();
        assertEquals("u", m.rot13("h"));
    }

    @Test
    public void ROT13ConNumeros() {
        Main m = new Main();
        assertEquals("123", m.rot13("123"));
    }

    @Test
    public void ROT13ConCaracteresEspeciales() {
        Main m = new Main();
        assertEquals("123!@#$%^&*()_+", m.rot13("123!@#$%^&*()_+"));
    }
    @Test
    public void ROT13ConUnaPalabra() {
        Main m = new Main();
        assertEquals("Uryyb", m.rot13("Hello"));
    }

    @Test
    public void ROT13ConUnaFrase() {
        Main m = new Main();
        assertEquals("Uryyb Jbeyq!", m.rot13("Hello World!"));
    }



}