Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
public class Auto {
    private boolean moviendo;

    public void mover() {
        moviendo = !moviendo;
    }

    public boolean enMovimiento() {
        return moviendo;
    }
}
```
