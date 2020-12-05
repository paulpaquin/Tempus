package com.base.tempus.entities.statics;

import java.awt.Graphics;

import com.base.tempus.Handler;
import com.base.tempus.gfx.Assets;
import com.base.tempus.items.Item;
import com.base.tempus.tiles.Tile;

public class Stone extends StaticEntity {

	public Stone(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, Tile.TILEHEIGHT, Tile.TILEWIDTH);
		
		bounds.x = 10;
		bounds.y = 30;
		bounds.width = 45;
		bounds.height = 25;
		
	}

	@Override
	public void tick() {
		
	}
	
	@Override
	public void die() {
	//	handler.getWorld().getItemManager().addItem(Item.rockItem.createNew((int)x, (int)y));
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.stone, (int)(x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), width, height, null);
	}

}
