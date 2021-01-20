package model;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Lousa {
	
	protected int x, y;
	protected int largura=80, altura=70;
	protected ImageIcon imagem;
	protected Rectangle areaLousa;
	
	public Lousa(int x, int y) {
		this.x = x;
		this.y = y;		
		imagem = new ImageIcon(getClass().getResource("/lousaRespostas.png"));
		areaLousa = new Rectangle(x, y, largura, altura);
	}
	
	public void paint(Graphics g){
	g.drawImage(imagem.getImage(), x, y, null);
	}	
	
	public Rectangle getAreaLousa() {
		areaLousa.setBounds(x, y-20, largura, altura);
		return areaLousa;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getLargura() {
		return largura;
	}
	public int getAltura() {
		return altura;
	}
	
}
