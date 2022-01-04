package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Controller.controladorCliente;
import javax.swing.JComboBox;

public class CadastroListar extends JPanel{	
	
	private static final long serialVersionUD = 1L;
	
	private void initComponents() {
		
		txtdataInicial = new javax.swing.JTextField();
		txtdataFinal = new javax.swing.JTextField();
		lbldataInicial = new javax.swing.JLabel();
		lbldataFinal = new javax.swing.JLabel();
		btnListar = new javax.swing.JButton();
		txtCategoria = new javax.swing.JLabel();
		lblCategoria = new javax.swing.JComboBox();
		btnCancelar = new javax.swing.JButton();
		
		lbldataInicial.setText("Data Inicial");
		lbldataFinal.setText("Data Final");
		lblCategoria.addItem("Categoria");
		lblCategoria.addItem("Gabinete");
		lblCategoria.addItem("HD");
		lblCategoria.addItem("Memoria");
		lblCategoria.addItem("Mouse");
		lblCategoria.addItem("Processador");
		lblCategoria.addItem("Teclado");
		btnListar.setText("Listar");
		btnCancelar.setText("Cancelar");
		
		this.setLayout(new GridLayout(11, 2));
		
		this.add(lbldataInicial);
		this.add(txtdataInicial);
		this.add(lbldataFinal);
		this.add(txtdataFinal);
		this.add(lblCategoria);
		this.add(txtCategoria);
		
	}
		public void inserirCliente() {
			if (validarCliente()) {
				controladorCliente c = new controladorCliente();
				Listar cliente = new Listar();
				cliente.setDataInicial(txtdataInicial.getText());
				cliente.setDataFinal(txtdataFinal.getText());
				
			}
			
		
	}
		private javax.swing.JButton btnListar;
		private javax.swing.JButton btnCancelar;
		private javax.swing.JLabel lbldataInicial;
		private javax.swing.JLabel lbldataFinal;
		private javax.swing.JComboBox lblCategoria;
		private javax.swing.JTextField txtdataInicial;
		private javax.swing.JTextField txtdataFinal;
		private javax.swing.JLabel txtCategoria;
		private Listar cliente;
		private controladorCliente cliCpf;
	
		public boolean validarCliente() {
			cliente = new Listar();
			cliCpf = new controladorCliente();
			
			if (txtdataInicial.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "É necessário colocar a data inicial.", "Inválido", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			if (txtdataFinal.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "É necessário colocar a data final", "Inválido", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
}