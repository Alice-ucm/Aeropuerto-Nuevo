package Capa.Presentacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class frmVerificarEquipaje extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					frmVerificarEquipaje frame = new frmVerificarEquipaje();
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
	public frmVerificarEquipaje() {
		setTitle("Verificar Equipaje");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 473, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 447, 1);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(186, 258, 89, 23);
		contentPane.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(21, 50, 404, 176);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"VUELO", "CODIGO", "DESTINO", "ESTADO", "REPORTE"},
					{"N-104", "C-201", "MADRID", "EEUU", "MADRID"},
					{"N-105", "C-202", "MADRID", "EEUU", "MADRID"},
					{"N-106", "C-203", "MADRID", "EEUU", "MADRID"},
					{"N-107", "C-203", "MADRID", "EEUU", "MADRID"},
				},
				new String[] {
						"New column", "New column", "New column", "New column", "New column"
				}
				));
		table.setBounds(20, 11, 360, 140);
		panel_1.add(table);
	}

}
