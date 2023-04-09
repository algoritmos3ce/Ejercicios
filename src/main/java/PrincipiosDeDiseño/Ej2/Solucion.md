En este ejemplo, la clase Envio está abierta a la modificación ya que si se desea agregar un nuevo tipo de envío, se debe modificar el método enviar() y agregar una nueva condición en el if-else. Esto va en contra del principio OCP, que establece que una clase debe estar abierta a la extensión pero cerrada a la modificación.

Solución:

En lugar de utilizar un if-else para determinar el tipo de envío, podemos utilizar una estructura de datos como un Map para mapear cada tipo de envío con su correspondiente implementación de Envio. De esta manera, se puede agregar fácilmente un nuevo tipo de envío sin tener que modificar la clase Envio. El código corregido podría ser algo así:

```java
public interface ServicioDeEnvio {
   void enviar();
}

public class EnvioPostal implements ServicioDeEnvio {
   @Override
   public void enviar() {
       System.out.println("Enviando por correo postal...");
   }
}

public class EnvioElectronico implements ServicioDeEnvio {
   @Override
   public void enviar() {
       System.out.println("Enviando por correo electrónico...");
   }
}

public class EnvioFactory {
   private static final Map<String, ServicioDeEnvio> envios = new HashMap<>();

   static {
       envios.put("postal", new EnvioPostal());
       envios.put("electronico", new EnvioElectronico());
   }

   public static ServicioDeEnvio obtenerServicioDeEnvio(String tipo) {
       ServicioDeEnvio servicioDeEnvio = envios.get(tipo);
       if (servicioDeEnvio == null) {
           throw new IllegalArgumentException("Tipo de envío no válido.");
       }
       return servicioDeEnvio;
   }
}

public class Pedido {
   private ServicioDeEnvio servicioDeEnvio;

   public Pedido(String tipoEnvio) {
       this.servicioDeEnvio = EnvioFactory.obtenerServicioDeEnvio(tipoEnvio);
   }

   public void enviar() {
       servicioDeEnvio.enviar();
   }
}

```