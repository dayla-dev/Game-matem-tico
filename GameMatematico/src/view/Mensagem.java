package view;

import javax.swing.JOptionPane;

public class Mensagem {

	public static void erroImageSprite(){
		JOptionPane.showMessageDialog(null, "Nao foi possivel abrir a Sprite");
	}
	
	public static void mensagemErro(){
		JOptionPane.showMessageDialog(null, "Resposta incorreta");
	}
	
	public static void mensagemAcerto(){
		JOptionPane.showMessageDialog(null, "Certa resposta");
	}
}
