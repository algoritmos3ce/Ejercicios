Dado el siguiente codigo, identificar que patrones se violan y proponer un diseño alternativo.

```java

public class Cafe {
    private String descripcion;
    private double precio;

    public Cafe(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    

    public void agregarLeche() {
        descripcion += ", con leche";
        precio += 0.5;
    }

    public void agregarAzucar() {
        descripcion += ", con azucar";
        precio += 0.25;
    }
}
```