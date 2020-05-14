package Capa.Negocio;

import java.util.Date;

import Capa.Integracion.DAOVehiculo;
import Capa.Integracion.DAOtransporte;

public class SATransporte {

	private DAOtransporte trans;
	private DAOVehiculo veh;


	public SATransporte() {

		this.trans = new DAOtransporte();
		this.veh = new DAOVehiculo();
	}


	public Date[] getHorarioVehiculo(int idVehiculo) {

		return null;
	}


	public transferVehiculo[] getVehiculosTipoDisponibles(int tipoVehiculo) {

		return null;
	}

	public boolean registrarTransporte(/* ver que pasar*/) {


		return false;
	}

	public boolean comprobarBillete(int idPasajero) {
		//comprobar que el pasajero tiene billete para poder reservar transporte

		return false;
	}


	public boolean eliminarTransporte(int idTransporte) {

		return false;

	}



}
