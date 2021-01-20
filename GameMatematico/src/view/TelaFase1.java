package view;

import model.Aluno;
import model.Aluno2;
import model.Fase1;
import model.Operacao;

public class TelaFase1 extends FrameJogo{
	
	private static final long serialVersionUID = 1L;
	Fase1  fase1;
	Aluno aluno1;
	Aluno2 aluno2;
	Operacao panelInformacao;
	
	public TelaFase1(){
		super();
		
		fase1 = new Fase1();
		fase1.setBounds(0, 0, 600, 600);
		
		panelInformacao = new Operacao();
		panelInformacao.setBounds(600, 0, 900, 600);
	
		
		add(fase1);
		add(panelInformacao);
		
		setVisible(false);
	}
	
	public TelaFase1(Aluno aluno1, Aluno2 aluno2){
super();
		
		fase1 = new Fase1(aluno1, aluno2);
		fase1.setBounds(0, 0, 600, 600);
		
		panelInformacao = new Operacao();
		panelInformacao.setBounds(600, 0, 900, 600);
	
		
		add(fase1);
		add(panelInformacao);
		
		setVisible(false);
	}

	public Fase1 getFase1() {
		return fase1;
	}
	
}
