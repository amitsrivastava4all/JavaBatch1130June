package com.bmpl.dave;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstant {
	int acc;
	
	public Player(){
		speed = 0;
		x = 166;
		h = w = 100;
		y = FLOOR - (h + 10);
		img = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	
	public void fall(){
		if(y<(FLOOR-(h+10))){
			acc = acc + GRAVITY;
			y += acc;
		}
		if(y>=(FLOOR-(h+10))){
			y  =(FLOOR-(h+10));
			isJump = false;
		}
	}
	private boolean isJump;
	public void jump(){
		if(!isJump){
		 acc = -15;
		 y+=acc;
		isJump = true;
		}
	}
	
	public void move(){
		x +=speed;
	}
	
	public void drawPlayer(Graphics g){
		g.drawImage(img, x, y, w, h, null);
	}

}
