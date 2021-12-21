package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallTopLeftCornerTile extends Tile {

	public WallTopLeftCornerTile(int id) {
		super(Assets.wallTopLeftCorner, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}