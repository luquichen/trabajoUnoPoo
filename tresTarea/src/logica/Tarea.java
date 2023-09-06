package logica;

import java.time.LocalDate;

public class Tarea {
	private String descripcion;
    private int prioridad;
    private boolean estado;
    private LocalDate fechaLimite;

    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = false; 
        this.fechaLimite = fechaLimite;
    }
    
    public void modificarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void cambiarPrioridad(int nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void marcarComoCompleta() {
        this.estado = true;
    }

    public boolean estaVencida() {
        LocalDate hoy = LocalDate.now();
        return !estado && fechaLimite.isBefore(hoy);
    }

    public boolean estaCompleta() {
        return estado;
    }

    public String mostrarTarea() {
        if (estaCompleta()) {
            return "(Vencida) " + descripcion;
        } else {
            return (descripcion + " ");
        }
    }



}
