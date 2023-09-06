package logica;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
	private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                return libro;
            }
        }
        return null;
    }

    public int getCantidadPrestamosRealizados() {
        int prestamosRealizados = 0;
        for (Libro libro : libros) {
            prestamosRealizados += libro.getNumEjemplaresPrestados();
        }
        return prestamosRealizados;
    }
}