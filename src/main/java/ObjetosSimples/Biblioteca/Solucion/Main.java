package ObjetosSimples.Biblioteca.Solucion;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        // Agregar libros a la biblioteca
        Libro libro1 = new Libro("1234567890", "El nombre del viento", new Date(), new String[]{"Patrick Rothfuss"}, 5);
        biblioteca.agregarLibro(libro1);
        Libro libro2 = new Libro("0987654321", "La música del silencio", new Date(), new String[]{"Patrick Rothfuss"}, 3);
        biblioteca.agregarLibro(libro2);

        // Consultar stock de libros
        int stock = biblioteca.consultarStockPorTitulo("El nombre del viento");
        System.out.println("Stock de 'El nombre del viento': " + stock);

        //Consultar stock por autor
        stock = biblioteca.consultarStockPorAutor("Patrick Rothfuss");
        System.out.println("Stock de libros de Patrick Rothfuss: " +stock);

        // Prestar libro
        Alumno alumno1 = new Alumno("Juan", "Pérez", "123456");
        biblioteca.prestarLibro(libro1, alumno1);

        // Consultar libros prestados
        ArrayList<Libro> librosPrestados = biblioteca.consultarLibrosPrestados(alumno1);
        for (Libro libro : librosPrestados) {
            System.out.println(libro.getTitulo());
        }
    }
}