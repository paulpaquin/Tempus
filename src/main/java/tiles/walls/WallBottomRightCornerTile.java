package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallBottomRightCornerTile extends Tile {

	public WallBottomRightCornerTile(int id) {
		super(Assets.wallBottomRightCorner, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}