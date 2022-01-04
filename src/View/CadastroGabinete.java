package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Controller.controladorCliente;

public class CadastroGabinete extends JPanel{	
	
	private static final long serialVersionUD = 1L;
	
	public CadastroGabinete() {
		initComponents();
		btnBuscarCliente.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent ae) {
			TelaPrincipal tela = new TelaPrincipal();
			tela.consultarCliente();
		}
		});
	}
	
	private void initComponents() {
		
		txtNome = new javax.swing.JTextField();
		txtCpf = new javax.swing.JTextField();
		lblNome = new javax.swing.JLabel();
		lblCpf = new javax.swing.JLabel();
		btnCadastrar = new javax.swing.JButton();
		txtEnd = new javax.swing.JTextField();
		lblEnd = new javax.swing.JLabel();
		lblNasc = new javax.swing.JLabel();
		txtNasc = new javax.swing.JTextField();
		lblIdade = new javax.swing.JLabel();
		txtIdade = new javax.swing.JTextField();
		btnCancelar = new javax.swing.JButton();
		btnBuscarCliente = new javax.swing.JButton();
		
		lblNome.setText("Nome - Colaborador");
		lblNome.setText("Setor");
		lblCpf.setText("Código");
		btnCadastrar.setText("Fornecedor");
		btnBuscarCliente.setText("Buscar Equipamento");
		lblEnd.setText("Ano");
		lblNasc.setText("Fornecedor ou Fabricante");
		lblIdade.setText("Modelo");
		btnCancelar.setText("Cancelar");
		
		this.setLayout(new GridLayout(11, 2));
		
		this.add(lblNome);
		this.add(txtNome);
		this.add(lblCpf);
		this.add(txtCpf);
		this.add(lblEnd);
		this.add(txtEnd);
		this.add(lblIdade);
		this.add(txtIdade);
		this.add(lblNasc);
		this.add(txtNasc);
		this.add(btnBuscarCliente);
		
	}
		public void inserirCliente() {
			if (validarCliente()) {
				controladorCliente c = new controladorCliente();
				Cliente cliente = new Cliente();
				cliente.setNome(txtNome.getText());
				cliente.setCpf(txtCpf.getText());
				cliente.setEnd(txtEnd.getText());
				cliente.setNasc(txtNasc.getText());
				cliente.setIdade(txtIdade.getText());
			}
			
		
	}
		private javax.swing.JButton btnCadastrar;
		private javax.swing.JButton btnCancelar;
		private javax.swing.JButton btnBuscarCliente;
		private javax.swing.JLabel lblCpf;
		private javax.swing.JLabel lblEnd;
		private javax.swing.JLabel lblIdade;
		private javax.swing.JLabel lblNasc;
		private javax.swing.JLabel lblNome;
		private javax.swing.JTextField txtCpf;
		private javax.swing.JTextField txtEnd;
		private javax.swing.JTextField txtIdade;
		private javax.swing.JTextField txtNasc;
		private javax.swing.JTextField txtNome;
		private Cliente cliente;
		private controladorCliente cliCpf;
	
		public boolean validarCliente() {
			cliente = new Cliente();
			cliCpf = new controladorCliente();
			
			if (txtNome.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "É necessário cadastrar o nome.", "Inválido", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			if (txtCpf.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "É necessário cadastrar o Código", "Inválido", JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
			return true;
		}
}