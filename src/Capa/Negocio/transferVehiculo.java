package Capa.Negocio;

import java.util.Date;

public class transferVehiculo {
	
	private int idVehiculo;
	private int tipoVehiculo;
	private Date[] horario;
	private int capacidad;
	
	
	public transferVehiculo(int id, int tipoVehiculo, Date[] horario, int capacidad) {
		
		this.idVehiculo = id;
		this.tipoVehiculo = tipoVehiculo;
		this.horario=horario;
		this.capacidad = capacidad;
	}
	
	
	
	public int getID() {
		
		return this.idVehiculo;
	}
	
	
	public int gettipoVehiculo() {
		return this.tipoVehiculo;
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
	
	public Date[] getHorario() {
		return this.horario;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
