package View;

import View.TelaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;


public class Principal extends JFrame{
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Nova Conexão - Sistema de Cadastro de Equipamentos");
		
		TelaPrincipal tela = new TelaPrincipal();
		
		janela.add(tela);
		
		JMenuBar menuTopo = new JMenuBar();
		JMenu menuCadastro = new JMenu("Cadastrar");
		JMenu menuVenda = new JMenu("Buscar");
		menuVenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	TelaPrincipal tela = new TelaPrincipal();
            	tela.adicionarCliente();
            }
        });
		JMenu menuRelatorio = new JMenu("Repositório");
		JMenuItem item1 = new JMenuItem("Gabinete");
		item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	TelaPrincipal tela = new TelaPrincipal();
            	tela.adicionarCliente();
            }
        });
		JMenuItem item2 = new JMenuItem("Processador");
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event){
				TelaPrincipalProcessador tela = new TelaPrincipalProcessador();
				tela.adicionarProcessador();
			
			}
		});
				
		JMenuItem item3 = new JMenuItem("Memória");
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			TelaPrincipalMemoria tela = new TelaPrincipalMemoria();
			tela.adicionarMemoria();
							
			}
		});
		JMenuItem item4 = new JMenuItem("HD");
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			TelaPrincipalHD tela = new TelaPrincipalHD();
			tela.adicionarHD();
			
			}
		});
		JMenuItem item5 = new JMenuItem("Teclado");
		item5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			TelaPrincipalTeclado tela = new TelaPrincipalTeclado();
			tela.adicionarTeclado11();
			}
		});
		JMenuItem item6 = new JMenuItem("Mouse");
		item6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			TelaPrincipalMouse tela = new TelaPrincipalMouse();
			tela.adicionarMouse();
			}
		});
		JMenuItem item7 = new JMenuItem("Equipamentos");
		item7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			TelaPrincipalBuscar tela = new TelaPrincipalBuscar();
			tela.consultarCliente();
			}
		});
		JMenuItem item8 = new JMenuItem("Listar equipamentos");
		item8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
			TelaPrincipalListar tela = new TelaPrincipalListar();
			tela.consultarListar();
			}
		});
		
		janela.setJMenuBar(menuTopo);
		menuTopo.add(menuCadastro);
		menuTopo.add(menuVenda);
		menuTopo.add(menuRelatorio);
		menuCadastro.add(item1);
		menuCadastro.add(item2);
		menuCadastro.add(item3);
		menuCadastro.add(item4);
		menuCadastro.add(item5);
		menuCadastro.add(item6);
		menuVenda.add(item7);
		menuRelatorio.add(item8);
	
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.setLocation(500, 200);
		janela.setSize(500,500);
		
		
	}

}