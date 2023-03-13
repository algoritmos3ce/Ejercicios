package ObjetosSimples.Biblioteca.Solucion;

public class Main {
    //TODO: Revisar la solucion porque probablemente tenga errores
    public static void main(String[] args) {
        Alumno alumno = new Alumno(1234);
        Libro libro = new Libro("El principito", 9783140464079L, new String[] { "Antoine de Saint-Exupéry" }, 1943, 1);
        Libro libro2 = new Libro("Desing Patterns", 9780201633610L,
                new String[] { "Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides" }, 1994, 2);
        Libro libro3 = new Libro("El Nombre del Viento", 9788498380815L,
                new String[] { "Patrick Rothfuss" }, 2007, 1);
        Libro libro4 = new Libro("El Juego de Ender", 9788498380822L, new String[] { "Orson Scott Card" }, 1985, 1);
        Libro libro5 = new Libro("Rayuela", 9789500422246L, new String[] { "Julio Cortázar" }, 1963, 1);
        Libro[] libros = new Libro[] { libro, libro2, libro3, libro4, libro5 };
        Biblioteca biblioteca = new Biblioteca(libros);

        System.out.println("Libros disponibles:");
        biblioteca.printLibros();

        System.out.println("Ingrese el codigo del libro que desea pedir:");

        alumno.PedirLibro(biblioteca, libro);
    }

}
