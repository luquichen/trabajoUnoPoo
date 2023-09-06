package logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Administrador {
	ArrayList<Tarea> listatareas;
	ArrayList<Colaborador> listacol;
	
	
	public Administrador() {
		listatareas = new ArrayList<Tarea>();
		listacol = new ArrayList<Colaborador>();
	}
	void agregarTarea(String nombreTarea, LocalDate finTarea, LocalDate avisoTarea, int prioridad ){
		Tarea aux = new Tarea(nombreTarea,prioridad, finTarea, avisoTarea);
		listatareas.add(aux);
	}

	public ArrayList<Tarea> ArtareasPorPrioirdad() {
		ArrayList<Tarea> aux = new ArrayList<Tarea>();
		for (int i=0; i< listatareas.size(); i++) {
			if( listatareas.get(i).estasVencida()== false) {
				aux.add(listatareas.get(i));
			}
			
			Comparator<Tarea> comparadorPrioridad = Comparator.comparing(Tarea::getPrioridad); //objeto Comparator es para ordernar por un campo
			Collections.sort(aux, comparadorPrioridad);
			
		}
		return aux;
		
	}
	
	public ArrayList<Tarea> mostrarTodasConCola() {
		ArrayList<Tarea> aux = new ArrayList<Tarea>();
		for (int i=0; i< listatareas.size(); i++) {
			if( listatareas.get(i).estasVencida()== true) {
				aux.add(listatareas.get(i));
			}
			
		}
		return aux;
		
	}
	public ArrayList<Tarea> taeasPorFecha() {
		ArrayList<Tarea> aux = new ArrayList<Tarea>();
        Comparator<Tarea> comparadorTareas = Comparator.comparing(Tarea::getFecha);
        Collections.sort(aux, comparadorTareas);
        
        return aux;
	}
	
	String buscarTareaPorTitulo(String titulo) {
		String aux = " ";
		for (int i=0; i< listatareas.size(); i++) {
			if( listatareas.get(i).descripccion== titulo) {
				aux = (listatareas.get(i).getInfo());
			}
		}
		return aux;
	}
	void marcarComoRealizada(String titulo ) {
		for (int i=0; i< listatareas.size(); i++) {
			if( listatareas.get(i).descripccion== titulo) {
				 listatareas.get(i).estasTerminada();
			}
		}
	}
	void marcarComoRealizada(String titulo, Colaborador c ) {
		for (int i=0; i< listatareas.size(); i++) {
			if( listatareas.get(i).descripccion== titulo) {
				 listatareas.get(i).estasTerminada(c);
				 
			}
		}
	}
	
		
	
	
}
