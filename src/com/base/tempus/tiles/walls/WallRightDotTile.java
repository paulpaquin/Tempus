package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallRightDotTile extends Tile {

	public WallRightDotTile(int id) {
		super(Assets.wallRightDot, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}