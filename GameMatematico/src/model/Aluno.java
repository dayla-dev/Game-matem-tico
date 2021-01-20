package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import view.Mensagem;

public class Aluno {

	private int x=10, y=500;
	private int largura=33, altura=44;
	private BufferedImage imagemPersonagem;
	private BufferedImage[] sprites;
	private int aparencia=3;
	private boolean direita=true;
	private ArrayList<Tiro> tiros;
	private Rectangle areaAluno;
	private int acertos = 0;
	private int erros = 0;
		
	
	public Aluno() {

		try{
			imagemPersonagem = ImageIO.read(getClass().getResource("/personagem1.png"));
		}
		catch(IOException e){
			Mensagem.erroImageSprite();
			e.printStackTrace();
		}
		sprites = new BufferedImage[10];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				sprites[(i * 3 )+j] = imagemPersonagem.getSubimage(i*largura, j*altura, largura, altura);
			}
		}
		areaAluno = new Rectangle(x, y, largura, altura);
		tiros = new ArrayList<>();
		
	}
	
	public void paint(Graphics g){
		g.drawImage(sprites[aparencia], x, y, null);
		
		for(Tiro tiro : tiros){
			tiro.paint(g);
		}
	}
	
	public void acertarResposta(){
		acertos+=1;
	}
	
	public void errarResposta(){
		erros+=1;		
	}
	
    public void moverDireita(){
		
		direita = true;
		aparencia=3;
		x+=5;
		aparencia++;
		
		if(aparencia>5){
			aparencia=3;
		}
		if(x>570){
			x=570;
		}		
	}

	
public void moverEsquerda(){
		
		direita = false;
		
		aparencia=0;
		x-=4;
		aparencia++;
		
		if(aparencia>2){
			aparencia=0;
		}
		if(x<0){
			x=0;
		}
	}
	
	
public void atirar(){
		
		if(direita==true){
		aparencia=5;
		Tiro tiro = new Tiro(x+20, y);
		tiro.start();
		tiros.add(tiro);
		}
		else{
			aparencia=2;
			Tiro tiro = new Tiro(x, y-8);
			tiro.start();
			tiros.add(tiro);
		}
	}
	
public void checarTiro(){
		
		for (int i = 0; i < tiros.size(); i++) {
			if(tiros.get(i).getY() < 0){
				tiros.remove(i);
			}
		}		
	}
		
	
	public BufferedImage getImagemPersonagem() {
		return imagemPersonagem;
	}

	public int getX() {
		return x;
	}

	public ArrayList<Tiro> getTiro() {
		return tiros;
	}

	public Rectangle getAreaAluno() {
		areaAluno.setLocation(x, y);
		return areaAluno;
	}

	public int getAcertos() {
		return acertos;
	}

	public int getErros() {
		return erros;
	}
}