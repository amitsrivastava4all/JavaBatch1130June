abstract interface IPlayer{
	int CURRENT_JUMP = 20;
	public static final int MAX_JUMP  = 100;
	int DEFAULT_SPEED = 10;
	int MAX_SPEED = 100;
	public abstract void jump();
	void run();
	void move();
	void exit();
	void dead();
}
abstract class CommonPlayer implements IPlayer{
	public void move(){
		System.out.println("Player is Moving...");
	}
	public void exit(){
		System.out.println("Player is Exit and Game is Over");
	}
	public void dead(){
		System.out.println("Player is Dead and Game is Over");
	}
}
interface IStarPlayer{
	void hide();
	void show();
}
class RedPlayer extends CommonPlayer implements IPlayer,IStarPlayer{
	int currentJump= CURRENT_JUMP;
	int currentSpeed  = DEFAULT_SPEED;
	@Override
	public void jump(){
		if(currentJump<MAX_JUMP){
			currentJump++;
		}
	}
	@Override
	public void run(){
		if(currentSpeed<MAX_SPEED){
			currentSpeed+=5;
		}
	}
	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
