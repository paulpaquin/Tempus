package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallLeftDotTile extends Tile {

	public WallLeftDotTile(int id) {
		super(Assets.wallLeftDot, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}