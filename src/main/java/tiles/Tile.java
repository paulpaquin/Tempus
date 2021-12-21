package main.java.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import main.java.gfx.Assets;
import main.java.tiles.floor.FloorBrokenTile;
import main.java.tiles.floor.FloorShadedBrokenTile;
import main.java.tiles.floor.FloorShadedTile;
import main.java.tiles.floor.FloorTile;
import main.java.tiles.walls.WallBottomLeftCornerTile;
import main.java.tiles.walls.WallBottomRightCornerTile;
import main.java.tiles.walls.WallLeftDotTile;
import main.java.tiles.walls.WallLeftTile;
import main.java.tiles.walls.WallParallelCornersTile;
import main.java.tiles.walls.WallParallelTile;
import main.java.tiles.walls.WallRightDotTile;
import main.java.tiles.walls.WallRightTile;
import main.java.tiles.walls.WallShadedTile;
import main.java.tiles.walls.WallTile;
import main.java.tiles.walls.WallTopLeftChannelTile;
import main.java.tiles.walls.WallTopLeftCornerTile;
import main.java.tiles.walls.WallTopLeftTile;
import main.java.tiles.walls.WallTopRightChannelTile;
import main.java.tiles.walls.WallTopRightCornerTile;
import main.java.tiles.walls.WallTopRightTile;
import main.java.tiles.walls.WallUpTile;
import main.java.tiles.walls.WallUpsideDownUTile;

import main.java.Handler;

public class Tile {
//	private Handler handler;
	
	//STATIC
	
	public static Tile[] tiles = new Tile[256];
	public static Tile blankTile = new BlankTile(0);
	public static Tile floorTile = new FloorTile(1);
	public static Tile floorShadedTile = new FloorShadedTile(2);
	public static Tile floorBrokenTile = new FloorBrokenTile(3);
	public static Tile floorShadedBrokenTile = new FloorShadedBrokenTile(4);
	
	public static Tile wallTile = new WallTile(5);
	public static Tile wallShadedTile = new WallShadedTile(6);
	public static Tile wallLeftTile = new WallLeftTile(7);
	public static Tile wallUpTile = new WallUpTile(8);
	public static Tile wallRightTile = new WallRightTile(9);
	public static Tile wallBottomLeftCornerTile = new WallBottomLeftCornerTile(10);
	public static Tile wallTopLeftCornerTile = new WallTopLeftCornerTile(11);
	public static Tile wallTopRightCornerTile = new WallTopRightCornerTile(12);
	public static Tile wallBottomRightCornerTile = new WallBottomRightCornerTile(13);
	public static Tile wallTopRightTile = new WallTopRightTile(14);
	public static Tile wallParallelTile = new WallParallelTile(15);
	public static Tile wallUpsideDownUTile = new WallUpsideDownUTile(16);
	public static Tile wallTopLeftTile = new WallTopLeftTile(17);
	public static Tile wallTopRightChannelTile = new WallTopRightChannelTile(18);
	public static Tile wallTopLeftChannelTile = new WallTopLeftChannelTile(19);
	public static Tile wallLeftDot = new WallLeftDotTile(20);
	public static Tile wallRightDot = new WallRightDotTile(21);
	public static Tile wallParallelCornersTile = new WallParallelCornersTile(22);
	
	public static Tile grassTile = new GrassTile(23);
	
	public static Tile dirtTile = new DirtTile(255);
	
	//CLASS
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	protected int currentTimeFrame;
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick() {
		
	}
	
	public void render(Handler handler, Graphics g, int x, int y, int currentTimeFrame){
		//this.handler = handler;
		this.currentTimeFrame = currentTimeFrame;
		if(id == 255) {
			texture = dynamicDirt(handler);
		}
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid() {
		return false;
//		if(id == 1 && currentTimeFrame >= 2) {
//			return true;
//		}else {
//			return false;
//		}
	}
	
	public int getID() {
		return id;
	}
	
	//Dynamic Tile Selectors
	public BufferedImage dynamicDirt(Handler handler) {
		if(handler.getWorld().getTimeFrame().getCurrentTimeFrame()>=2) {
			return Assets.dirtTest[0];
		}else {
			return Assets.dirtTest[1];
		}
		
	}
}
