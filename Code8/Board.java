import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.BLACK);
		gameLoop();
	}
	
	private void gameLoop(){
		
		Timer timer = new Timer(50,(ee)->{
			repaint();
			move();	
			changeDirection();
		});
		timer.start();
	}
	int x = 100;
	int y = 100;
	int xSpeed = 10;
	int ySpeed = 10;
	private void move(){
		x = x + xSpeed;
		 y = y + ySpeed;
	}
	CommonUtils c = new CommonUtils();
	private void changeDirection(){
		if(x>=(GAME_WIDTH-50)){
			xSpeed = -c.getRandom(20);
		}
		else
		if(x<=0){
			xSpeed = c.getRandom(20);
		}
		if(y>=(GAME_HEIGHT-50)){
			ySpeed = -c.getRandom(10);
		}
		else
		if(y<=0){	
			ySpeed = c.getRandom(30);
		}
	}
	
	private void drawBall(Graphics g){
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 50, 50);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBall(g);
		
		
	}
}
