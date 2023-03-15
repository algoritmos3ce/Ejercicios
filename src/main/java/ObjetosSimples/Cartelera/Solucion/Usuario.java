package ObjetosSimples.Cartelera.Solucion;

import java.util.ArrayList;
class Usuario {
    private String nombre;
    private String contrasena;
    private ArrayList<Mensaje> mensajesEnviados;
    private ArrayList<Mensaje> mensajesRecibidos;

    private Boolean esPersonal;

    public Usuario(String nombre, String contrasena, boolean esPersonal) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.mensajesEnviados = new ArrayList<>();
        this.mensajesRecibidos = new ArrayList<>();
        this.esPersonal = esPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public ArrayList<Mensaje> getMensajesEnviados() {
        return mensajesEnviados;
    }

    public ArrayList<Mensaje> getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public void recibirMensaje(Mensaje mensaje) {
        mensajesRecibidos.add(mensaje);
    }

    public boolean esPersonal(){
        return this.esPersonal;
    }

    public void enviarMensaje(Mensaje mensaje){
        mensajesEnviados.add(mensaje);
    }
}
