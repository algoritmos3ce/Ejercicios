package TDD.PuntajeTenis.Solucion;

public class PuntajeTenisImpl implements PuntajeTenis {
    Puntos[] puntajeGame;

    public PuntajeTenisImpl() {
        this.puntajeGame = new Puntos[] {Puntos.CERO, Puntos.CERO};
    }

    @Override
    public void punto(Jugador j) {
        int n = j.ordinal();
        this.puntajeGame[n] = Puntos.values()[this.puntajeGame[n].ordinal() + 1];
    }

    @Override
    public Jugador servicio() {
        return Jugador.LOCAL;
    }

    @Override
    public int[][] puntajeSets() {
        return new int[][] {{0, 0}};
    }

    @Override
    public Puntos[] puntajeGame() {
        return this.puntajeGame;
    }

}