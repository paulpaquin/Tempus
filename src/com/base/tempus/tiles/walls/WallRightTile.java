package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallRightTile extends Tile {

	public WallRightTile(int id) {
		super(Assets.wallRight, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}