package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallUpTile extends Tile {

	public WallUpTile(int id) {
		super(Assets.wallUp, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}