package main.java.mechanics;

import java.awt.Color;
import java.awt.Graphics;

import main.java.gfx.Assets;
import main.java.gfx.Text;

import main.java.Handler;

public class Dialogue {
	
	Handler handler;
	
	long lastDialogueTimer = 0;
	long dialogueDuration = 100000;
	long dialogueTimer = dialogueDuration;
	
	String currentDialogue = " ";
	boolean hasDisplayed = false;
	
	public Dialogue(Handler handler) {
		super();
		this.handler = handler;
	}
	
	public void tick() {

		dialogueTimer += System.currentTimeMillis() - lastDialogueTimer;
		//lastDialogueTimer = System.currentTimeMillis();
		//System.out.println(dialogueTimer);
		
		
		if(dialogueTimer>dialogueDuration) {
			hasDisplayed = true;
		}else {
			hasDisplayed = false;
		}
	}
	
	public void render(Graphics g) {
		if(!hasDisplayed) {
			g.setColor(Color.BLUE);
			g.fillRect(0, 380, 640, 100);
			g.setColor(Color.BLACK);
			g.fillRect(20, 390, 600, 80);
			Text.drawString(g, currentDialogue, 40, 460, false, Color.BLUE, Assets.font16);
		}
		
	}
	
	public void setDialogue(String newDialogue) {
		lastDialogueTimer = System.currentTimeMillis();
		currentDialogue = newDialogue;
		dialogueTimer = 0;
		hasDisplayed = false;
	}



}
