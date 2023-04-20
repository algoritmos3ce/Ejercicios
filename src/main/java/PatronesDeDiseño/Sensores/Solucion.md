En este ejemplo se violan los principios SoC y abierto-cerrado ya que la
acción de mostrar un alerta y apagar el equipo no deberían ser
responsabilidad del `SensorTemperatura`, y además si quisiéramos agregar
alguna otra acción nos veríamos obligados a modificar la clase.

Para corregir esto, se puede utilizar el patrón `Observer` para implementar un mecanismo de suscripción y notificación separado.


```java
interface Observador {
    void actualizar(double temperatura);
}

public class SensorTemperatura implements Subject {
    private double temperatura;
    private List<Observador> observadores = new ArrayList<>();

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }

    public void agregarObservador(Observador observer) {
        observadores.add(observer);
    }

    public void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(temperatura);
        }
    }
}

public class AlertaTemperatura implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 100) {
            System.out.println("Alerta: Temperatura alta");
        }
    }
}

public class ApagadoPreventivo implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 150) {
            System.out.println("Apagando el equipo...");
        }
    }
}
``
