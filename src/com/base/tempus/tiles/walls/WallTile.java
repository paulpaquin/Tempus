package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallTile extends Tile {

	public WallTile(int id) {
		super(Assets.wall, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}