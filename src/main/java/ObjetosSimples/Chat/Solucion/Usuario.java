package ObjetosSimples.Chat.Solucion;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Mensaje> mensajesEnviados;
    private List<Mensaje> mensajesRecibidos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.mensajesEnviados = new ArrayList<>();
        this.mensajesRecibidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Mensaje> getMensajesEnviados() {
        return mensajesEnviados;
    }

    public List<Mensaje> getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public void enviarMensaje(Usuario destinatario, String texto) {
        Mensaje mensaje = new Mensaje(this, destinatario, texto);
        mensajesEnviados.add(mensaje);
        destinatario.recibirMensaje(mensaje);
    }

    public void recibirMensaje(Mensaje mensaje) {
        mensajesRecibidos.add(mensaje);
    }
}

