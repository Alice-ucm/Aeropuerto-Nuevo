package Capa.Integracion;


import Capa.Negocio.SAAlmacen;
import Capa.Negocio.SATransporte;

public abstract class FactorySA {
	private static FactorySA instance;

	public static FactorySA getInstance() {
		if (instance == null) {
			instance = new FactorySAImpl();
		}
		return instance;
	}

	public abstract SAAlmacen creaSAEquipaje();

	public abstract SATransporte creaSATransporte();

}
