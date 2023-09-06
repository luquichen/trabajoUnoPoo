package logica;

public class Main {
	 public static void main(String[] args) {
	        // Crear dos objetos Libro
	        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1000, 5);
	        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 400, 3);

	        // Crear una biblioteca y agregar los libros
	        Biblioteca biblioteca = new Biblioteca();
	        biblioteca.agregarLibro(libro1);
	        biblioteca.agregarLibro(libro2);

	        // Mostrar los detalles de los libros por pantalla
	        System.out.println("Detalles del Libro 1:");
	        System.out.println(libro1.getDescripcion());

	        System.out.println("\nDetalles del Libro 2:");
	        System.out.println(libro2.getDescripcion());

	        // Indicar cuál de los dos libros tiene más páginas
	        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
	            System.out.println("\nEl libro 1 tiene más páginas que el libro 2.");
	        } else if (libro2.getNumPaginas() > libro1.getNumPaginas()) {
	            System.out.println("\nEl libro 2 tiene más páginas que el libro 1.");
	        } else {
	            System.out.println("\nAmbos libros tienen la misma cantidad de páginas.");
	        }
	    }
}
