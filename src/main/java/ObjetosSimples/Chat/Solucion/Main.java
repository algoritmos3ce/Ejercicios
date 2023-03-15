package ObjetosSimples.Chat.Solucion;

import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir nombres de usuarios
        System.out.println("Ingrese el nombre del primer usuario:");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingrese el nombre del segundo usuario:");
        String nombre2 = scanner.nextLine();

        // Crear usuarios y chat
        Usuario usuario1 = new Usuario(nombre1);
        Usuario usuario2 = new Usuario(nombre2);

        Chat chat = new Chat();
        chat.agregarUsuario(usuario1);
        chat.agregarUsuario(usuario2);

        // Comenzar chat
        System.out.println("Comienza el chat!");

        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el nombre del remitente:");
            String remitente = scanner.nextLine();

            System.out.println("Ingrese el nombre del destinatario:");
            String destinatario = scanner.nextLine();

            Usuario usuarioRemitente = chat.getUsuarioPorNombre(remitente);
            Usuario usuarioDestinatario = chat.getUsuarioPorNombre(destinatario);

            if (usuarioRemitente == null || usuarioDestinatario == null) {
                System.out.println("Usuario no encontrado.");
            }

            System.out.println("Ingrese el mensaje:");
            String texto = scanner.nextLine();

            assert usuarioRemitente != null;
            usuarioRemitente.enviarMensaje(usuarioDestinatario, texto);

            System.out.println("Mensaje enviado.");

            System.out.println("¿Desea continuar chateando? (s/n)");
            String respuesta = scanner.nextLine();

            continuar = respuesta.equalsIgnoreCase("s");
        }

        // Mostrar historial de conversación
        System.out.println("Historial de conversación:");

        List<Mensaje> historial = chat.getHistorialConversacion(usuario1, usuario2);
        for (Mensaje mensaje : historial) {
            System.out.println(mensaje.getRemitente().getNombre() + " a " + mensaje.getDestinatario().getNombre() + ": " + mensaje.getTexto());
        }

        scanner.close();
    }
}
