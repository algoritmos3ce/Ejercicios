En el ejemplo se viola el principio DRY, ya que en el método `getVolumen()` se
hace la cuenta `ancho * alto` que corresponde al área del rectángulo y está
repetida en `getArea()`.

Una solución es reemplazar `getVolumen()` por:

```java
    public int getVolumen() {
        return getArea() * profundidad;
    }
```
