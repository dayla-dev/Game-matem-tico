package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaInstrucoes extends FrameJogo{

	private static final long serialVersionUID = 1L;
	private JButton voltarButton;
	
	public TelaInstrucoes() {
		super();
		setLayout(null);
		
		voltarButton = new JButton("Voltar");
		voltarButton.setBounds(170, 500, 90, 45);
		
		add(voltarButton);
	}
	
	public void paint(Graphics g){	
		g.setColor(Color.WHITE);
		g.setFont(new Font("Serif", Font.BOLD, 18));
		g.drawString("INSTRUCOES", 50, 100);
		g.drawString("PARA SINGLEPLAYER", 50, 130);
		g.drawString("PARA MOVER O PERSONAGEM, pressione as teclas", 50, 160);
		g.drawString("A - para mover o personagem para Esquerda", 50, 190);
		g.drawString("D - para mover o personagem par Direita", 50, 220);
		g.drawString("W - para o personagem atirar", 50, 250);
		g.drawString("PARA MULTIPLAYER", 50, 280);
		g.drawString("PARA MOVER O PERSONAGEM PLAYER 2", 50, 310);
		g.drawString("LEFT - Para mover o personagem para ESQUERDA", 50, 340);
		g.drawString("RIGHT - para mover o personagem para direita", 50, 370);
		g.drawString("UP - para o player 2 atirar", 50, 400);
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}
}
