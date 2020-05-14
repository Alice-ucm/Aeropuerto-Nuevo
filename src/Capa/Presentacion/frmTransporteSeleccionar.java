package Capa.Presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class frmTransporteSeleccionar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					frmTransporteSeleccionar frame = new frmTransporteSeleccionar();
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
	public frmTransporteSeleccionar() {
		setTitle("Seleccionar Transporte");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 256);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton_8 = new JButton("Aceptar");
		btnNewButton_8.setBounds(157, 189, 89, 23);
		panel.add(btnNewButton_8);

		JLabel lblNewLabel = new JLabel("Selecciona Transporte");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel.setBounds(128, 30, 189, 34);
		panel.add(lblNewLabel);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Taxi");
		rdbtnNewRadioButton.setBounds(76, 95, 57, 23);
		panel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Bus");
		rdbtnNewRadioButton_1.setBounds(186, 95, 60, 23);
		panel.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Otros");
		rdbtnNewRadioButton_2.setBounds(275, 95, 77, 23);
		panel.add(rdbtnNewRadioButton_2);
	}
}
