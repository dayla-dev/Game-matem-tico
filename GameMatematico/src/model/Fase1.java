package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import view.Mensagem;


public class Fase1 extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	ImageIcon background;
	Aluno aluno;
	Aluno2 aluno2;
	private Timer timer;
	Lousa lousa1, lousa2, lousa3;
	LousaResposta lousaResposta;
	Som som;
	boolean mult;
	
	public Fase1() {
		setLayout(null);
		
		background = new ImageIcon(getClass().getResource("/background.png"));
		
		lousa1 = new Lousa(40, 150);
		lousa2 = new Lousa(190, 150);
		lousaResposta = new LousaResposta(350, 150);
		lousa3 = new Lousa(510, 150);
		
		aluno = new Aluno();
		timer = new Timer(100, this);
		timer.start();
		
		som = new Som();
		
	}
	
	
	public Fase1(Aluno aluno1, Aluno2 aluno2) {
		setLayout(null);
		
		mult = true;
		
		background = new ImageIcon(getClass().getResource("/background.png"));
		
		lousa1 = new Lousa(40, 150);
		lousa2 = new Lousa(190, 150);
		lousaResposta = new LousaResposta(350, 150);
		lousa3 = new Lousa(510, 150);
		
		this.aluno=aluno1;
		this.aluno2=aluno2;
		 
		timer = new Timer(100, this);
		timer.start();
		
		som = new Som();
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawImage(background.getImage(), 0, 0, this);
		g.setColor(Color.WHITE);
		g.setFont(new Font("",Font.PLAIN, 20));
		lousaResposta.paint(g);		
		g.drawString(String.valueOf(Operacao.getC()), 380, 190);
		lousa1.paint(g);
		lousa2.paint(g);
		lousa3.paint(g);
		g.drawString(String.valueOf(Operacao.getD()), 65, 190);
		g.drawString(String.valueOf(Operacao.getE()), 225, 190);
		g.drawString(String.valueOf(Operacao.getF()), 545, 190);
		
		aluno.paint(g);	
		
		if(mult){
			aluno2.paint(g);
		}
		
	}	

	public void verificarErrouBalao(){
		for(int i=0; i <aluno.getTiro().size();i++){
			if(aluno.getTiro().get(i).getAreaTiro().intersects(lousa1.getAreaLousa())){
				som.getSomRespostaErrada().play();
				Mensagem.mensagemErro();
				aluno.errarResposta();
				Operacao.setTime(21);	
							
				
			}
			if(aluno.getTiro().get(i).getAreaTiro().intersects(lousa2.getAreaLousa())){
				som.getSomRespostaErrada().play();
				aluno.errarResposta();
				Mensagem.mensagemErro();
				Operacao.setTime(21);				
			}
			if(aluno.getTiro().get(i).getAreaTiro().intersects(lousa3.getAreaLousa())){
				som.getSomRespostaErrada().play();
				aluno.errarResposta();
				Mensagem.mensagemErro();
				Operacao.setTime(21);
								
			}
		}
		if(mult){
			for(int i=0; i <aluno2.getTiro().size();i++){
				if(aluno2.getTiro().get(i).getAreaTiro().intersects(lousa1.getAreaLousa())){
					som.getSomRespostaErrada().play();
					Mensagem.mensagemErro();
					aluno2.errarResposta();
					Operacao.setTime(21);				
				}
				if(aluno2.getTiro().get(i).getAreaTiro().intersects(lousa2.getAreaLousa())){
					som.getSomRespostaErrada().play();
					aluno2.errarResposta();
					Mensagem.mensagemErro();
					Operacao.setTime(21);				
				}
				if(aluno2.getTiro().get(i).getAreaTiro().intersects(lousa3.getAreaLousa())){
					som.getSomRespostaErrada().play();
					aluno2.errarResposta();
					Mensagem.mensagemErro();
					Operacao.setTime(21);
									
				}
			}
		}
	}
	

	public void verificarAcertouBalao(){
		for(int i=0; i <aluno.getTiro().size();i++){
			if(aluno.getTiro().get(i).getAreaTiro().intersects(lousaResposta.getAreaLousa())){
				som.getSomCertaResposta().play();
				aluno.acertarResposta();
				Mensagem.mensagemAcerto();
				Operacao.setTime(21);				
			}
		}
		if(mult){
			for(int i=0; i <aluno2.getTiro().size();i++){
				if(aluno2.getTiro().get(i).getAreaTiro().intersects(lousaResposta.getAreaLousa())){
					som.getSomCertaResposta().play();
					aluno2.acertarResposta();
					Mensagem.mensagemAcerto();
					Operacao.setTime(21);				
				}
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		aluno.checarTiro();
		if(mult){
			aluno2.checarTiro();

			Operacao.acertosAluno2(aluno2.getAcertos());
			Operacao.errosAluno2(aluno2.getErros());
		}
		verificarErrouBalao();
		verificarAcertouBalao();
		Operacao.acertosAluno1(aluno.getAcertos());
		Operacao.errosAluno1(aluno.getErros());
		
		repaint();
		
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public Aluno2 getAluno2() {
		return aluno2;
	}
	
}
