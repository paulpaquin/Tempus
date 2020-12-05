package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallLeftTile extends Tile {

	public WallLeftTile(int id) {
		super(Assets.wallLeft, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}