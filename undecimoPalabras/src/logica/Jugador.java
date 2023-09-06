package logica;

import java.util.ArrayList;

public class Jugador {
	private int nombre;
	 private int puntaje;
	 ArrayList<String> palabras = new ArrayList<String>();
	 
	 public Jugador(int i) {
	        this.nombre = i;
	        this.puntaje = 0;
	    }
	 
	 
	 public void agrearPuntaje(int puntaje) {
		 this.puntaje = this.puntaje + puntaje;
		}
	 
	 public void agrearPalabra(String palabra) {
		 this.palabras.add(palabra);
		}
	
	 
	 public int getPuntos() {
		 return this.puntaje;
	 }
	 
	 
}
