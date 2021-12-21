package main.java.entities.statics;

import java.awt.Graphics;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

import main.java.Handler;

public class FloorHole extends StaticEntity {
	int openTimeFrame;
	boolean isActiveOnce;
	

	public FloorHole(Handler handler, float x, float y, int width, int height, int openTimeFrame, boolean isActiveOnce) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.openTimeFrame = openTimeFrame;
		this.isActiveOnce = isActiveOnce;
		
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = 32*2;
		bounds.height = 8*2;
		
		this.health = -1;
	}
		

	@Override
	public void tick() {
		if(isActiveOnce) {
			if(handler.getWorld().getTimeFrame().getCurrentTimeFrame() == openTimeFrame) {
				bounds.x = 3*2;
				bounds.y = 5*2;
				bounds.width = 20*2;
				bounds.height = 16*2;
			}else {
				bounds.x = 0;
				bounds.y = 0*2;
				bounds.width = 0*2;
				bounds.height = 0;
			}
		}else {
			if(!(handler.getWorld().getTimeFrame().getCurrentTimeFrame() == openTimeFrame)) {
				bounds.x = 3*2;
				bounds.y = 5*2;
				bounds.width = 20*2;
				bounds.height = 16*2;
			}else {
				bounds.x = 0;
				bounds.y = 0*2;
				bounds.width = 0*2;
				bounds.height = 0;
			}
		}
	}
		
		

	@Override
	public void render(Graphics g) {
		if(isActiveOnce){
			if(handler.getWorld().getTimeFrame().getCurrentTimeFrame() == openTimeFrame) {
				g.drawImage(Assets.floorHole, (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
			}else {
				g.drawImage(null, (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
			}
		}else {
			if(!(handler.getWorld().getTimeFrame().getCurrentTimeFrame() == openTimeFrame)) {
				g.drawImage(Assets.floorHole, (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
			}else {
				g.drawImage(null, (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
			}
		}
		

		
	}

	@Override
	public void die() {
		
		
	}

}
