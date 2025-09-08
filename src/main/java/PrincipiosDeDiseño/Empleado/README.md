Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
public class Empleado {
    public final String nombre;
    public final String apellido;
    public final int edad;

    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.printf("%s, %s tiene %d años.\n", apellido, nombre, edad);
    }
}
```
