package zoologicoNavegacion;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Table extends JFrame {
	private JTextField tFNombreDelAnimal;
	private JTextField tFTipoDeAnimal;
	private JTextField tFEdadDelAnimal;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table frame = new Table();
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
	public Table() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		
		String [] header={"Nombre del Animal","Tipo de Animal", "Edad del Animal"};
	    Object [][] data={};
	    DefaultTableModel model = new DefaultTableModel(data,header);
		JTable table = new JTable(model);

		table.setPreferredScrollableViewportSize(new Dimension(450,63));
		table.setFillsViewportHeight(true);
		
		JScrollPane js = new JScrollPane(table);
		js.setVisible(true);
		js.setBounds(10, 89, 414, 161);
		getContentPane().add(js);
		/*String [] header={"Nombre del Animal","Tipo de Animal", "Edad del Animal"};
	    Object [][] data={};


	    DefaultTableModel model = new DefaultTableModel(data,header);

	    JTable table = new JTable(model);

	    table.setPreferredScrollableViewportSize(new Dimension(450,63));
	    table.setFillsViewportHeight(true);

	    JScrollPane js=new JScrollPane(table);
	    js.setVisible(true);*/
		
		JLabel lbNombreDelAnimal = new JLabel("Nombre del Animal");
		lbNombreDelAnimal.setBounds(10, 11, 109, 14);
		getContentPane().add(lbNombreDelAnimal);
		
		tFNombreDelAnimal = new JTextField();
		tFNombreDelAnimal.setBounds(119, 8, 86, 20);
		getContentPane().add(tFNombreDelAnimal);
		tFNombreDelAnimal.setColumns(10);
		
		JLabel lbTipoDeAnimal = new JLabel("Tipo de Animal");
		lbTipoDeAnimal.setBounds(10, 36, 109, 14);
		getContentPane().add(lbTipoDeAnimal);
		
		tFTipoDeAnimal = new JTextField();
		tFTipoDeAnimal.setBounds(119, 33, 86, 20);
		getContentPane().add(tFTipoDeAnimal);
		tFTipoDeAnimal.setColumns(10);
		
		JLabel lbEdadDelAnimal = new JLabel("Edad del Animal");
		lbEdadDelAnimal.setBounds(10, 64, 109, 14);
		getContentPane().add(lbEdadDelAnimal);
		
		tFEdadDelAnimal = new JTextField();
		tFEdadDelAnimal.setBounds(119, 61, 86, 20);
		getContentPane().add(tFEdadDelAnimal);
		tFEdadDelAnimal.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] Datos = new String[3];
        		Datos[0] = tFNombreDelAnimal.getText();
        		tFNombreDelAnimal.setText(null);
        		Datos[1] = tFTipoDeAnimal.getText();
        		tFNombreDelAnimal.setText(null);
        		Datos[2] = tFEdadDelAnimal.getText();
        		tFNombreDelAnimal.setText(null);
        		model.addRow(Datos);
			}
		});
		btnAgregar.setBounds(225, 7, 89, 23);
		getContentPane().add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeRow(table.getSelectedRow());
			}
		});
		btnEliminar.setBounds(225, 36, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnEliminarTodo = new JButton("Eliminar Todo");
		btnEliminarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=table.getRowCount()-1;i>=0;i--) {
	        		model.removeRow(i);
	        	}
			}
		});
		btnEliminarTodo.setBounds(324, 7, 100, 23);
		getContentPane().add(btnEliminarTodo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salir nuevoSalir = new Salir();
				nuevoSalir.setVisible(true);
				Table.this.setVisible(false);
			}
		});
		btnSalir.setBounds(324, 36, 100, 23);
		getContentPane().add(btnSalir);
		
		

	}
}
