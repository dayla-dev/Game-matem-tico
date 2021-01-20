package app;

import model.Som;
import controller.ControleTelaInicial;
import view.TelaInicio;
import view.TelaCredito;
import view.TelaInstrucoes;

public class App {

	public static void main(String[] args) {
		
	TelaInicio telaInicio = new TelaInicio();
	TelaInstrucoes telaInstrucoes = new TelaInstrucoes();
	TelaCredito telaCredito = new TelaCredito();
	Som som = new Som();
	ControleTelaInicial cti = new ControleTelaInicial(telaInicio, telaInstrucoes, telaCredito, som);
	cti.control();
	}
}
