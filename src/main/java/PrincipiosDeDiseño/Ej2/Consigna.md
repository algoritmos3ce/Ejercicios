Dado este código

```java
public class Envio {
    private String tipo;

    public Envio(String tipo) {
        this.tipo = tipo;
    }

    public void enviar() {
        if (tipo.equals("postal")) {
            System.out.println("Enviando por correo postal...");
        } else if (tipo.equals("electronico")) {
            System.out.println("Enviando por correo electrónico...");
        } else {
            System.out.println("Tipo de envío no válido.");
        }
    }
}
```

identificar qué principios se violan y refactorizar.