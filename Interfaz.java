package desinExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Interfaz {

	private JFrame frame;
	private JTextField txtDesin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Hola Mundo");
		btnNewButton.setBounds(163, 119, 147, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtDesin = new JTextField();
		txtDesin.setText("Desin");
		txtDesin.setBounds(166, 36, 86, 20);
		frame.getContentPane().add(txtDesin);
		txtDesin.setColumns(10);
	}

}
