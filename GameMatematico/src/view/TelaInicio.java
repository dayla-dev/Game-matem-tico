package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaInicio extends FrameJogo{

	private static final long serialVersionUID = 1L;
	private ImageIcon imageInicial;
	private JButton buttonSigleP, buttonMultiP, buttonAjuda, buttonCreditos, buttonSair;
	
	public TelaInicio() {
		super();
		setLayout(null);
		
		setForeground(Color.black);
		
		
		imageInicial = new ImageIcon(getClass().getResource("/ImageInicial.png"));
		
		buttonSigleP = new JButton(new ImageIcon(getClass().getResource("/singlePlayer.png")));
		buttonMultiP = new JButton(new ImageIcon(getClass().getResource("/botaoMultiPlayer.png")));
		buttonAjuda = new JButton(new ImageIcon(getClass().getResource("/botaoAjuda.png")));
		buttonCreditos = new JButton(new ImageIcon(getClass().getResource("/botaoCreditos.png")));
		buttonSair = new JButton(new ImageIcon(getClass().getResource("/botaoSair.png")));
		
		buttonSigleP.setBounds(300, 300, 118, 44);
		buttonMultiP.setBounds(300, 350, 118, 44);
		buttonAjuda.setBounds(300, 400, 118, 44);
		buttonCreditos.setBounds(300, 450, 118, 44);
		buttonSair.setBounds(300, 500, 118, 44);
		
		add(buttonSigleP);
		add(buttonMultiP);
		add(buttonAjuda);
		add(buttonCreditos);
		add(buttonSair);
		
		setVisible(true);
	}	
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawImage(imageInicial.getImage(), 0, 0, this);
	}

	public ImageIcon getImageInicial() {
		return imageInicial;
	}


	public JButton getButtonSigleP() {
		return buttonSigleP;
	}

	public JButton getButtonMultiP() {
		return buttonMultiP;
	}

	public JButton getButtonAjuda() {
		return buttonAjuda;
	}

	public JButton getButtonCreditos() {
		return buttonCreditos;
	}

	public JButton getButtonSair() {
		return buttonSair;
	}
	
}
