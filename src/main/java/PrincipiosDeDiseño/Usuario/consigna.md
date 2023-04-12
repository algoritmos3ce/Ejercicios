# Consigna

Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

``` java
class Usuario {
    private String nombre;
    private String email;
    private String password;

    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public void guardar() {
        // código para guardar el usuario en la base de datos
    }

    public void enviarEmailBianvenida() {
        // código para enviar un email de bienvenida al usuario
    }

    public void cambiarPassword(String nuevoPassword) {
        // código para cambiar la contraseña
    }

    public void delete() {
        // código para eliminar el usuario de la base de datos
    }
}
```
