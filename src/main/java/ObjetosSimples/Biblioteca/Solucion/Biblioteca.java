package ObjetosSimples.Biblioteca.Solucion;

public class Biblioteca {
    private Libro[] libros;

    public Biblioteca(Libro[] libros) {
        this.libros = libros;
    }

    public Libro getLibro(Long codigo) {
        Libro libro_pedido = null;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getCodigo() == codigo) {
                libro_pedido = libros[i];
            }
        }
        return libro_pedido;
    }

    public void printLibros() {
        for (int i = 0; i < libros.length; i++) {
            System.out.println(i);
            System.out.println(libros[i].getTitulo());
            System.out.println(libros[i].getCodigo());
            System.out.println("--------------------");
        }
    }
}
