package logica;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Gestionador {
	LocalDate fecha ;
	int tipo;
	
	Gestionador(String fecha, int tipo){
		this.tipo = tipo;
		if(tipo ==1) {
			this.fecha = LocalDate.parse(fecha, (DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		}
		if (tipo ==2) {
			this.fecha = LocalDate.parse(fecha, (DateTimeFormatter.ofPattern("MM-dd-yyyy")));
		}
	}
	
	
	 String fechaToStr(){
		 return fecha.toString();
	 }

	 LocalDate getFecha() {
		 return this.fecha;
	 }
	 
	//true si esta false si no esta (contemplo si son iguales) 
	 boolean entreDos(Gestionador fechaUno, Gestionador fechaDos) {
		boolean anteriorIgual = (fechaUno.getFecha().isBefore(this.fecha));
		boolean posteriorIgual =  (fechaDos.getFecha().isAfter(this.fecha));
		return (anteriorIgual && posteriorIgual);
	 }
		
	 boolean esMayor(Gestionador fecha) {
		 return this.fecha.isAfter(fecha.getFecha());
	 }
	 boolean esMenor(Gestionador fecha) {
		 return this.fecha.isBefore(fecha.getFecha());
	 }

}
