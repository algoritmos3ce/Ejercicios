Dado el siguiente codigo, identificar un problema de diseño y proponer una solución aplicando algún patrón de diseño.

```java
abstract class Forma {
    double calcularArea();
    void dibujar(Pantalla p);
    boolean guardarEnArchivo(String ruta);
}

class Circulo extends Forma {
    public double calcularArea() { ... }
    public void dibujar(Pantalla p) { ... }
    public boolean guardarEnArchivo(String ruta) { ... }
}

class Rectangulo extends Forma {
    public double calcularArea() { ... }
    public void dibujar(Pantalla p) { ... }
    public boolean guardarEnArchivo(String ruta) { ... }
}
```
