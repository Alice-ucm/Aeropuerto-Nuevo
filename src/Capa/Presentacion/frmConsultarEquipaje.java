package Capa.Presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class frmConsultarEquipaje extends JFrame {
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					frmConsultarEquipaje frame = new frmConsultarEquipaje();
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
	public frmConsultarEquipaje() {
		setTitle("Consultar Equipaje");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 601, 453);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(116, 35, 341, 89);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Buscar Equipaje");
		lblNewLabel.setBounds(132, 5, 112, 14);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(24, 36, 208, 20);
		panel.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(242, 35, 89, 23);
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(42, 166, 512, 159);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		table = new JTable();
		table.setBounds(230, 62, -164, 82);
		panel_1.add(table);

		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.setBounds(80, 351, 89, 23);
		getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setBounds(247, 351, 89, 23);
		getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Guardar");
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(399, 351, 89, 23);
		getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("A\u00F1adir Nuevo");
		btnNewButton_4.setBackground(new Color(50, 205, 50));
		btnNewButton_4.setBounds(235, 135, 115, 23);
		getContentPane().add(btnNewButton_4);
	}
}
