package main.java.entities.statics;

import java.awt.Graphics;

import main.java.gfx.Assets;
import main.java.items.Item;
import main.java.mechanics.TimeFrame;
import main.java.tiles.Tile;

import main.java.Handler;

public class WallSmallHole extends StaticEntity {
	boolean isShaded;

	public WallSmallHole(Handler handler, float x, float y, int width, int height, boolean isShaded) {
		super(handler, x, y, Tile.TILEHEIGHT, Tile.TILEWIDTH);
		this.isShaded = isShaded;
		
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = Tile.TILEWIDTH;
		bounds.height = Tile.TILEWIDTH;
		this.health = -1;
		
	}

	@Override
	public void tick() {
		if(handler.getWorld().getTimeFrame().getCurrentTimeFrame() == TimeFrame.TIMEFRAME_MIN) {
			bounds.x = 0;
			bounds.y = 0;
			bounds.width = 0;
			bounds.height = 0;
		}else {
			bounds.x = 0;
			bounds.y = 0;
			bounds.width = Tile.TILEWIDTH;
			bounds.height = Tile.TILEHEIGHT;
		}
	}
	
	@Override
	public void die() {

	}

	@Override
	public void render(Graphics g) {
		if(isShaded) {
			g.drawImage(Assets.wallSmallHole[1], (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);

		}else {
			g.drawImage(Assets.wallSmallHole[0], (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);

		}
	}

}
