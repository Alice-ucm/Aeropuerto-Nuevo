package Capa.Presentacion;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class frmTransporteDisponible extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_2;

	/**
	 * Launch the application.
	 * 
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { frmTransporteDisponible frame = new
	 * frmTransporteDisponible(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the frame.
	 */
	public frmTransporteDisponible() {
		setTitle("Horario ID Transporte Seleccionado");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 1);
		contentPane.add(panel);
		panel.setLayout(null);

		table = new JTable();
		table.setBounds(5, 6, 0, 250);
		contentPane.add(table);

		table_2 = new JTable();
		table_2.setBounds(23, 51, 389, 64);
		contentPane.add(table_2);
		table_2.setModel(new DefaultTableModel(
				new Object[][] {
					{"ID-Transporte",  "Horario Inicio", "Horario Finalizar"},
					{null, null, null},
					{null, null, null},
					{null, null, null},
				},
				new String[] {
						"ID-Transporte", "Horario Inicio", "Horario Finalizar"
				}
				));

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(150, 139, 89, 23);
		contentPane.add(btnNewButton);
	}
}
