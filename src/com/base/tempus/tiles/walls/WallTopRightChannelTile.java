package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallTopRightChannelTile extends Tile {

	public WallTopRightChannelTile(int id) {
		super(Assets.wallTopRightChannel, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}