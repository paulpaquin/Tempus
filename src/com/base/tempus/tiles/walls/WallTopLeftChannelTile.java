package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallTopLeftChannelTile extends Tile {

	public WallTopLeftChannelTile(int id) {
		super(Assets.wallTopLeftChannel, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}