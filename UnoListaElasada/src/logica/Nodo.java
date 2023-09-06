package logica;


public class Nodo {
	    private Object valor;
	    private Nodo siguiente = null;

	    public Nodo(Object obj) {
	        this.valor = obj;
	    }

	    public Nodo(Object obj, Nodo nd) {
	        this.valor = obj;
	        this.siguiente = nd;
	    }

	    public void setValor(Object valor) {
	        this.valor = valor;
	    }

	    public Object getValor() {
	        return this.valor;
	    }

	    public void setSiguiente(Nodo nodo) {
	        this.siguiente = nodo;
	    }

	    public Nodo getSiguiente() {
	        return this.siguiente;
	    }
}