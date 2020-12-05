package com.base.tempus.tiles.walls;

import com.base.tempus.gfx.Assets;
import com.base.tempus.tiles.Tile;

public class WallUpsideDownUTile extends Tile {

	public WallUpsideDownUTile(int id) {
		super(Assets.wallUpsideDownU, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}