package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallRightTile extends Tile {

	public WallRightTile(int id) {
		super(Assets.wallRight, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}