package Capa.Presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

public class frmTransporteHorario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					frmTransporteHorario frame = new frmTransporteHorario();
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
	public frmTransporteHorario() {
		setTitle("Disponibilidad Horario");
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

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(114, 96, 203, 20);
		panel.add(dateChooser);

		JLabel lblNewLabel = new JLabel("Selecciona Horario");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel.setBounds(128, 30, 189, 34);
		panel.add(lblNewLabel);
	}
}
