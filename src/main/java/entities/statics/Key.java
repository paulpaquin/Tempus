package main.java.entities.statics;

import java.awt.Graphics;

import main.java.gfx.Assets;
import main.java.items.Item;

import main.java.Handler;

public class Key extends StaticEntity {

	public Key(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, 32, 32);
		this.health = 1;
	}

	@Override
	public void tick() {
		if(handler.getWorld().getEntityManager().getPlayer().getCollisionBounds(0f, 0f).intersects(bounds)) {
			die();
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.key, (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
		
	}

	@Override
	public void die() {
		handler.getWorld().getEntityManager().getPlayer().getInventory().addItem(Item.createNew(1, Item.key));
	
		
	}

}
