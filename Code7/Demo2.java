import java.io.File;

import jaco.mp3.player.MP3Player;

public class Demo2 {
static int counter;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//c:\\songs\\xyz.mp3
//		File file = new File("/Users/amit/Documents/songs/pop.mp3");
//		MP3Player mp3 = new MP3Player(file);
//		mp3.play();
//		Thread.sleep(9000);
		counter++;
		System.out.println("Main Call "+counter);
		main(null);
	}

}
