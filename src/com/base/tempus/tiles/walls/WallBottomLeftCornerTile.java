package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallBottomLeftCornerTile extends Tile {

	public WallBottomLeftCornerTile(int id) {
		super(Assets.wallBottomLeftCorner, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}