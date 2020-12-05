package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallTopRightCornerTile extends Tile {

	public WallTopRightCornerTile(int id) {
		super(Assets.wallTopRightCorner, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}