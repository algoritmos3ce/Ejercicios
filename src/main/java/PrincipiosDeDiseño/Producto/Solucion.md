La clase `Producto` viola el principio OCP (Open-Closed Principle), ya que
si queremos añadir un nuevo tipo de producto (por ejemplo `"limpieza"`) nos
vemos obligados a modificar el código de la clase `Producto`.

Una posible solución sería crear una clase para cada tipo de producto y sobreescribir
el método `calcularPrecio`:

```java
public abstract class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract double calcularPrecio();
}

public class ProductoElectronico extends Producto {
    public ProductoElectronico(String nombre, double precio) {
        super(nombre, precio);
    }

    public double calcularPrecio() {
        return super.calcularPrecio() * 1.1;  // add 10% tax for electronics
    }
}

public class ProductoRopa extends Producto {
    public ProductoRopa(String nombre, double precio) {
        super(nombre, precio);
    }

    public double calcularPrecio() {
        return super.calcularPrecio() * 1.2;  // add 20% tax for clothing
    }
}
```
