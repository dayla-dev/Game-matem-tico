package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Aluno;
import model.Aluno2;
import model.Som;
import model.Operacao.Operacoes;
import view.TelaFase1;
import view.TelaInicio;
import view.TelaCredito;
import view.TelaInstrucoes;

public class ControleTelaInicial implements ActionListener{

	private TelaInicio telaInicio;
	private TelaCredito telaCredito;
	private TelaInstrucoes telaInstrucoes;
	private Som som;
	
	
	public ControleTelaInicial(TelaInicio telaInicio, TelaInstrucoes telaInstrucoes, TelaCredito telaCredito, Som som) {
		super();
		this.telaInicio = telaInicio;
		this.telaInstrucoes = telaInstrucoes;
		this.telaCredito = telaCredito;
		this.som=som;
		
		som.getMusicaTelaInicio().loop();
	}	
	
	public void control(){
		telaInicio.getButtonSigleP().addActionListener(this);
		telaInicio.getButtonMultiP().addActionListener(this);
		telaInicio.getButtonAjuda().addActionListener(this);
		telaInicio.getButtonCreditos().addActionListener(this);
		telaInicio.getButtonSair().addActionListener(this);	
		telaInstrucoes.getVoltarButton().addActionListener(this);
		telaCredito.getVoltarButton().addActionListener(this);		
	}


	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == telaInicio.getButtonSigleP()){
			som.getMusicaTelaInicio().stop();
			telaInicio.setVisible(false);
			TelaFase1 telafase1 =	new TelaFase1();
			telafase1.setVisible(true);
			ControleSingleplayer cf1 = new ControleSingleplayer(telafase1);
			cf1.control();
		}
		if(event.getSource() == telaInicio.getButtonMultiP()){
			som.getMusicaTelaInicio().stop();
			telaInicio.setVisible(false);
			Aluno aluno1 = new Aluno();
			Aluno2 aluno2 = new Aluno2();
			TelaFase1 telafase1 =	new TelaFase1(aluno1, aluno2);
			telafase1.setVisible(true);
			ControllerFase1Mult cf1m = new ControllerFase1Mult(telafase1);
			cf1m.control();
		}
		if(event.getSource() == telaInicio.getButtonAjuda()){
			telaInstrucoes.setVisible(true);
			telaInicio.setVisible(false);
			som.getMusicaTelaInicio().stop();
		}
//		if(event.getSource() == telaInicio.getButtonCreditos()){
//			telaCredito.setVisible(true);
//			telaInicio.setVisible(false);
//			som.getMusicaTelaInicio().stop();
//		}
		if(event.getSource() == telaInicio.getButtonSair()){
			System.exit(0);
		}
		if(event.getSource() == telaInstrucoes.getVoltarButton()){
			telaInstrucoes.setVisible(false);
			telaInicio.setVisible(true);
			som.getMusicaTelaInicio().play();
		}
		if(event.getSource() == telaCredito.getVoltarButton()){
			telaCredito.setVisible(false);
			telaInicio.setVisible(true);
			som.getMusicaTelaInicio().play();
		}		
	}
}
