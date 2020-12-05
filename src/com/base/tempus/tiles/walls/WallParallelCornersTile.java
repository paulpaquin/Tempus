package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallParallelCornersTile extends Tile {

	public WallParallelCornersTile(int id) {
		super(Assets.wallParallelCorners, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}