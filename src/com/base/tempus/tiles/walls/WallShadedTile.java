package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallShadedTile extends Tile {

	public WallShadedTile(int id) {
		super(Assets.wallShaded, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}