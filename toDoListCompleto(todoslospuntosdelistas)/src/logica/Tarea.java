package logica;
import java.time.*;

public class Tarea {  
	int prioridad;
    boolean estado; //true cuando se complete
    LocalDate fecha;
    LocalDate fechaRecordatorio;
    String descripccion;
    Colaborador terminadaPor;

    public Tarea (String descripccion, int prioridad, LocalDate fecha, LocalDate fechaRecordatorio){
        this.descripccion= descripccion;
        this.prioridad = prioridad;
        this.estado = false ;
        this.fecha= fecha;
        this.fechaRecordatorio = fechaRecordatorio; 
        }
    
    public int getPrioridad() {return this.prioridad;}

    public  void modificarTarea(String nuevaDescrip){
        this.descripccion = nuevaDescrip;
    }

    public  void cambiarPrioridad( int nuevaPrioirdad){
        this.prioridad = prioridad;
    }

    public void estasTerminada(){
        this.estado = true;
    }
    
    public void estasTerminada(Colaborador c){
        this.estado = true;
        this.terminadaPor = c;
        System.out.println("la terminate");
    }

    public String mostarTarea(){
    	LocalDate fechaActual = LocalDate.now();
    	String aux= this.descripccion;
        
    	if (fechaActual.isAfter(fechaRecordatorio)){
    		this.estado = false;
    		aux= "(vencida)" + this.descripccion;
    	}else {
    		aux = "(por vencer)" + this.descripccion;
    		this.prioridad=1;
    	}
        return aux;
    }

    public boolean estasVencida(){
    	LocalDate fechaActual = LocalDate.now();
    	if (fechaActual.isAfter(fechaRecordatorio)){
    		this.estado = false;
    	}
    	return estado;
    }

    public LocalDate getFecha() {
    	return this.fecha;
		
	}
    
    public String getInfo() {
    	return (this.descripccion + "  - "+ this.prioridad +" - " +this.fecha.toString());
    }
    public String getInfoCol() {
    	String aux = " ";
    	if (this.terminadaPor != null) { 
    		aux = terminadaPor.getNombre();
    	}
    	return (this.descripccion + "  - "+ this.prioridad +" - " +this.fecha.toString()) +" - " + aux;
    }

}
