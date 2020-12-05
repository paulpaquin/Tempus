package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallParallelTile extends Tile {

	public WallParallelTile(int id) {
		super(Assets.wallParallel, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}