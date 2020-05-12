package Capa.Integracion;

import Capa.Negocio.SAAlmacen;

public class FactorySAImpl extends FactorySA {

	@Override
	public SAAlmacen creaSAEquipaje() {

		return new SAAlmacen();
	}
}
