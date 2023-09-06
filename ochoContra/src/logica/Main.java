package logica;

public class Main {

	public static void vista() {
		Generador mainGen = new Generador(1);
		int i = 0;
			String contraUsuario = mainGen.getContraseña();
		while (!mainGen.esFuerte()) {
				 contraUsuario = mainGen.getContraseña();
			System.out.println(i+ " GENERANDO...: "+ contraUsuario);
			mainGen.regenerar();
				i++;
				pausa();
			}
			
			System.out.println("cotraseña FUERTE: "+ contraUsuario);
	}
	
	public static void pausa() {
		 long tiempoInicio = System.currentTimeMillis();
	        long duracionPausa = 500;
	        
	        while (System.currentTimeMillis() - tiempoInicio < duracionPausa) {}
	}
	
	
	
	public static void main(String[] args) {
	vista();
	}
	
}
