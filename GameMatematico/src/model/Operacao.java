package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Operacao extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private ImageIcon lousa;
	private static int time=20;
	protected static int a, b, c, d, e, f;
	protected String operacao = "";
	private Random rand;
	protected static Operacoes operacoes;
	private static String acertosAluno1="";
	private static String errosAluno1="";
	private static String acertosAluno2="";
	private static String errosAluno2="";
	
	static boolean mult;
	

	public Operacao() {
		setLayout(null);
		
		lousa = new ImageIcon(getClass().getResource("/lousa.png"));
		rand = new Random();
		
		
		operacoes = new Operacoes();
		operacoes.start();
				
	}
	
	public void paint(Graphics g){
		g.drawImage(lousa.getImage(),0, 0, this);
		g.setColor(Color.WHITE);
		g.setFont(new Font("",Font.PLAIN, 23));
		g.drawString("Tempo: " + Integer.toString(time), 100, 100);
		if((time==3)||(time==2)||(time==1)||(time==0)) {
			g.setColor(Color.RED);
			g.setFont(new Font("",Font.PLAIN, 20));
			g.drawString("Acabando o tempo!", 75, 180);
			
		}
		g.setFont(new Font("",Font.PLAIN, 18));
		g.drawString(operacao, 100, 150);
		g.setColor(Color.GREEN);
		g.setFont(new Font("",Font.PLAIN, 16));
		g.drawString("Acertos: ", 50, 320);
		g.drawString(acertosAluno1, 110, 320);
		g.setColor(Color.RED);
		g.drawString("Erros: ", 50, 340);
		g.drawString(errosAluno1, 110, 340);
		
		if(mult){
			g.setColor(Color.WHITE);
			g.setFont(new Font("",Font.PLAIN, 15));
			g.drawString("Player 1", 70, 300);
			g.drawString("Player 2", 70, 400);
			g.setColor(Color.GREEN);
			g.setFont(new Font("",Font.PLAIN, 12));
			g.drawString("Acertos: ", 50, 420);
			g.drawString(acertosAluno2, 110, 420);
			g.setColor(Color.RED);
			g.drawString("Erros: ", 50, 440);
			g.drawString(errosAluno2, 110, 440);
		}
		 
	}
	
	public static void acertosAluno1(int acerto){
		acertosAluno1 = "" + acerto;
	}
	public static void errosAluno1(int erro){
		errosAluno1 = "" + erro;
	}
	public static void acertosAluno2(int acerto){
		acertosAluno2 = "" + acerto;
	}
	public static void errosAluno2(int erro){
		errosAluno2 = "" + erro;
	}
	

	public void operacao(int op) {
		switch (op) {
		
		case 0:
			a = rand.nextInt(30);
			b = rand.nextInt(30);
			
				operacao =  a + " + " + b + " = ?";
				c = a+b;
				d = rand.nextInt(50);
				if(d==c) {
					d=rand.nextInt(50);
				}
				e= rand.nextInt(50);
				if(e==c) {
					e=rand.nextInt(50);
				}
				f= rand.nextInt(50);
				if(f==c) {
					f=rand.nextInt(50);
				}
			
			break;
		case 1:
			a = rand.nextInt(30);
			b = rand.nextInt(30);
			
			if(a<b){
				c = b-a;
				operacao =  b + " - " + a + " = ?";
			}
			else {
				c = a - b;
				operacao =  + a + " - " + b + " = ?";
			}
			
			d = rand.nextInt(50);
			if(d==c) {
				d=rand.nextInt(50);
			}
			e= rand.nextInt(50);
			if(e==c) {
				e=rand.nextInt(50);
			}
			f= rand.nextInt(50);
			if(e==c) {
				e=rand.nextInt(50);
			}
			break;
		
		}
	}
	public class Operacoes extends Thread {
		private boolean ativo = true;
		public int op =1;
		
		public void run() {
			while(ativo) {
				
				if(time == 20) {
					op = rand.nextInt(2);
					operacao(op);
				}
				time -= 1;
				if(time<0){
					time=20;
				}
				repaint();				
				
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}		
	}
	public static int getC() {
		return c;
	}

	public static int getTime() {
		return time;
	}

	public static int getD() {
		return d;
	}

	public static int getE() {
		return e;
	}

	public static int getF() {
		return f;
	}

	public static void setTime(int time) {
		Operacao.time = time;
	}

	public static Operacoes getOperacoes() {
		return operacoes;
	}

	public static void setMult(boolean mult) {
		Operacao.mult = mult;
	}
}
