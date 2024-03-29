package main.java.entities.statics;

import java.awt.Graphics;

import main.java.gfx.Assets;
import main.java.inventory.Inventory;
import main.java.items.Item;
import main.java.tiles.Tile;

import main.java.Handler;

public class TimeAltar extends StaticEntity {

	public TimeAltar(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = 32*2;
		bounds.height = 32*2;
		
		this.health = -1;
	}
		

	@Override
	public void tick() {

		if(this.health == -2) {
			handler.getWorld().getEntityManager().getPlayer().getInventory().addItem(Item.timeHeart);
			handler.getWorld().getDialogue().setDialogue("I can feel the power of time in my hands");
			this.health--;
		}
	}
		
		

	@Override
	public void render(Graphics g) {
		if(this.health == -1) {
			g.drawImage(Assets.heartAltar[1], (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
		}else {
			g.drawImage(Assets.heartAltar[0], (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
		}
	}

	@Override
	public void die() {
		
		
	}

}
