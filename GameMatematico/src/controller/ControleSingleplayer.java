package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;
import view.TelaFase1;

public class ControleSingleplayer {

	private TelaFase1 fase1;
	Timer timer;
	

	public ControleSingleplayer(final TelaFase1 fase1) {
		this.fase1 = fase1;
		
	}
	
	public void control(){			
		
		this.fase1.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
				System.exit(0);
			}
			if(e.getKeyCode() == KeyEvent.VK_D){
				fase1.getFase1().getAluno().moverDireita();
			}
			if(e.getKeyCode() == KeyEvent.VK_A){
				fase1.getFase1().getAluno().moverEsquerda();
			}
			if(e.getKeyCode() == KeyEvent.VK_W){
				fase1.getFase1().getAluno().atirar();
			}
			}
		});		
		
	}

}
