package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallTopLeftCornerTile extends Tile {

	public WallTopLeftCornerTile(int id) {
		super(Assets.wallTopLeftCorner, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}