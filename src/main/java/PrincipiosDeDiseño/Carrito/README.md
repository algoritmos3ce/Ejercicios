Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
public class CarritoDeCompras {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }
}

public class ServicioWeb {
    public agregarAlCarrito(CarritoDeCompras carrito, Item item) {
        carrito.getItems().add(item);
    }
}
```
