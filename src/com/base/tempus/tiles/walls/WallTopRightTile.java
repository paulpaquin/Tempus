package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallTopRightTile extends Tile {

	public WallTopRightTile(int id) {
		super(Assets.wallTopRight, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}