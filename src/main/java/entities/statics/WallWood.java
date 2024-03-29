package main.java.entities.statics;

import java.awt.Graphics;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

import main.java.Handler;

public class WallWood extends StaticEntity {
	int openTimeFrame;
	boolean isShaded;
	

	public WallWood(Handler handler, float x, float y, int width, int height, int openTimeFrame, boolean isShaded) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.openTimeFrame = openTimeFrame;
		this.isShaded = isShaded;
		
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = 32*2;
		bounds.height = 32*2;
		
		this.health = -1;
	}
		

	@Override
	public void tick() {
		
		if(this.health == -1) {
			bounds.x = 0;
			bounds.y = 0;
			bounds.width = 32*2;
			bounds.height = 32*2;
		}else {
			if(handler.getWorld().getTimeFrame().getCurrentTimeFrame() < openTimeFrame) {
				bounds.x = 0;
				bounds.y = 0;
				bounds.width = 32*2;
				bounds.height = 32*2;
			}else {
				bounds.x = 0;
				bounds.y = 0;
				bounds.width = 0;
				bounds.height = 0;
			}
		}
	}
		
		

	@Override
	public void render(Graphics g) {
		if(this.health == -1 && handler.getWorld().getTimeFrame().getCurrentTimeFrame() >= openTimeFrame) {
			g.drawImage(Assets.wallWood, (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
		}else {
			if(isShaded){
				if(handler.getWorld().getTimeFrame().getCurrentTimeFrame() < openTimeFrame) {
					g.drawImage(Assets.wallBroken[2], (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
				}else {
					g.drawImage(Assets.wallBroken[3], (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
				}
			}else {
				if(!(handler.getWorld().getTimeFrame().getCurrentTimeFrame() < openTimeFrame)) {
					g.drawImage(Assets.wallBroken[1], (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
				}else {
					g.drawImage(Assets.wallBroken[0], (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
				}
			}
		}
	}

	@Override
	public void die() {
		
		
	}

}
