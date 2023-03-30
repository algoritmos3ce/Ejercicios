package TDD.PuntajeTenis.Solucion;



import static org.junit.Assert.*;

import static TDD.PuntajeTenis.Solucion.PuntajeTenis.*;
import static TDD.PuntajeTenis.Solucion.PuntajeTenis.Puntos.*;
import static TDD.PuntajeTenis.Solucion.PuntajeTenis.Jugador.*;

import org.junit.Test;

public class PuntajeTenisImplTest {

    @Test
    public void testEmpiezaSacandoElLocal() {
        var p = new PuntajeTenisImpl();

        var j = p.servicio();

        assertEquals(LOCAL, j);
    }

    @Test
    public void testPuntajeGameEmpieza0a0() {
        var p = new PuntajeTenisImpl();

        var puntos = p.puntajeGame();

        assertArrayEquals(
                new Puntos[]{CERO, CERO},
                puntos
        );
    }

    @Test
    public void testPuntajeSetsEmpieza0a0() {
        var p = new PuntajeTenisImpl();

        var puntos = p.puntajeSets();

        assertArrayEquals(
                new int[][]{{0, 0}},
                puntos
        );
    }

    @Test
    public void testPuntoLocal() {
        var p = new PuntajeTenisImpl();
        p.punto(LOCAL);

        var puntos = p.puntajeGame();

        assertArrayEquals(
                new Puntos[]{QUINCE, CERO},
                puntos
        );
    }
}