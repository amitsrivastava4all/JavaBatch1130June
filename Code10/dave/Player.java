package com.bmpl.dave;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstant {
	public Player(){
		x = 166;
		h = w = 100;
		y = FLOOR - (h + 10);
		img = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	
	public void drawPlayer(Graphics g){
		g.drawImage(img, x, y, w, h, null);
	}

}
