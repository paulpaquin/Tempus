package main.java.states;

import java.awt.Graphics;

import main.java.entities.creatures.Player;
import main.java.entities.statics.Stone;
import main.java.ui.UIManager;
import main.java.worlds.World;

import main.java.Handler;


public class GameState extends State{
	//private UIManager uiManager;
	//private State newMenuState;
	
	@SuppressWarnings("unused")
	private Player player;
	private World world;
	
	@SuppressWarnings("unused")
	private Stone stone;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "/worlds/world1.txt");
		handler.setWorld(world);
		player = new Player(handler, 100,100);
		stone = new Stone(handler, 100, 200, 0, 0);
		
		
		
	}

	@Override
	public void tick() {
		world.tick();
		
		if(handler.getKeyManager().escape) {
			
			State.setState(handler.getGame().menuState);
			//handler.getMouseManager().setUIManager(uiManager);
			return;
		}
		
		//System.out.println(handler.getWorld().getTimeFrame().getCurrentTimeFrame());
		//System.out.println(handler.getMouseManager().getWheelPosition());
		
	}

	@Override
	public void render(Graphics g) {
		
		world.render(g);
	}	
}
