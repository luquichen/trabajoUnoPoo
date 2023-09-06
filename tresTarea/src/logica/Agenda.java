package logica;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Tarea> listaDeTareas;
	
	
	Agenda(){
		this.listaDeTareas = new ArrayList<Tarea>();
		
	}
	public void agregarTarea(Tarea tarea) {
		listaDeTareas.add(tarea);
	}

	public void eliminarTarea(int indice) {
		if (indice >= 0 && indice < listaDeTareas.size()) {
			listaDeTareas.remove(indice);
		} else {
			System.out.println("Índice fuera de rango. No se pudo eliminar la tarea.");
		}
	}

	public void mostrarTareas() {
		if (listaDeTareas.isEmpty()) {
			System.out.println("La agenda está vacía.");
		} else {
			System.out.println("Lista de Tareas:");
			for (int i = 0; i < listaDeTareas.size(); i++) {
				Tarea tarea = listaDeTareas.get(i);
				System.out.println((i + 1) + ". " + tarea.mostrarTarea());
			}
		}
	}
	
	public String mostrarTareass() {
		String aux = " ";
		if (listaDeTareas.isEmpty()) {
			aux= "La agenda está vacía.";
		} else {
			aux = "Lista de Tareas:";
			for (int i = 0; i < listaDeTareas.size(); i++) {
				Tarea tarea = listaDeTareas.get(i);
				aux =aux + ((i + 1) + ". " + tarea.mostrarTarea());
			}
		}
		return aux;
	}
}
