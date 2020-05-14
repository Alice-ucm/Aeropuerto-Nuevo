package Capa.Presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		Image portada = new ImageIcon(this.getClass().getResource("fondo.jpeg")).getImage();

		JLabel lblPortada = new JLabel("");
		lblPortada.setBounds(30, 90, 925, 600);
		lblPortada.setIcon(new ImageIcon(portada));

		setBackground(new Color(192, 192, 192));
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Inicio");
		mnNewMenu.setIcon(new ImageIcon(Principal.class.getResource("/img/ico-inicio.png")));
		menuBar.add(mnNewMenu);

		JMenu mnNewMenu_1 = new JMenu("Almacén");
		mnNewMenu_1.setIcon(new ImageIcon(Principal.class.getResource("/img/ico-almacen2.png")));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem = new JMenuItem("Mostrar Equipaje");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				frmMostrarEquipaje verventana = new frmMostrarEquipaje();
				verventana.setVisible(true);

			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar Equipaje");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmConsultarEquipaje verventana = new frmConsultarEquipaje();
				verventana.setVisible(true);

			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Verificar Equipaje");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmVerificarEquipaje verventana = new frmVerificarEquipaje();
				verventana.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Enviar Equipaje");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmEnviarEquipaje verventana = new frmEnviarEquipaje();
				verventana.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Reporte");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmReporte verventana = new frmReporte();
				verventana.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);

		JMenu mnNewMenu_2 = new JMenu("Transporte");
		mnNewMenu_2.setIcon(new ImageIcon(Principal.class.getResource("/img/ico-transporte.png")));
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Seleccionar Transporte");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frmTransporteSeleccionar verventana = new frmTransporteSeleccionar();
				verventana.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Horario Transporte");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				frmTransporteHorario verventana = new frmTransporteHorario();
				verventana.setVisible(true);

			}
		});

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Seleccionar Disponilidad");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmTransporteDisponible verventana = new frmTransporteDisponible();
				verventana.setVisible(true);

			}

		});
		mnNewMenu_2.add(mntmNewMenuItem_7);
		mnNewMenu_2.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Aeropuerto-Nuevo\\src\\Capa\\Presentacion\\fondo.jpeg"));
		lblNewLabel.setBounds(0, 0, 890, 570);
		contentPane.add(lblNewLabel);
	}
}
