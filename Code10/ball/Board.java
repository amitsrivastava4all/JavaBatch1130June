import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	CommonUtils c = new CommonUtils();
	ArrayList<Ball> balls ;
	//Ball balls[] ;
	int noOfBalls ;
	public Board(int noOfBalls){
		this.noOfBalls = noOfBalls;
		//balls = new Ball[noOfBalls];
		balls = new ArrayList<>(noOfBalls);
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.BLACK);
		prepareBalls();
		gameLoop();
	}
	
	
	private void prepareBalls(){
		for(int i = 0; i<noOfBalls; i++){
			int x = c.getRandom(GAME_WIDTH);
			int y = c.getRandom(GAME_HEIGHT);
			System.out.println("X is "+x+" and Y is "+y);
			
			
			balls.add(new Ball(x,y));
			//balls[i] = new Ball(c.getRandom(GAME_WIDTH), c.getRandom(GAME_HEIGHT));
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
	
		for(int i = 0; i<balls.size() - 1; i++){
			for(int j = i + 1; j<balls.size() ; j++){
				if(isCollision(balls.get(i), balls.get(j))){
					if(balls.size()<=10000){
					balls.add(new Ball(c.getRandom(GAME_WIDTH), c.getRandom(GAME_HEIGHT)));
					balls.add(new Ball(c.getRandom(GAME_WIDTH), c.getRandom(GAME_HEIGHT)));
					}
					/*balls.get(i).setX(c.getRandom(GAME_WIDTH));
					balls.get(i).setY(c.getRandom(GAME_HEIGHT));
					balls.get(j).setX(c.getRandom(GAME_WIDTH));
					balls.get(j).setY(c.getRandom(GAME_HEIGHT));*/
					//System.out.println("COLLISION "+balls.get(i)+" "+balls.get(j));
					int rand = 0;
					if(balls.get(i).getxSpeed()<=0){
						rand = c.getRandom((balls.get(i).getxSpeed() * -2));
					}
					else
					{
						rand = c.getRandom((balls.get(i).getxSpeed()));
						rand *= -2;
					}
					balls.get(i).setxSpeed(c.getRandom(rand));
					if(balls.get(i).getySpeed()<=0){
						rand = c.getRandom((balls.get(i).getySpeed() * -2));
					}
					else
					{
						rand = c.getRandom((balls.get(i).getySpeed()));
						rand *= -2;
					}
					balls.get(i).setySpeed(rand);
					if(balls.get(j).getxSpeed()<=0){
						rand = c.getRandom((balls.get(j).getxSpeed() * -1));
					}
					else
					{
						rand = c.getRandom((balls.get(j).getxSpeed()));
						rand *= -2;
					}
					balls.get(j).setxSpeed(rand);
					if(balls.get(j).getySpeed()<=0){
						rand = c.getRandom((balls.get(j).getySpeed() * -1));
					}
					else
					{
						rand = c.getRandom((balls.get(j).getySpeed()));
						rand *= -1;
					}
					balls.get(j).setySpeed(rand);
					//System.out.println("Collision "+balls.size());
					
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
