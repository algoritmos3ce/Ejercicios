package ObjetosSimples.Chat.Solucion;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private final List<Usuario> usuarios;

    public Chat() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario getUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
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
