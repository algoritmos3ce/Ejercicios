package ObjetosSimples.Cartelera.Solucion;

import java.util.ArrayList;

public class Sistema {

    private static Sistema instance;
    private ArrayList<Usuario> usuarios;
    private Usuario usuarioActual;

    private Sistema() {
        usuarios = new ArrayList<>();
    }

    public static Sistema getInstance() {
        if (instance == null) {
            instance = new Sistema();
        }
        return instance;
    }

    public boolean autenticarUsuario(String nombreUsuario, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                usuarioActual = usuario;
                return true;
            }
        }
        return false;
    }

    public ArrayList<Mensaje> obtenerMensajesEnviados() {
        return usuarioActual.getMensajesEnviados();
    }

    public ArrayList<Mensaje> obtenerMensajesRecibidos() {
        return usuarioActual.getMensajesRecibidos();
    }

    public void enviarMensaje(Mensaje mensaje) {
        Usuario destinatario = buscarUsuarioPorNombre(mensaje.getDestinatario());
        Usuario remitente = buscarUsuarioPorNombre(mensaje.getRemitente());
        remitente.enviarMensaje(mensaje);
        destinatario.recibirMensaje(mensaje);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorNombre(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    public void cerrarSesion() {
        usuarioActual = null;
    }

    public void cerrarSistema() {
        if (!usuarioActual.esPersonal()) {
            System.out.println("No tenes los permisos necesarios para cerrar el sistema");
            return;
        }
        System.out.println("Cerrando sistema...");
        usuarios.clear();
        usuarioActual = null;
    }
}
