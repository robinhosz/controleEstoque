package View;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.tools.Tool;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Image;
import Controller.controladorCliente;


public class TelaPrincipal extends JPanel {
	
	ImageIcon imagem = new ImageIcon(getClass().getResource("novaconexao.png"));
	JLabel label = new JLabel(imagem);
	
	
	public TelaPrincipal() {
		add(label);
	}


	private static final long serialVersionUID = 1L;
	
	public void adicionarCliente() {
        CadastroGabinete cliente = new CadastroGabinete();
        
        boolean manterJanelaAberta = true;

        while (manterJanelaAberta) {
            Object[] options = {"Adicionar", "Cancelar"};
            int ret = JOptionPane.showOptionDialog(
                    this,
                    cliente,
                    "Cadastro Gabinete",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);
            if (ret == JOptionPane.OK_OPTION) {
                cliente.inserirCliente();
            } else {
                manterJanelaAberta = false;
            }
        }
    }

    public void consultarCliente() {
        ConsultarGabinete cliente = new ConsultarGabinete();

        boolean manterJanelaAberta = true;

        while (manterJanelaAberta) {
            Object[] options = {"Consultar", "Cancelar"};
            int ret = JOptionPane.showOptionDialog(
                    this,
                    cliente,
                    "Consultar Equipamento",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);


            if (ret == JOptionPane.OK_OPTION) {

                cliente.consultarCliente();

            } else {
                manterJanelaAberta = false;
            }
        }
    }

	public void adicionarProcessador1() {
		// TODO Auto-generated method stub
		
	}

	public void adicionarProcessador() {
		// TODO Auto-generated method stub
		
	}
}