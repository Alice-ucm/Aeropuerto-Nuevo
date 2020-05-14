package Capa.Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Capa.Integracion.PersonaDAO;

public abstract class Controlador implements ActionListener {

	PersonaDAO dao = new PersonaDAO();

	Principal vista = new Principal();

	frmMostrarEquipaje vista2 = new frmMostrarEquipaje();


	public Controlador(Principal v) {
		this.vista = v;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}