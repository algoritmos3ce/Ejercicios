Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getArea() {
        return ancho * alto;
    }
}

public class Cuboide extends Rectangulo {
    private int profundidad;

    public Cuboid(int ancho, int alto, int profundidad) {
        super(ancho, alto);
        this.profundidad = profundidad;
    }

    public int getVolumen() {
        return ancho * alto * profundidad;
    }
}
```
