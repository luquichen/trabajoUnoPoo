package logica;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda AgendaLista = new Agenda();
		
		AgendaLista.agregarTarea(new Tarea("Ir al supermercado mañana",2,LocalDate.now().plusDays(1)));
		AgendaLista.agregarTarea(new Tarea("Consultar repuesto del auto", 1, LocalDate.now().minusDays(1)));
		AgendaLista.agregarTarea(new Tarea("Ir al cine a ver la nueva película de Marvel", 3, LocalDate.now().minusDays(1)));

		System.out.println(AgendaLista.mostrarTareass());
		AgendaLista.eliminarTarea(1);
		
		
		
		
		System.out.println(AgendaLista.mostrarTareass());
	}

}



