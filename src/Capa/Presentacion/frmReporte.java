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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frmReporte extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					frmReporte frame = new frmReporte();
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
	public frmReporte() {
		setTitle("Reporte Equipaje");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 596, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 570, 1);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(110, 29, 341, 89);
		contentPane.add(panel_1);

		JLabel lblNewLabel = new JLabel("Buscar Equipaje");
		lblNewLabel.setBounds(132, 5, 112, 14);
		panel_1.add(lblNewLabel);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(24, 36, 208, 20);
		panel_1.add(textField);

		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(242, 35, 89, 23);
		panel_1.add(btnNewButton);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(36, 160, 512, 250);
		contentPane.add(panel_1_1);

		table = new JTable();
		table.setBounds(230, 62, -164, 82);
		panel_1_1.add(table);

		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(86, 11, 134, 20);
		panel_1_1.add(textField_1);

		JLabel lblNewLabel_1 = new JLabel("Codigo :");
		lblNewLabel_1.setBounds(30, 14, 46, 14);
		panel_1_1.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Vuelo:");
		lblNewLabel_1_1.setBounds(30, 45, 46, 14);
		panel_1_1.add(lblNewLabel_1_1);

		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setColumns(10);
		textField_2.setBounds(85, 42, 135, 20);
		panel_1_1.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(86, 73, 134, 20);
		panel_1_1.add(textField_3);

		JLabel lblNewLabel_2 = new JLabel("Origen :");
		lblNewLabel_2.setBounds(30, 76, 46, 14);
		panel_1_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Destino:");
		lblNewLabel_3.setBounds(30, 107, 46, 14);
		panel_1_1.add(lblNewLabel_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(86, 104, 134, 20);
		panel_1_1.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(86, 140, 134, 20);
		panel_1_1.add(textField_5);

		JLabel lblNewLabel_4 = new JLabel("Estado :");
		lblNewLabel_4.setBounds(30, 143, 46, 14);
		panel_1_1.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Bodega:");
		lblNewLabel_5.setBounds(30, 174, 46, 14);
		panel_1_1.add(lblNewLabel_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(86, 171, 134, 20);
		panel_1_1.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(86, 202, 134, 20);
		panel_1_1.add(textField_7);

		JLabel lblNewLabel_6 = new JLabel("Fecha:");
		lblNewLabel_6.setBounds(30, 199, 46, 14);
		panel_1_1.add(lblNewLabel_6);

		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(192, 192, 192));
		textArea.setBounds(254, 60, 214, 117);
		panel_1_1.add(textArea);

		JLabel lblNewLabel_7 = new JLabel("Descripci\u00F3n:");
		lblNewLabel_7.setBounds(267, 42, 91, 14);
		panel_1_1.add(lblNewLabel_7);

		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(323, 201, 89, 23);
		panel_1_1.add(btnNewButton_1);
	}
}
