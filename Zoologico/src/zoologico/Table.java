package zoologico;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Table extends JPanel{

    JTable jt;
    private JTextField tFNombreDelAnimal;
    private JTextField tFTipoDeAnimal;
    private JTextField tFEdadDelAnimal;
    public Table(){

        String [] header={"Nombre del Animal","Tipo de Animal", "Edad del Animal"};
        Object [][] data={};


        DefaultTableModel model = new DefaultTableModel(data,header);

        JTable table = new JTable(model);

        table.setPreferredScrollableViewportSize(new Dimension(450,63));
        table.setFillsViewportHeight(true);

        JScrollPane js=new JScrollPane(table);
        js.setVisible(true);
        
        JLabel lbNombre = new JLabel("Nombre del Animal");
        add(lbNombre);
        
        tFNombreDelAnimal = new JTextField();
        add(tFNombreDelAnimal);
        tFNombreDelAnimal.setColumns(10);
        
        JLabel lbTipoDeAnimal = new JLabel("Tipo de Animal");
        lbTipoDeAnimal.setHorizontalAlignment(SwingConstants.TRAILING);
        add(lbTipoDeAnimal);
        
        tFTipoDeAnimal = new JTextField();
        add(tFTipoDeAnimal);
        tFTipoDeAnimal.setColumns(10);
        
        JLabel lbEdadDelAnimal = new JLabel("Edad del Animal");
        add(lbEdadDelAnimal);
        
        tFEdadDelAnimal = new JTextField();
        add(tFEdadDelAnimal);
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
        add(btnAgregar);
        
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		model.removeRow(table.getSelectedRow());
        	}
        });
        add(btnEliminar);
        
        JButton btnEliminarTodo = new JButton("Eliminar Todo");
        btnEliminarTodo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 
        		for(int i=table.getRowCount()-1;i>=0;i--) {
        		model.removeRow(i);
        		}
        	}
        });
        add(btnEliminarTodo);
        
        JButton btnModificar = new JButton("Modificar");
        add(btnModificar);
        add(js);
        
        
        
    }

    public static void main(String [] a) {

        JFrame jf=new JFrame();
        Table tab= new Table();
        jf.setTitle("Table");
        jf.setSize(500, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().add(tab);




    }

}