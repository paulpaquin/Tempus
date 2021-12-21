package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallRightDotTile extends Tile {

	public WallRightDotTile(int id) {
		super(Assets.wallRightDot, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}