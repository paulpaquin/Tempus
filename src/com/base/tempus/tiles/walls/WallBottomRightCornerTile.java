package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallBottomRightCornerTile extends Tile {

	public WallBottomRightCornerTile(int id) {
		super(Assets.wallBottomRightCorner, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}