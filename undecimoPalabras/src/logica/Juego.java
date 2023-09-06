package logica;

import java.util.ArrayList;

public class Juego {
	ArrayList<Jugador> jugadores =  new ArrayList<>();
	int puntajePorLetras;
	int puntajeCaracter;
	
	
	
	public Juego(int puntajePorLetras , int puntajeCaracter, int cantJugadores) {
		this.puntajePorLetras = puntajePorLetras;
		this.puntajeCaracter = puntajeCaracter;
		
		for (int i = 0; i<cantJugadores; i++) {
			jugadores.add(new Jugador(i));
		}
	}
	public int darPuntaje(String palabra) {
		String caracteres = "kzxywq";
		int auxPuntaje = palabra.length() * puntajePorLetras;
		
		for (int i = 0; i< palabra.length(); i++) {
			for(int j = 0; j < caracteres.length();j ++){
				if (caracteres.charAt(j) == palabra.charAt(i)){
					auxPuntaje = auxPuntaje + puntajeCaracter;
				}
			}
		}
		
		return auxPuntaje;
	}

	
	public void agregarPalabra(String palabra, int num ){
		jugadores.get(num-1).agrearPalabra(palabra);
		jugadores.get(num-1).agrearPuntaje(darPuntaje(palabra));
	}
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	
	public String estadoJuego() {
		String aux = " ";
		for (int i=0; i<jugadores.size();i++) {
			aux = aux + "El jugador: " + i + " tiene: " + jugadores.get(i).getPuntos() + " puntos \n";
		}
	return aux;
	}
	
}
