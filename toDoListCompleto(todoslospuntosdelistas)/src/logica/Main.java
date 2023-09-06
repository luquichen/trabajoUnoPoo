package logica;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("DEJO ALGUNOS METODOS QUE PARA EL PUNTO 13  NO DEBERIAN ESTAR PERO SI PARA LOS ANTERIORES.");
		Administrador agenda = new Administrador();
		
		
	
		LocalDate fechaFinT1 = LocalDate.of(2023, 9, 6);
		LocalDate fechaRecuerdoT1 = LocalDate.of(2023, 10, 6);
		
		LocalDate fechaFinT2 = LocalDate.of(2023, 8, 6);
		LocalDate fechaRecuerdoT2 = LocalDate.of(2023, 10, 6);
		
		LocalDate fechaFinT3 = LocalDate.of(2023, 5, 12);
		LocalDate fechaRecuerdoT3 = LocalDate.of(2023, 12, 6);
		
		
		agenda.agregarTarea("t1 super",fechaFinT1 , fechaRecuerdoT1, 5);
		agenda.agregarTarea("t2 moto",fechaFinT2, fechaRecuerdoT2, 1);
		agenda.agregarTarea("t3 casa",fechaFinT3 , fechaRecuerdoT3, 2);

	
		for (int i=0;i<agenda.ArtareasPorPrioirdad().size();i++) {
			System.out.println(agenda.ArtareasPorPrioirdad().get(i).descripccion);
		}
		
		for (int i=0;i<agenda.taeasPorFecha().size();i++) {
			System.out.println(agenda.taeasPorFecha().get(i).descripccion);
		}
		
		System.out.println(agenda.buscarTareaPorTitulo("t1 super"));
		
		Colaborador c = new Colaborador( 1, "lucas");
		agenda.marcarComoRealizada("t1 super",c);
		
		
		for (int i=0;i<agenda.mostrarTodasConCola().size();i++) {
			System.out.println("hola");
			System.out.println(agenda.mostrarTodasConCola().get(i).getInfoCol());
		}
		
	}

}
