package logica;

public class Main {

	public static void main(String[] args) {
		Gestionador fechaUno = new Gestionador("22-04-1998", 1);
		System.out.println(fechaUno.fechaToStr());

		Gestionador fechaDos = new Gestionador("08-17-2002", 2);
		System.out.println(fechaDos.fechaToStr());
		
		Gestionador fechaTres = new Gestionador("01-05-2004", 2);
		System.out.println(fechaTres.fechaToStr());

		System.out.println( fechaDos.entreDos(fechaUno, fechaTres));
		
		System.err.println("3 es mayor que 1?");
		System.out.println(fechaTres.esMayor(fechaUno));
		
		System.err.println("1 es menor que 2?");
		System.out.println(fechaUno.esMayor(fechaDos));
	}

}
