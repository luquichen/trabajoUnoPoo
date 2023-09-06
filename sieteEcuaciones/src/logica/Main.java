package logica;

public class Main {

	public static void main(String[] args) {
		
		float a= 2;
		float b = -5;
		float c = 2;
		
	Calculador cuenta = new Calculador(a, b, c);
	
	float[] resultados = cuenta.resolver();
	for (int i = 0; i < resultados.length; i++) {
        System.out.println("raiz: " + resultados[i]);
    }

	}

}
