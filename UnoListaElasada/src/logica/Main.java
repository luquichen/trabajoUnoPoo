package logica;

public class Main {
	public static void main(String[] args) {
		
		Lista miLista = new Lista();
		System.err.println(miLista.longitud());
		miLista.agregar(1);
		miLista.agregar(2);
		miLista.agregar(4);
		miLista.mostrar(); // rome enc
		System.err.println(miLista.longitud());
		miLista.insertar(3, 2); //num - pos
		miLista.mostrar();
		
		System.out.println(miLista.recuperar(2));
		
		miLista.eliminar(2);
		miLista.mostrar();
		
	}
}
