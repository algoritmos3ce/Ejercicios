package TDD.Bowling.Solucion;

public class Bowling {
    private int[] lanzamientos = new int[21];
    private int lanzamientoActual = 0;

    public void lanzar(int bolosTirados) {
        lanzamientos[lanzamientoActual++] = bolosTirados;
    }

    public int obtenerPuntuacion() {
        int puntuacionTotal = 0;
        int lanzamientoActual = 0;

        for (int turno = 0; turno < 10; turno++) {
            if (esStrike(lanzamientoActual)) {
                puntuacionTotal += 10 + puntuacionStrike(lanzamientoActual);
                lanzamientoActual++;
            } else if (esSpare(lanzamientoActual)) {
                puntuacionTotal += 10 + puntuacionSpare(lanzamientoActual);
                lanzamientoActual += 2;
            } else {
                puntuacionTotal += puntuacionNormal(lanzamientoActual);
                lanzamientoActual += 2;
            }
        }

        return puntuacionTotal;
    }

    private boolean esStrike(int lanzamientoActual) {
        return lanzamientos[lanzamientoActual] == 10;
    }

    private boolean esSpare(int lanzamientoActual) {
        return lanzamientos[lanzamientoActual] + lanzamientos[lanzamientoActual + 1] == 10;
    }

    private int puntuacionStrike(int lanzamientoActual) {
        return lanzamientos[lanzamientoActual + 1] + lanzamientos[lanzamientoActual + 2];
    }

    private int puntuacionSpare(int lanzamientoActual) {
        return lanzamientos[lanzamientoActual + 2];
    }

    private int puntuacionNormal(int lanzamientoActual) {
        return lanzamientos[lanzamientoActual] + lanzamientos[lanzamientoActual + 1];
    }
}
