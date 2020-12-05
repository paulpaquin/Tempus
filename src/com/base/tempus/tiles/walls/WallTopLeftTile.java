package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallTopLeftTile extends Tile {

	public WallTopLeftTile(int id) {
		super(Assets.wallTopLeft, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}