package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallTopRightTile extends Tile {

	public WallTopRightTile(int id) {
		super(Assets.wallTopRight, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}