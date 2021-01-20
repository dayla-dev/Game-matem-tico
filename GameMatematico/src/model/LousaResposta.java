package model;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class LousaResposta extends Lousa{

	public LousaResposta(int x, int y) {
		super(x, y);
		imagem = new ImageIcon(getClass().getResource("/lousaRespostas.png"));
		
		areaLousa = new Rectangle(x, y, largura, altura);
	}

	public void paint(Graphics g){
		g.drawImage(imagem.getImage(), getX(), getY(), null);
	}

	public Rectangle getAreaLousa() {
		areaLousa.setBounds(getX(), getY()-20, getLargura(), getAltura());
		return areaLousa;
	}
}
