Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
class Usuario {
    private String nombre;
    private String email;
    private BaseDeDatos db;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.db = new BaseDeDatos();
    }

    public void guardar() {
        this.db.guardar(this);
    }
}

class BaseDeDatos {
    public static void guadar(Usuario user) {
        // código para guardar el usuario en la base de datos
    }
}
```
