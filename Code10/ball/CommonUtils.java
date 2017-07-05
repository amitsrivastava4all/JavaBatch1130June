import java.util.HashSet;
import java.util.Random;

public class CommonUtils {
	Random r = new Random();
	
	public int getRandom(int range){
		int speed = r.nextInt(Math.abs(range));
		//return r.nextInt(500) + 10;

//		if(speed>= 900 && speed<=700){
//			return 500;
//		}
//		if(speed>=600 && speed<=400){
//			return 400;
//		}
		return speed==0?1:speed;
	}
	public int getRandomSpeed(int range){
		int speed = r.nextInt(range);
		return speed==0?1:speed;
	}

}
