En este ejemplo, la clase Cafe viola el principio abierto-cerrado, porque añade la funcionalidad adicional (agregarle "extras" a un café básico) directamente en el objeto existente en lugar de encapsular la funcionalidad adicional en clases separadas.

Para corregir esto, se puede crear clases separadas para cada funcionalidad adicional que se desea agregar al objeto existente y utilizar el patrón Decorator para combinar estas funcionalidades.

```java
public interface Cafe {
    String getDescripcion();
    double getPrecio();
}

public class CafeBasico implements Cafe {
    private String descripcion;
    private double precio;

    public CafeBasico(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
}

public class CafeConLeche implements Cafe {
    private Cafe cafeDecorado;

    public CafeConLeche(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    public String getDescripcion() {
        return cafeDecorado.getDescripcion() + ", con leche";
    }

    public double getPrecio() {
        return cafeDecorado.getPrecio() + 0.5;
    }
}

public class CafeConAzucar implements Cafe {
    private Cafe cafeDecorado;

    public CafeConAzucar(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    public String getDescripcion() {
        return cafeDecorado.getDescripcion() + ", con azucar";
    }

    public double getPrecio() {
        return cafeDecorado.getPrecio() + 0.25;
    }
}

public class CafeConMiel implements Cafe {
    private Cafe cafeDecorado;

    public CafeConAzucar(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    public String getDescripcion() {
        return cafeDecorado.getDescripcion() + ", con miel";
    }

    public double getPrecio() {
        return cafeDecorado.getPrecio() + 0.75;
    }
}
```
