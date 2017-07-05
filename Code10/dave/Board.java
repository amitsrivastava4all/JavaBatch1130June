package com.bmpl.dave;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstant{
	Image bg;
	Player player;
	Timer timer;
	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		player = new Player();
		bg  = new ImageIcon(Board.class.getResource(BG_IMG)).getImage();
		gameLoop();
		
	}
	
	private void gameLoop(){
		timer= new Timer(GAME_SPEED, (e)->{
				repaint();
		});
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBackGround(g);
		player.drawPlayer(g);
	}
	
	public void drawBackGround(Graphics g){
		g.drawImage(bg, 0, 0, GAME_WIDTH, GAME_HEIGHT, null);
	}
}
