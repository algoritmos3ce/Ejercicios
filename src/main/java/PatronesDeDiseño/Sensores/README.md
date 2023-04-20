Dado el siguiente código, identificar un problema de diseño y proponer una solución aplicando algún patrón de diseño.

```java
public class SensorTemperatura {
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        if (temperatura > 100) {
            mostrarAlerta("temperatura alta");
        }
        if (temperatura > 150) {
            apagarEquipo();
        }
    }

    private void mostrarAlerta(String mensaje) { ... }
    private void apagarEquipo() { ... }
}
```
