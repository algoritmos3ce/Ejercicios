package ObjetosSimples.Chat.Solucion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mensaje {
    private Usuario remitente;
    private Usuario destinatario;
    private String texto;
    private Date fechaEnvio;

    public Mensaje(Usuario remitente, Usuario destinatario, String texto) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.texto = texto;
        this.fechaEnvio = new Date();
    }

    public Usuario getRemitente() {
        return remitente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public String getTexto() {
        return texto;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }
}
