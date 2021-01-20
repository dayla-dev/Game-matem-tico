package model;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Tiro extends Thread {
	
	private int x, y;
	private int largura=11, altura=19;
	private ImageIcon imagemFlecha;
	private Rectangle areaTiro;
	
	
	public Tiro(int x, int y) {
		this.x = x;
		this.y = y;
		imagemFlecha = new ImageIcon(getClass().getResource("/tiro.png"));
		areaTiro = new Rectangle(x, y, largura, altura);
		
	}

	public void paint(Graphics g){
		g.drawImage(imagemFlecha.getImage(), x, y, null);
	}
	
	public void mover(){
		y-=5;
	}

	public void run() {
		
		while(true){
			mover();
			
			try {
				sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	public Rectangle getAreaTiro() {
		areaTiro.setBounds(x, y, largura, altura);
		return areaTiro;
	}
	

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
