package TDD.Bowling.Solucion;


import org.junit.Test;
import static org.junit.Assert.*;

public class BowlingTest {

    @Test
    public void puntuacionTotalCero() {
        Bowling partido = new Bowling();
        for (int i = 0; i < 20; i++) {
            partido.lanzar(0);
        }
        assertEquals(0, partido.obtenerPuntuacion());
    }

    @Test
    public void puntuacionTotalUno() {
        Bowling partido = new Bowling();
        partido.lanzar(0);
        partido.lanzar(1);
        for (int i = 0; i < 18; i++) {
            partido.lanzar(0);
        }
        assertEquals(1, partido.obtenerPuntuacion());
    }

    @Test
    public void puntuacionTotalSpare() {
        Bowling partido = new Bowling();
        partido.lanzar(5);
        partido.lanzar(5);
        partido.lanzar(3);
        for (int i = 0; i < 17; i++) {
            partido.lanzar(0);
        }
        assertEquals(16, partido.obtenerPuntuacion());
    }

    @Test
    public void puntuacionTotalStrike() {
        Bowling partido = new Bowling();
        partido.lanzar(10);
        partido.lanzar(3);
        partido.lanzar(4);
        for (int i = 0; i < 16; i++) {
            partido.lanzar(0);
        }
        assertEquals(24, partido.obtenerPuntuacion());
    }

    @Test
    public void puntuacionTotalPerfecta() {
        Bowling partido = new Bowling();
        for (int i = 0; i < 12; i++) {
            partido.lanzar(10);
        }
        assertEquals(300, partido.obtenerPuntuacion());
    }
}
