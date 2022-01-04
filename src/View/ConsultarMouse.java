package View;

import java.awt.GridLayout;
import javax.swing.JPanel;
import Controller.controladorCliente;

public class ConsultarMouse extends JPanel {

	public ConsultarMouse() {
		initComponents();
	}
	
	public void consultarCliente() {
		controladorCliente c = new controladorCliente();
		
		/** Cliente cliente = c.consultarCliente(txtCpf.getText());
		txtNome.setText(cliente.getNome());
		txtEnd.setText(cliente.getEnd());
		txtIdade.setText(cliente.getIdade());
		txtNasc.setText(cliente.getNasc());
		
		 **/
	}
	
	private void initComponents() {
		
		txtNome = new javax.swing.JTextField();
		txtCpf = new javax.swing.JTextField();
		lblNome = new javax.swing.JLabel();
		lblCpf = new javax.swing.JLabel();
		txtEnd = new javax.swing.JTextField();
		lblEnd = new javax.swing.JLabel();
		lblNasc = new javax.swing.JLabel();
		txtNasc = new javax.swing.JTextField();
		lblIdade = new javax.swing.JLabel();
		txtIdade = new javax.swing.JTextField();
		
		lblNome.setText("Nome");
		lblCpf.setText("Código (ID)");
		lblEnd.setText("Modelo");
		lblNasc.setText("Ano");
		lblIdade.setText("Observação");
		
		this.setLayout(new GridLayout(11,2));
		
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
		
		txtNome.enable(false);
		txtEnd.enable(false);
		txtNasc.enable(false);
		txtIdade.enable(false);
		
	}
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

}