Dado el siguiente codigo, identificar un problema de diseño y proponer una solución aplicando algún patrón de diseño.

```java
public class SensorTemperatura {
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        if (temperatura > 100) {
            System.out.println("Alerta: Temperatura alta");
        }
    }
}
```