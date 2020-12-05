package com.base.tempus.entities.statics;

import java.awt.Graphics;

import com.base.tempus.Handler;
import com.base.tempus.gfx.Assets;
import com.base.tempus.items.Item;

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
