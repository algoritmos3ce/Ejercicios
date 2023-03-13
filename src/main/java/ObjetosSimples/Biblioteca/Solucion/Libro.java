package ObjetosSimples.Biblioteca.Solucion;

public class Libro {
   private final String titulo;
   private long codigo;
   private final String[] autores;
   private final int FechaPublicacion;
   private int Cantidad;

   public Libro(String titulo, Long codigo, String[] autores, int FechaPublicacion, int Cantidad) {
      this.titulo = titulo;
      this.codigo = codigo;
      this.autores = autores;
      this.FechaPublicacion = FechaPublicacion;
   }

   public long getCodigo() {
      return codigo;
   }

   public String getTitulo() {
      return titulo;
   }
}
