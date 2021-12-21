package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallBottomLeftCornerTile extends Tile {

	public WallBottomLeftCornerTile(int id) {
		super(Assets.wallBottomLeftCorner, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}