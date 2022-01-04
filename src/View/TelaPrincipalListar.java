package View;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Controller.controladorCliente;

public class TelaPrincipalListar extends JPanel {

	private static final long serialVersionUID = 1L;

    public void consultarListar() {
        ConsultarListar cliente = new ConsultarListar();

        boolean manterJanelaAberta = true;

        while (manterJanelaAberta) {
            Object[] options = {"Listar", "Cancelar"};
            int ret = JOptionPane.showOptionDialog(
                    this,
                    cliente,
                    "Repositorio",
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