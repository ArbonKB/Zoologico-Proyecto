package zoologicoNavegacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Salir extends JFrame {

	private JPanel contentPane;
	private JTextField txtGraciasPorUsar;
	private JTextField txtd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salir frame = new Salir();
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
	public Salir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtGraciasPorUsar = new JTextField();
		txtGraciasPorUsar.setText("-------------------------Gracias por usar la app del Zoologico Swing-------------------------");
		contentPane.add(txtGraciasPorUsar, BorderLayout.NORTH);
		txtGraciasPorUsar.setColumns(10);
		
		txtd = new JTextField();
		txtd.setText("Derechos Reservados Will Briceno 2021-2025");
		contentPane.add(txtd, BorderLayout.CENTER);
		txtd.setColumns(10);
	}

}
