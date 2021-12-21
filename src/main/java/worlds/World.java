package main.java.worlds;

import java.awt.Graphics;

import main.java.entities.EntityManager;
import main.java.entities.creatures.Player;
import main.java.entities.statics.Door;
import main.java.entities.statics.DoorLocked;
import main.java.entities.statics.FloorHole;
import main.java.entities.statics.Key;
import main.java.entities.statics.TimeAltar;
import main.java.entities.statics.WallBroken;
import main.java.entities.statics.WallSmallHole;
import main.java.entities.statics.WallWood;
import main.java.items.ItemManager;
import main.java.mechanics.Dialogue;
import main.java.mechanics.TimeFrame;
import main.java.tiles.Tile;
import main.java.utils.Utils;

import main.java.Handler;

public class World {

	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	
	//Dialog
	private Dialogue dialogue;
	//Entities
	private EntityManager entityManager;
	//Item
	private ItemManager itemManager;
	//MECHANICS
	private TimeFrame timeFrame;
		
	public World(Handler handler, String path) {
		this.handler = handler;
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));
		itemManager = new ItemManager(handler);
		timeFrame = new TimeFrame(handler);
		dialogue = new Dialogue(handler);
		
		//ADD ENTITIES HERE
		//entityManager.addEntity(new Door(handler, 64*2, 64*3, width, height, -1, true));
		entityManager.addEntity(new Door(handler, 64*13, 64*11, width, height, 1, true));
		entityManager.addEntity(new Door(handler, 64*20, 64*11, width, height, 2, true));
		entityManager.addEntity(new Door(handler, 64*21, 64*21, width, height, 0, false));
		
		entityManager.addEntity(new DoorLocked(handler, 64*6, 64*11, width, height));
		entityManager.addEntity(new DoorLocked(handler, 64*41, 64*9, width, height));
		entityManager.addEntity(new DoorLocked(handler, 64*41, 64*6, width, height));
		entityManager.addEntity(new DoorLocked(handler, 64*31, 64*21, width, height));
		entityManager.addEntity(new DoorLocked(handler, 64*31, 64*25, width, height));
		
		entityManager.addEntity(new Key(handler, 300,  250, 32, 32));
		entityManager.addEntity(new Key(handler, 64*26,  250, 32, 32));
		entityManager.addEntity(new Key(handler, 64*38,  64*18, 32, 32));
		entityManager.addEntity(new Key(handler, 64*14,  64*4, 32, 32));
		entityManager.addEntity(new Key(handler, 64*21, 64*19, 32, 32));
		
		entityManager.addEntity(new WallWood(handler, 64*6, 64*7, width, height, 1, false));
		entityManager.addEntity(new WallWood(handler, 64*23, 64*7, width, height, 1, true));
		
		entityManager.addEntity(new TimeAltar(handler, 64*41, (int)(64*2.5), width, height));
		
		entityManager.addEntity(new WallSmallHole(handler, 64*13, 64*7, width, height, false));
		entityManager.addEntity(new WallSmallHole(handler, 64*17, 64*7, width, height, false));
		entityManager.addEntity(new WallSmallHole(handler, 64*30, 64*28, width, height, false));

		entityManager.addEntity(new FloorHole(handler, 64*13, 64*10, width, height, 1, true));
		entityManager.addEntity(new FloorHole(handler, 64*29, 64*23, width, height, 2, false));
		entityManager.addEntity(new FloorHole(handler, 64*28,  64*23, width, height, 1, false));
		entityManager.addEntity(new FloorHole(handler, 64*26, 64*23, width, height, 0, false));
		
		entityManager.addEntity(new WallBroken(handler, 64*30, 64*17, width, height, 2, false));
		
		//entityManager.addEntity(new Stone(handler, 100, 250, width, height));
		//entityManager.addEntity(new Stone(handler, 150, 250, width, height));
		//entityManager.addEntity(new Stone(handler, 200, 250, width, height));
		//entityManager.addEntity(new Stone(handler, 250, 250, width, height));
		
//		itemManager.addItem(Item.key.createNew(64*26, 250));
//		itemManager.addItem(Item.key.createNew(300, 250));
//		itemManager.addItem(Item.key.createNew(310, 250));

		loadWorld(path);
		
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);
		
	}
		
	public void tick() {
		itemManager.tick();
		entityManager.tick();
		timeFrame.tick();
		dialogue.tick();
	}
		
	public void render(Graphics g) {
		int xStart = (int)Math.max(0, handler.getGameCamera().getxOffset()/Tile.TILEWIDTH);
		int yStart = (int)Math.max(0, handler.getGameCamera().getyOffset()/Tile.TILEHEIGHT);
		int xEnd = (int)Math.min(width-1, (handler.getGameCamera().getxOffset() + handler.getWidth())/Tile.TILEWIDTH)+1;
		int yEnd = (int)Math.min(height-1, (handler.getGameCamera().getyOffset() + handler.getHeight())/Tile.TILEHEIGHT)+1;
		
		for(int y = yStart; y<yEnd; y++) {
			for(int x = xStart; x<xEnd; x++) {
				getTile(x, y).render(handler, g, (int)(x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), (int)(y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), handler.getWorld().getTimeFrame().getCurrentTimeFrame());
			}

		}
		itemManager.render(g);
		entityManager.render(g);
		timeFrame.render(g);
		dialogue.render(g);
		
		
		
	}
		
	public Tile getTile(int x, int y) {
		if(x<0 || y<0 || x>=width || y>=height) {
			return Tile.floorTile;
		}
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.floorTile;
		return t;
	}
		
		
	private void loadWorld(String path) {
		
		path = System.getProperty("user.dir") + "/src/main/resources" + path;
		String file = Utils.loadFileAsString(path);
		
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0; y<height; y++) {
			for(int x = 0; x<width; x++) {
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public ItemManager getItemManager() {
		return itemManager;
	}

	public void setItemManager(ItemManager itemManager) {
		this.itemManager = itemManager;
	}

	public TimeFrame getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(TimeFrame timeFrame) {
		this.timeFrame = timeFrame;
	}

	public Dialogue getDialogue() {
		return dialogue;
	}

	public void setDialogue(Dialogue dialogue) {
		this.dialogue = dialogue;
	}
}

