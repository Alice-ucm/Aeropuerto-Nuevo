package Capa.Negocio;

import java.util.Date;

public class transferTransporte {


	private int id;
	private Date date;
	private int idUsuario;
	private int idVuelo;



	public transferTransporte(int id, Date date, int idUsuario, int idVuelo) {
		
		this.id = id;
		this.date = date;
		this.idUsuario = idUsuario;
		this.idVuelo = idVuelo;
		
	}



	public int getidTransporte() {

		return this.id;
	}

	public Date getDateTransporte() {

		return this.date;
	}

	public int getidUsuarioTransporte() {

		return this.idUsuario;
	}

	public int getidVueloTransporte() {

		return this.idVuelo;
	}






}
