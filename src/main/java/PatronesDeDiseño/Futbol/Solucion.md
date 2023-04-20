En este ejemplo hay una explosión de clases, ya que hay una clase por cada combinación de posición en el campo (arquero/defensor/mediocampo/delantero) y controlador (humano / IA).

Para corregir esto, se puede aplicar el patrón Strategy:

```java
public class Jugador {
    private Posicion posicion;
    private Controlador controlador;

    public Jugador(Posicion p, Controlador c) {
        posicion = p;
        controlador = c;
    }

    public void jugar() {
        controlador.jugar(posicion);
    }

    public void dibujar() {
        posicion.dibujar();
    }
}

public interface Posicion {
    void dibujar();
}

public interface Controlador {
    void jugar(Posicion p);
}

public class ControladorHumano implements Controlador { ... }
public class ControladorIA implements Controlador { ... }

public class PosicionArquero implements Posicion { ... }
public class PosicionDefensor implements Posicion { ... }
public class PosicionMediocampo implements Posicion { ... }
public class PosicionDelantero implements Posicion { ... }

class Main {
    public static void main(String[] args) {
        var mediocampistaHumano = new Jugador(new PosicionMediocampo(), new ControladorHumano());
        var arqueroIA = new Jugador(new PosicionArquero(), new ControladorIA());
    }
}
```
