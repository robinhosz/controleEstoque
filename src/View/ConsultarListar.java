package View;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Controller.controladorCliente;


public class ConsultarListar extends JPanel {

	public ConsultarListar() {
		initComponents();
	}
	
	public void consultarCliente() {
		controladorCliente c = new controladorCliente();
		
	}
	
	private void initComponents() {
		
		txtdataInicial = new javax.swing.JTextField();
		txtdataFinal = new javax.swing.JTextField();
		lbldataInicial = new javax.swing.JLabel();
		lbldataFinal = new javax.swing.JLabel();
		txtCategoria= new javax.swing.JLabel();
		lblCategoria = new javax.swing.JComboBox();
		
		lbldataInicial.setText("Data Inicial");
		lbldataFinal.setText("Data Final");
		lblCategoria.addItem("Categoria");
		lblCategoria.addItem("Gabinete");
		lblCategoria.addItem("HD");
		lblCategoria.addItem("Memoria");
		lblCategoria.addItem("Mouse");
		lblCategoria.addItem("Processador");
		lblCategoria.addItem("Teclado");
		
		
		this.setLayout(new GridLayout(11,2));
		
		this.add(lbldataInicial);
		this.add(txtdataInicial);
		this.add(lbldataFinal);
		this.add(txtdataFinal);
		this.add(lblCategoria);
		this.add(txtCategoria);
		
	}
	private javax.swing.JLabel lbldataInicial;
	private javax.swing.JLabel lbldataFinal;
	private javax.swing.JComboBox lblCategoria;
	private javax.swing.JTextField txtdataInicial;
	private javax.swing.JTextField txtdataFinal;
	private javax.swing.JLabel txtCategoria;	
	
}
