En el ejemplo se viola el principio de mínimo conocimiento (POLK), ya que el
método `getItems()` devuelve la instancia interna de la lista `items`. El
que invocó al método podría entonces agregar, quitar o modificar items de la
lista, cambiando inadvertidamente el estado del `CarritoDeCompras`. Por otro
lado, el método `agregarAlCarrito` del `ServicioWeb` está violando la Ley de
Demeter al invocar un método de un objeto extraño.

Una solución posible:

```java
public class CarritoDeCompras {
    private List<Item> items;

    public void agregarItem(Item item) {
        items.add(item);
    }
}

public class ServicioWeb {
    public void agregarAlCarrito(CarritoDeCompras carrito, Item item) {
        carrito.agregarItem(item);
    }
}
```
