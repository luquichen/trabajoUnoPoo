package logica;

import java.util.ArrayList;

class Libro {
	 private String titulo;
	    private String autor;
	    private int numPaginas;
	    private int numEjemplares;
	    private int numEjemplaresPrestados;

	    public Libro(String titulo, String autor, int numPaginas, int numEjemplares) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.numPaginas = numPaginas;
	        this.numEjemplares = numEjemplares;
	        this.numEjemplaresPrestados = 0;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public int getNumPaginas() {
	        return numPaginas;
	    }

	    public int getNumEjemplares() {
	        return numEjemplares;
	    }

	    public int getNumEjemplaresPrestados() {
	        return numEjemplaresPrestados;
	    }

	    public void prestarEjemplar() {
	        if (numEjemplares > 0) {
	            numEjemplares--;
	            numEjemplaresPrestados++;
	        } else {
	            System.out.println("No hay ejemplares disponibles para prestar.");
	        }
	    }

	    public void devolverEjemplar() {
	        if (numEjemplaresPrestados > 0) {
	            numEjemplares++;
	            numEjemplaresPrestados--;
	        } else {
	            System.out.println("No hay ejemplares prestados para devolver.");
	        }
	    }

	    public String getDescripcion() {
	        return "El libro " + titulo + " creado por el autor " + autor + " tiene " + numPaginas +
	                " páginas, quedan " + numEjemplares + " disponibles y se prestaron " +
	                numEjemplaresPrestados + ".";
	    }
	}