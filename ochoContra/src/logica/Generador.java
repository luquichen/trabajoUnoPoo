package logica;

import java.util.Random;

public class Generador {
	int largo = 8;
	String contraseña;
	
	
	Generador(int largo){
		if (largo > this.largo){
			this.largo = largo;
		}
		 crearContraseña();
	}
	
	
	public void crearContraseña() {
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder randomString = new StringBuilder();
		 Random random = new Random();

		 
		 for (int i = 0; i < largo; i++) {
			 int randomIndex = random.nextInt(caracteres.length());
			 char randomChar = caracteres.charAt(randomIndex);
			 randomString.append(randomChar);
		 }
		 
		 this.contraseña = randomString.toString();
	}
	
	public String getContraseña() { return this.contraseña;}
	
	
	public boolean contMayusuclas() {
		int i = 0;
		int contadorMayusculas= 0;
		char caracter= ' ';
		boolean rta = false;
		while ((i<contraseña.length()) & ( contadorMayusculas <3) ) {
			caracter = contraseña.charAt(i);
        	if (Character.isUpperCase(caracter)) {
			contadorMayusculas++;
        	 }
			i++;
		}
			
        if (contadorMayusculas>= 2) {
        	rta= true;
        }
		return rta;
	}
	
	public boolean contMinusculas() {
		int i = 0;
		int contadorMayusculas= 0;
		char caracter= ' ';
		boolean rta = false;
		while ((i<contraseña.length()) & ( contadorMayusculas <3) ) {
			caracter = contraseña.charAt(i);
        	if (Character.isLowerCase(caracter)) {
			contadorMayusculas++;
        	 }
			i++;
		}
			
        if (contadorMayusculas>= 2) {
        	rta= true;
        }
		return rta;
	}
	public boolean contNumro() {
		int i = 0;
		int contadorMayusculas= 0;
		char caracter= ' ';
		boolean rta = false;
		while ((i<contraseña.length()) & ( contadorMayusculas <3) ) {
			caracter = contraseña.charAt(i);
        	if (Character.isDigit(caracter)) {
			contadorMayusculas++;
        	 }
			i++;
		}
			
        if (contadorMayusculas>= 2) {
        	rta= true;
        }
		return rta;
	}
	
	public boolean esFuerte() {
		return contMayusuclas() & contMinusculas() & contNumro();
	}
	
	public void regenerar() {
		this.contraseña = " ";
		this.crearContraseña();
	}
}
