package Capa.Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frmEnviarEquipaje extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TextCodigo;
	private JTextField TextVuelo;
	private JTextField TextOrigen;
	private JTextField TextDestino;
	private JTextField TextEstado;
	private JTextField TextBodega;
	private JTextField TextFecha;

	/**
	 * Launch the application.
	 * 
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() {
	 * 
	 * @Override public void run() { try { frmEnviarEquipaje frame = new
	 *           frmEnviarEquipaje(); frame.setVisible(true); } catch (Exception e)
	 *           { e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the frame.
	 */
	public frmEnviarEquipaje() {
		setTitle("Enviar Equipaje");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 474, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TextCodigo = new JTextField();
		TextCodigo.setToolTipText("");
		TextCodigo.setBounds(168, 49, 134, 20);
		contentPane.add(TextCodigo);
		TextCodigo.setColumns(10);

		JLabel lblNewLabel = new JLabel("Codigo :");
		lblNewLabel.setBounds(112, 52, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Vuelo:");
		lblNewLabel_1.setBounds(112, 92, 46, 14);
		contentPane.add(lblNewLabel_1);

		TextVuelo = new JTextField();
		TextVuelo.setToolTipText("");
		TextVuelo.setBounds(167, 89, 135, 20);
		contentPane.add(TextVuelo);
		TextVuelo.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Origen :");
		lblNewLabel_2.setBounds(112, 137, 46, 14);
		contentPane.add(lblNewLabel_2);

		TextOrigen = new JTextField();
		TextOrigen.setBounds(168, 134, 134, 20);
		contentPane.add(TextOrigen);
		TextOrigen.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Destino:");
		lblNewLabel_3.setBounds(112, 181, 46, 14);
		contentPane.add(lblNewLabel_3);

		TextDestino = new JTextField();
		TextDestino.setBounds(168, 178, 134, 20);
		contentPane.add(TextDestino);
		TextDestino.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Estado :");
		lblNewLabel_4.setBounds(112, 219, 46, 14);
		contentPane.add(lblNewLabel_4);

		TextEstado = new JTextField();
		TextEstado.setBounds(168, 216, 134, 20);
		contentPane.add(TextEstado);
		TextEstado.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Bodega:");
		lblNewLabel_5.setBounds(112, 254, 46, 14);
		contentPane.add(lblNewLabel_5);

		TextBodega = new JTextField();
		TextBodega.setBounds(168, 251, 134, 20);
		contentPane.add(TextBodega);
		TextBodega.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Fecha:");
		lblNewLabel_6.setBounds(112, 295, 46, 14);
		contentPane.add(lblNewLabel_6);

		TextFecha = new JTextField();
		TextFecha.setBounds(168, 292, 134, 20);
		contentPane.add(TextFecha);
		TextFecha.setColumns(10);

		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * try {
				 * Controlador.getInstancia().addEquipaje(Integer.parseInt(getId.getText()),
				 * Integer.parseInt(cantT.getText())); List<TransferAlmacen> lista =
				 * Controlador.getInstancia().listarPedido(); infoPedido.setText("Id_Pedido: " +
				 * Controlador.getInstancia().Id_Pedido() + "\n"); for (int i = 0; i <
				 * lista.size(); i++) { infoPedido.append(" Id_Codigo: " +
				 * lista.get(i).get_idProducto() + " Cantidad :" + lista.get(i).get_cantidad() +
				 * "\n"); }
				 * 
				 * } catch (IllegalArgumentException ex) { JOptionPane.showMessageDialog(marco,
				 * ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); }
				 */

			}
		});

		btnNewButton_1.setBounds(170, 334, 120, 23);
		contentPane.add(btnNewButton_1);
	}
}
