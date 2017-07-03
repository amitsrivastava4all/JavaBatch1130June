import java.util.Random;

public class CommonUtils {
	Random r = new Random();
	public int getRandom(int range){
		int speed = r.nextInt(range);
		return speed==0?1:speed;
	}

}
