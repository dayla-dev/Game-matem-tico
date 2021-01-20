package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import model.Operacao;
import view.TelaFase1;

public class ControllerFase1Mult {
	
	private TelaFase1 fase1;
	

	public ControllerFase1Mult(TelaFase1 fase1) {
		this.fase1 = fase1;
		Operacao.setMult(true);
	}
	
	public void control(){
		this.fase1.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_D){
					fase1.getFase1().getAluno().moverDireita();
				}
				if(e.getKeyCode() == KeyEvent.VK_A){
					fase1.getFase1().getAluno().moverEsquerda();
				}
				if(e.getKeyCode() == KeyEvent.VK_W){
					fase1.getFase1().getAluno().atirar();
				}
				
				if(e.getKeyCode() ==  KeyEvent.VK_RIGHT){
					fase1.getFase1().getAluno2().moverDireita();
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					fase1.getFase1().getAluno2().moverEsquerda();
				}
				if(e.getKeyCode() == KeyEvent.VK_UP){
					fase1.getFase1().getAluno2().atirar();
				}
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
					System.exit(0);
				}
			}
		});
	}

}
