package ObjetosSimples.Biblioteca.Solucion;

import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Alumno> alumnos;

    public Biblioteca() {
        libros = new ArrayList<Libro>();
        alumnos = new ArrayList<Alumno>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void quitarLibro(Libro libro) {
        libros.remove(libro);
    }

    public int consultarStockPorTitulo(String titulo) {
        int stock = 0;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                stock += libro.getStock();
            }
        }
        return stock;
    }

    public int consultarStockPorFecha(Date fecha) {
        int stock = 0;
        for (Libro libro : libros) {
            if (libro.getFechaPublicacion().equals(fecha)) {
                stock += libro.getStock();
            }
        }
        return stock;
    }

    public int consultarStockPorAutor(String autor) {
        int stock = 0;
        for (Libro libro : libros) {
            String[] autores = libro.getAutores();
            for (String a : autores) {
                if (a.equals(autor)) {
                    stock += libro.getStock();
                    break;
                }
            }
        }
        return stock;
    }

    public void prestarLibro(Libro libro, Alumno alumno) {
        int stock = libro.getStock();
        if (stock > 0) {
            libro.setStock(stock - 1);
            alumno.prestarLibro(libro);
        }
    }

    public void devolverLibro(Libro libro, Alumno alumno) {
        int stock = libro.getStock();
        if (stock >= 0) {
            libro.setStock(stock + 1);
            alumno.devolverLibro(libro);
        }
    }

    public ArrayList<Libro> consultarLibrosPrestados(Alumno alumno) {
        return alumno.getLibrosPrestados();
    }
}