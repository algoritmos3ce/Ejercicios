package HerenciaYPolimorfismo.Cartelera2.Solucion;

import java.util.ArrayList;

public class Main { //TODO: Actualizarlo para que cumpla con las consignas de este ej.
    public static void main(String[] args) {
        // Creamos el sistema y registramos algunos usuarios
        Sistema sistema = Sistema.getInstance();
        Usuario juan = new Usuario("Juan", "1234", false);
        Usuario maria = new Usuario("Maria", "5678", true);
        sistema.registrarUsuario(juan);
        sistema.registrarUsuario(maria);

        // Autenticamos a Juan
        boolean buenLogin = true;
        buenLogin = sistema.autenticarUsuario("Juan", "1234");
        if(!buenLogin){
            System.out.println("Hubo un problema con la autenticacion del usuario");
        }

        // Juan envía un mensaje a Maria
        sistema.enviarMensaje(new Mensaje(juan.getNombre(), maria.getNombre(), "Hola Maria, ¿cómo estás?"));

        // Juan verifica sus mensajes enviados
        ArrayList<Mensaje> mensajesEnviados = sistema.obtenerMensajesEnviados();
        System.out.println("Mensajes enviados por Juan:");
        for (Mensaje mensaje : mensajesEnviados) {
            System.out.println("  Destinatario: " + mensaje.getDestinatario() + ", Texto: " + mensaje.getTexto());
        }

        // Juan envía otro mensaje a Maria
        sistema.enviarMensaje(new Mensaje(juan.getNombre(), maria.getNombre(), "Te veo en el comedor a las 12"));

        //Juan intenta cerrar el sistema
        sistema.cerrarSistema();

        // Juan cierra sesión
        sistema.cerrarSesion();

        // Maria verifica sus mensajes recibidos
        buenLogin = sistema.autenticarUsuario("Maria", "5678");
        if(!buenLogin){
            System.out.println("Hubo un error con la autenticacion del usuario");
        }
        ArrayList<Mensaje> mensajesRecibidos = sistema.obtenerMensajesRecibidos();
        System.out.println("Mensajes recibidos por Maria:");
        for (Mensaje mensaje : mensajesRecibidos) {
            System.out.println("  Remitente: " + mensaje.getRemitente() + ", Texto: " + mensaje.getTexto());
        }


        // Maria verifica sus mensajes recibidos de nuevo
        sistema.autenticarUsuario("Maria", "5678");
        mensajesRecibidos = sistema.obtenerMensajesRecibidos();
        System.out.println("Mensajes recibidos por Maria:");
        for (Mensaje mensaje : mensajesRecibidos) {
            System.out.println("  Remitente: " + mensaje.getRemitente() + ", Texto: " + mensaje.getTexto());
        }

        // María cierra el sistema
        sistema.cerrarSistema();
    }
}
