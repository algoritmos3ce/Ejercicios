# Solucion
¡Hola! A continuación, te presentaré cinco ejemplos de código en Java que violan los principios SOLID y te daré una solución para cada uno de ellos:

Violación del Principio de Responsabilidad Única (SRP):
```java
public class Usuario {
    private String nombre;
    private String correo;
    private String telefono;
    
    public void guardarUsuario() {
    // Lógica para guardar usuario en la base de datos
    }
    
    public void enviarCorreoDeBienvenida() {
    // Lógica para enviar correo de bienvenida al usuario
    }
    
    public void actualizarTelefono(String nuevoTelefono) {
    // Lógica para actualizar el teléfono del usuario en la base de datos
    }
}
```
En este ejemplo, la clase Usuario tiene varias responsabilidades: guardar el usuario en la base de datos, enviar correos de bienvenida y actualizar el teléfono del usuario. Esto viola el Principio de Responsabilidad Única (SRP).

Solución: Separar las responsabilidades de la clase Usuario en diferentes clases. Por ejemplo, una clase UsuarioData que se encargue de guardar el usuario en la base de datos, una clase CorreoService que se encargue de enviar correos de bienvenida y una clase UsuarioService  que se encargue de actualizar el teléfono del usuario.