package ObjetosSimples.Chat.Solucion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Chat {
    private List<Usuario> usuarios;

    public Chat() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Mensaje> getHistorialConversacion(Usuario usuario1, Usuario usuario2) {
        List<Mensaje> historial = new ArrayList<>();
        for (Mensaje mensaje : usuario1.getMensajesEnviados()) {
            if (mensaje.getDestinatario() == usuario2) {
                historial.add(mensaje);
            }
        }
        for (Mensaje mensaje : usuario2.getMensajesEnviados()) {
            if (mensaje.getDestinatario() == usuario1) {
                historial.add(mensaje);
            }
        }
        return historial;
    }
}