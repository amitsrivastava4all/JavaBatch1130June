import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants {

	public GameFrame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Board board = new Board();
		setResizable(false);
		setTitle("GAME-2017");
		add(board);
		setVisible(true);
		//setLocation(100, 100);
	}
	public static void main(String[] args) {
		GameFrame obj= new GameFrame();
		

	}

}
