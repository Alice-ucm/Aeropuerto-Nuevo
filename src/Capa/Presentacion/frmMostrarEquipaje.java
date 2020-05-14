package Capa.Presentacion;


import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class frmMostrarEquipaje extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int PAGE_EXISTS = 0;
	private static final int NO_SUCH_PAGE = 0;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 * 
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { frmMostarEquipaje frame = new
	 * frmMostarEquipaje(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */


	public frmMostrarEquipaje() {
		setTitle("Mostar Equipaje");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 603, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 53, 537, 138);
		contentPane.add(panel);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"VUELO", "CODIGO", "ORIGEN", "DESTINO", "ESTADO", "REPORTE"},
					{"N-104", "C-201", "Madrid", "EEUU", "EMB-01", "Madrid"},
					{"N-104", "C-202", "Madrid", "EEUU", "EMB-02", "Madrid"},
					{"N-104", "C-203", "Madrid", "Barcelona", "EMB-03", "Madrid"},
					{"N-104", "C-204", "Madrid", "Londres", "EMB-04", "Madrid"},
					{"N-105", "C-206", "Madrid", "EEUU", "EMB-05", "Madrid"},
					{"N-106", "C-207", "Madrid", "EEUU", "EMB-06", "Madrid"},
				},
				new String[] {
						"Vuelo", "New column", "New column", "New column", "New column", "New column"
				}
				));
		panel.add(table);

		lblNewLabel = new JLabel("Mostar Equipaje");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(195, 28, 132, 22);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Imprimir");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {

			}

		});
		btnNewButton.setBounds(225, 214, 89, 23);
		contentPane.add(btnNewButton);


	}

}
