package logica;

import java.util.ArrayList;

public class Calculador {
	float A;
	float B;
	float C;
	
	Calculador(float a,float  b,float  c){ 
		this.A= a;
		this.B = b;
		this.C = c;
	}
	
	public float resolverY(float x) {
		return   A * x * x + B * x + C;
	}
	
	public float[] resolver(){ 
		float raizA, raizB=0;
		float parteDeArriba = (B*B) -4 *A*C;
		raizA =(float) ((-B) + (Math.sqrt(parteDeArriba)))/ (2*A);
		
		if (parteDeArriba != 0) {
			raizB=(float) ((-B) - (Math.sqrt(parteDeArriba)))/ (2*A) ;
		}
		
		float[] aux = {raizA,raizB};
		return  aux;
		
	}
		
	
}
