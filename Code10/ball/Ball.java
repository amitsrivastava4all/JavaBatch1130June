import java.awt.Color;
import java.awt.Graphics;

public class Ball implements GameConstants{
	private int x;
	private int y;
	private int w;
	private int h;
	private Color color;
	int xSpeed ;
	int ySpeed;
	public Ball(int x, int y){
		this.x = x;
		this.y = y;
		this.w = this.h = 10;
		//int randomHW = c.getRandom(200);
		//this.w = this.h = randomHW<30?30:randomHW;
		this.color = new Color(c.getRandomSpeed(MAX_COLOR), c.getRandomSpeed(MAX_COLOR), c.getRandomSpeed(MAX_COLOR));
		xSpeed = ySpeed = BALL_SPEED;
	}
	public void drawBall(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, w, h);
	}
	
	
	public void move(){
		x = x + xSpeed;
		 y = y + ySpeed;
		
	}
	
	CommonUtils c = new CommonUtils();
	public void changeDirection(){
		//System.out.println("CHANGE DIR X "+x+" Y is "+y);
		boolean isDirectionChange = false;
		if(x>=(GAME_WIDTH-10)){
			//xSpeed = -c.getRandomSpeed(5);
			xSpeed = -1;
			isDirectionChange = true;
		}
		else
		if(x<=0){
			xSpeed = 1;
			//xSpeed = c.getRandomSpeed(5);
			isDirectionChange = true;
		}
		if(y>=(GAME_HEIGHT-10)){
			ySpeed = -1;
			//ySpeed = -c.getRandomSpeed(5);
			isDirectionChange = true;
		}
		else
		if(y<=0){	
			ySpeed = 1;
			//ySpeed = c.getRandomSpeed(5);
			isDirectionChange = true;
		}
//		if(isDirectionChange){
//			 int randomHW = c.getRandom(200);
//			 this.w = this.h = randomHW<30?30:randomHW;
//		}
	}
	
	public String toString(){
		return "X is "+x+" and Y is "+y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	public CommonUtils getC() {
		return c;
	}
	public void setC(CommonUtils c) {
		this.c = c;
	}
	
	
}
