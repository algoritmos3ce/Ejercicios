package ObjetosSimples.Chat.Solucion;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos usuarios
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Maria");
        Usuario usuario3 = new Usuario("Pedro");

        // Crear un chat y agregar usuarios
        Chat chat = new Chat();
        chat.agregarUsuario(usuario1);
        chat.agregarUsuario(usuario2);
        chat.agregarUsuario(usuario3);

        // Los usuarios envían mensajes entre ellos
        usuario1.enviarMensaje(usuario2, "Hola Maria!");
        usuario2.enviarMensaje(usuario1, "Hola Juan, ¿cómo estás?");
        usuario3.enviarMensaje(usuario1, "Hola Juan, ¿quieres tomar un café?");
        usuario1.enviarMensaje(usuario3, "Sí, vamos a un café!");
        usuario2.enviarMensaje(usuario3, "También me gustaría tomar un café.");
        usuario3.enviarMensaje(usuario2, "Genial, ¿cuándo nos encontramos?");

        // Obtener el historial de conversación entre dos usuarios
        List<Mensaje> historial = chat.getHistorialConversacion(usuario1, usuario2);
        for (Mensaje mensaje : historial) {
            System.out.println(mensaje.getRemitente().getNombre() + " a " + mensaje.getDestinatario().getNombre() + ": " + mensaje.getTexto());
        }
        historial = chat.getHistorialConversacion(usuario1, usuario3);
        for (Mensaje mensaje : historial) {
            System.out.println(mensaje.getRemitente().getNombre() + " a " + mensaje.getDestinatario().getNombre() + ": " + mensaje.getTexto());
        }
        historial = chat.getHistorialConversacion(usuario2, usuario3);
        for (Mensaje mensaje : historial) {
            System.out.println(mensaje.getRemitente().getNombre() + " a " + mensaje.getDestinatario().getNombre() + ": " + mensaje.getTexto());
        }
    }
}
