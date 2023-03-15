package ObjetosSimples.Biblioteca.Solucion;

import java.util.*;

public class Libro {
   private String ISBN;
   private String titulo;
   private Date fechaPublicacion;
   private String[] autores;
   private int stock;

   public Libro(String ISBN, String titulo, Date fechaPublicacion, String[] autores, int stock) {
      this.ISBN = ISBN;
      this.titulo = titulo;
      this.fechaPublicacion = fechaPublicacion;
      this.autores = autores;
      this.stock = stock;
   }

   public String getISBN() {
      return ISBN;
   }

   public String getTitulo() {
      return titulo;
   }

   public Date getFechaPublicacion() {
      return fechaPublicacion;
   }

   public String[] getAutores() {
      return autores;
   }

   public int getStock() {
      return stock;
   }

   public void setStock(int stock) {
      this.stock = stock;
   }
}
