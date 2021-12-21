package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallTopRightCornerTile extends Tile {

	public WallTopRightCornerTile(int id) {
		super(Assets.wallTopRightCorner, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}