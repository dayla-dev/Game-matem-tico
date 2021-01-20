package view;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaCredito extends FrameJogo{

	private static final long serialVersionUID = 1L;
	private ImageIcon backgroundInstrucao;
	 private JButton voltarButton;
	
	 public TelaCredito() {
		super();
		setLayout(null);
		
		backgroundInstrucao = new ImageIcon(getClass().getResource("/telaCreditos1.png"));
		voltarButton = new JButton("Voltar");
		voltarButton.setBounds(170, 500, 90, 45);
		
		add(voltarButton);
		
	}
	 public void paint(Graphics g){
		g.drawImage(backgroundInstrucao.getImage(), 0, 0, this); 
	 }
	public JButton getVoltarButton() {
		return voltarButton;
	}
	 
}

