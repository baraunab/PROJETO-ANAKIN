package view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Tela inicial exibida ao usuário 
 * @author baraunab
 */

public class TelaInicialVIEW extends JFrame {
	// elementos da tela
	private CardLayout layout;
	
	private JPanel panelPrincipal;
	private JPanel panelTitulo;
	private JPanel panelConfig;
	
	private JButton btnConfig;
	private JButton btnComecar;
	
	public TelaInicialVIEW() {
		this.layout = new CardLayout();
		
		this.panelPrincipal = new JPanel(layout);
		this.panelTitulo = new JPanel();
		this.panelConfig = new JPanel();
		
		this.btnConfig = new JButton("Configurações");
		this.btnComecar = new JButton("Começo");
		
		this.panelTitulo.setBackground(Color.magenta);
		this.panelConfig.setBackground(Color.pink);
		this.panelConfig.add(btnComecar);
		this.panelTitulo.add(btnConfig);
		
		this.panelPrincipal.add(panelTitulo, "Titulo");
		this.panelPrincipal.add(panelConfig, "Configs");
		
		this.btnConfig.addActionListener((e) -> {
			this.layout.show(panelPrincipal, "Configs");
			
		});
		
		this.btnComecar.addActionListener((e) -> {
			this.layout.show(panelPrincipal, "Titulo");
			
		});
		
		this.add(panelPrincipal);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
}
