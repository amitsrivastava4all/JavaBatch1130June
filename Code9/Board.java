import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	CommonUtils c = new CommonUtils();
	Ball balls[] ;
	int noOfBalls ;
	public Board(int noOfBalls){
		this.noOfBalls = noOfBalls;
		balls = new Ball[noOfBalls];
		
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.BLACK);
		prepareBalls();
		gameLoop();
	}
	
	
	private void prepareBalls(){
		for(int i = 0; i<noOfBalls; i++){
			balls[i] = new Ball(c.getRandom(GAME_WIDTH), c.getRandom(GAME_HEIGHT));
		}
	}
	
	private void gameLoop(){
		
		Timer timer = new Timer(50,(ee)->{
			repaint();
			
		});
		timer.start();
	}
	
	
	
	
	
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBalls(g);
		checkCollision();
		
		
	}
	
	private boolean isCollision(Ball one, Ball two){
		int distanceX = Math.abs(one.getX() - two.getX());
		int distanceY = Math.abs(one.getY() - two.getY());
		return distanceX<=one.getW() && distanceY<=one.getH();
	}
	
	private void checkCollision(){
		for(int i = 0; i<balls.length - 1; i++){
			for(int j = i + 1; j<balls.length ; j++){
				if(isCollision(balls[i], balls[j])){
					balls[i].setxSpeed(balls[i].getxSpeed()*-1);
					balls[i].setySpeed(balls[i].getySpeed()*-1);
					balls[j].setxSpeed(balls[j].getxSpeed()*-1);
					balls[j].setySpeed(balls[j].getySpeed()*-1);
				}
			}
		}
	}
	
	private void drawBalls(Graphics g){
		for(Ball ball : balls){
			ball.drawBall(g);
			ball.move();
			ball.changeDirection();
			
		}
	}
}
