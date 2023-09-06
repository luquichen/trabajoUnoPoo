package logica;

public class Main {

	public static void main(String[] args) {
		Juego juego1 = new Juego(2,10,2);
		
		juego1.agregarPalabra("hola", 1);
		juego1.agregarPalabra("yoyo", 2);
		System.out.println(juego1.estadoJuego());
		
		juego1.agregarPalabra("pepito", 1);
		juego1.agregarPalabra("zapatilla yz", 2);
		System.out.println(juego1.estadoJuego());


	}

}
