Dado este código 

```java
public class Cliente {
    private Servicio servicio;

    public Cliente() {
        servicio = new Servicio();
    }

    public void realizarPedido() {
        servicio.procesarPedido();
    }
}

public class Servicio {
    public void procesarPedido() {
        // Lógica para procesar el pedido
    }
}
```

identificar qué principios se violan y refactorizar.