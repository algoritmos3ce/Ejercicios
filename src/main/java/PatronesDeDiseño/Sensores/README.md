Dado el siguiente codigo, identificar que patrones se violan y proponer un diseño alternativo.

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