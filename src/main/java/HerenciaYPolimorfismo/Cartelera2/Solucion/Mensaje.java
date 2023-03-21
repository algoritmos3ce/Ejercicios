package HerenciaYPolimorfismo.Cartelera2.Solucion;

class Mensaje {
    private String remitente;
    private String destinatario;
    private String texto;

    public Mensaje(String remitente, String destinatario, String texto) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.texto = texto;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getTexto() {
        return texto;
    }
}