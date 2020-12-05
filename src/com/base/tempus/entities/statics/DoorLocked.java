package com.base.tempus.entities.statics;

import java.awt.Graphics;

import com.base.tempus.Handler;
import com.base.tempus.gfx.Assets;
import com.base.tempus.items.Item;
import com.base.tempus.mechanics.Dialogue;
import com.base.tempus.tiles.Tile;

public class DoorLocked extends StaticEntity {
	
	
	boolean isOpened = false;
	
	public DoorLocked(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 0;
		bounds.y = 24*2;
		bounds.width = 32*2;
		bounds.height = 8*2;
		
		
		this.health = -1;
	}
		

	@Override
	public void tick() {
		if(!isOpened) {
			if(this.health == -2) {
				System.out.println(this.health);
			//	if(Item.key.getCount()>0){
				if(handler.getWorld().getEntityManager().getPlayer().getInventory().inventoryItems.contains(Item.key)) {
					
					//Item.key.setCount(Item.key.getCount()-1);
					handler.getWorld().getEntityManager().getPlayer().getInventory().removeItem(Item.key);
					
					this.health = -3;
					isOpened = true;
				}else {
					this.health = -1;
				}
			}
		}

		
		if(isOpened) {
			bounds.x = 24*2;
			bounds.y = 0;
			bounds.width = 0;
			bounds.height = 0;
		}
	}
		
		
		
		

	@Override
	public void render(Graphics g) {
		if(isOpened) {
			g.drawImage(Assets.doorLocked[1], (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
			
		}else {
			g.drawImage(Assets.doorLocked[0], (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
		
		}
		

		
	}

	@Override
	public void die() {
		
		
	}

}
