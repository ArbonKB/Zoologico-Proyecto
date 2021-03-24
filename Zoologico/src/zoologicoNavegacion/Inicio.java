package zoologicoNavegacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JDesktopPane;

public class Inicio extends JFrame {
	Table tb;
	private JPanel contentPane;
	private JTextField tFUsuario;
	private JTextField tFClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		
		setTitle("Zoologico Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbUsuario = new JLabel("Usuario");
		lbUsuario.setBounds(107, 29, 46, 14);
		contentPane.add(lbUsuario);
		
		tFUsuario = new JTextField();
		tFUsuario.setBounds(163, 26, 97, 20);
		contentPane.add(tFUsuario);
		tFUsuario.setColumns(10);
		
		JLabel lbClave = new JLabel("Clave");
		lbClave.setBounds(107, 66, 46, 14);
		contentPane.add(lbClave);
		
		tFClave = new JTextField();
		tFClave.setBounds(163, 63, 97, 20);
		contentPane.add(tFClave);
		tFClave.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table nuevaTable = new Table();
				nuevaTable.setVisible(true);
				Inicio.this.setVisible(false);
			}
		});
		btnIniciarSesion.setBounds(160, 94, 100, 23);
		contentPane.add(btnIniciarSesion);
	}
}
